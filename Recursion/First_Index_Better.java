package Recursion;

public class First_Index_Better {
    public static int firstIndex(int input[], int x,int si) {
        if (si == input.length) {
            return -1;
        }
        if (input[si] == x) {
            return si;
        }
        int output = firstIndex(input, x, si + 1);
        return output;
    }

}
