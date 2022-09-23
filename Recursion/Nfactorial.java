package Recursion;
/* Recursion is function calling itself for a smaller input
it works on the principle of mathematical induction in which we have three steps
we take a base case,then assume a step right before the last case as hypothesis now we do not question this
as how it is going to work.
then we prove the question using this hypothesis.
 */
import java.util.Scanner;
public class Nfactorial {
    public static int fact(int i) {

        if (i == 0) {
            return 1;   //this is base case
        }
        int smalloutput = fact(i-1); //fact(i )calling fact(i-1) so when we go to line return factorial we return to this line 15.
        int factorial = i * smalloutput;
        return factorial;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        int n= fact(input);
        System.out.println(n);
    }
}
