package Recursion;
/*Given an array of length N, you need to find and return the sum of all elements of the array.
Do this recursively.*/
public class SumOfArray {
    public static int sum(int input[]) {
        if (input.length == 1) {
            return input[0];
        }
        int small_array[]=new int[input.length-1];
        for (int i=1;i<input.length;i++) {
            small_array[i - 1] = input[i];
        }
        int output= input[0]+sum(small_array);/* the moment function call happens
        ur small_array becomes the next input and new small array is created so
        so if u take testcase[1,2,3,4] after first function call input[0]becomes 2 then next 3 so on
        */
        return output;
    }
}
