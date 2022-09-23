package Recursion;
import java.util.Scanner;
/*
Given the number 'n', write a code to print numbers from 1 to n in increasing order recursively.
Here the base case is 0 when n=0 we do not do anything we return nothing
i need to print upto n-1 is assumption
 */
public class PrintFirstN_natural {
    public  static void Print(int n) {
        if (n == 0) {
            return;
        }
        Print(n-1); // when we go to 0 we return here at the end of this statement that is this is executed
        Print(n);//This is for printing each number after recursion
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Print(n);
    }
}
