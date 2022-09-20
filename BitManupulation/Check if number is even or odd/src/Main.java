// Problem Statement
/* Given a number , calcuate if the number is even or odd */

// Hint
    /*
    lets say
        a number is even then if we write that number in binary form , then the leftmost Digit will be 0
        a number is odd then if we write that number in binary form , then the leftmost Digit will be 1

     So we will exploit this observation

     1 & 1 = 1                  X & 1 = X
     1 & 0 = 0                  x & 0 = 0
     0 & 0 = 0

     eg lets numvber be 10 ---- in binary 1010

     1  0   1   0       ------- >    10
   & 0  0   0   1       ------->    1
   -----------------------
     0  0   0   0       --------->   if value is 0n then its even elsse odd
     */
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        if (isOdd(number)){
            System.out.print("odd");
        }
        else {
            System.out.print("Even");
        }


    }
    private static boolean isOdd(int num) {

        if ((num & 1) == 0){
            return false;
        }
        else{
            return true;

        }
    }
}
