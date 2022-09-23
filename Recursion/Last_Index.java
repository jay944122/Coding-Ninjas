package Recursion;
/*Given an array of length N and an integer x, you need to find and return the last index of integer x present in the array. Return -1 if it is not present in the array.
Last index means - if x is present multiple times in the array, return the index at which x comes last in the array.
You should start traversing your array from 0, not from (N - 1).
Do this recursively. Indexing in the array starts from 0.*/

//THIS IS AN IMPORTANT APPROACH TO THIS QUESTION*****//
public class Last_Index {
    public static int lastIndex(int a[], int x) {
        if (a.length == 0) {  //Base condition
            return -1;
        }
        int small_array[] = new int[a.length - 1];
        for (int i = 1; i < a.length; i++) { // making a copy from index 1
            small_array[i - 1] = a[i];
        }
        int k = lastIndex(small_array, x);  /*THIS IS THE CATCH ,This statement is an assumption we do not question
                                  this that how it is going to return the last index we assume it returns as long as we give input
                                 the next step would be based on this assumption.NO matter what we do not question this.*/
        if (k != -1) { // we got index we return that .
            return k;
        } else {
            if (a[0] == x) {  // checking first position in a[]
                return 0;
            } else {
                return -1;
            }
        }

    }

    // ****Using starting index approach
    public static int lastIndex(int a[], int x, int si) {
        if (si == a.length) {  //Base condition
            return -1;
        }
        int k = lastIndex(a, x, si + 1);
        if (k != -1) { // we got index we return that .
            return k;
        } else {
            if (a[si] == x) {  // checking first index position in a[]
                return si;
            } else {
                return -1;
            }
        }
    }
}
