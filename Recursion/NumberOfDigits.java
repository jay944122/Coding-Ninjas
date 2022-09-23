package Recursion;

import java.util.Scanner;

/*
Given the number 'n', find out and return the number of digits present in a number recursively.
Here the base case is n=0 ,if n=0 then there are no digits so we should return zero
 */
public class NumberOfDigits {
    public static int count(int n) {
        if (n == 0) {
            return 0;
        }
        int small_output=count(n/10);
        int output = small_output + 1; //so when we reach n=0 small output =0 then output will be 1 then increased by 1 when n=1
        return output;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int result= count(n);
        System.out.println(result);
    }

}
