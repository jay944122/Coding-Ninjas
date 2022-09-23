package Recursion;
import java.util.Scanner;
public class SumOfFirstN {
    public static int SumOfFirstN(int i) {

        if (i == 0) {
            return 0;   //this is base case
        }
        int smalloutput = SumOfFirstN(i-1);
        int Sum_Of_First_N_Natural = i +smalloutput;
        return Sum_Of_First_N_Natural;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        int n= SumOfFirstN(input);
        System.out.println(n);
    }
}
