package Recursion;

import java.util.Scanner;

public class Power {
    public static int pow(int x,int n) {
        if (n == 0) { //need to consider 0 case incase of input as x=2 and n=0 we need to return 1
             return 1;
        }
        int small_output=pow(x,n-1);
        int output=x*small_output;
        return output;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int n = s.nextInt();
        int result= pow(x,n);
        System.out.println(result);
    }
}
