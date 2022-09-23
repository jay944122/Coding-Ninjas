package Recursion;
/*Fibonacci num f(n)= f(n-1)+f(n-2)
our base case should be when n= 1 or 2 return 1 this is done to get correct fibonacci num
cuz if we give only one input we cannot we cannot calculate fib num.
*/
import java.util.Scanner;
public class FibonacciNumber {
    public static int fibonacci(int n) {
        if (n == 1 || n == 2) { //HERE N=0 and N=-1 is not our base case when we call 3 it calls 2 and 1
            // at this point we return 1. Here n represents 1st and second number  when we say n=1 or n=2
            return 1;
        }
        int fibn_1 = fibonacci(n - 1);
        int fibn_2 = fibonacci(n - 2);
        int output = fibn_1 + fibn_2;
        return output;

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int num=fibonacci(n);
        System.out.println(num);
    }
}
