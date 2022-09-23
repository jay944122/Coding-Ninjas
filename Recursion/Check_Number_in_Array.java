package Recursion;

public class Check_Number_in_Array {
    public static Boolean checkNumber(int input[], int x) {
        if (input.length == 1) {
            if (input[0] == x) {
                return true;
            } else {
                return false;
            }
        }
        int small_array[] = new int[input.length - 1];
        for (int i = 1; i < input.length; i++) {
            small_array[i - 1] = input[i];
        }
        if (input[0] == x) { // this is to check if 2nd part has element
           return true;
        }
        Boolean output_2 = checkNumber(small_array, x);
        if (output_2 == true) {
            return true;      // this statement is executed multiple time so as to answer every function call when found true
        }
        if (input[0] == x) {
            return true;
        }
        return false;

    }
}
