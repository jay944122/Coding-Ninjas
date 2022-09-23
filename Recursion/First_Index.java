package Recursion;
/*
Given an array of length N and an integer x, you need to find and return the first index of integer x present in the array. Return -1 if it is not present in the array.
First index means, the index of first occurrence of x in the input array.
Do this recursively. Indexing in the array starts from 0.*/

public class First_Index {
   //FIRST WAY with new array creation
    public static int firstIndex(int input[], int x) { //taking array and num as input
        if (input.length == 0) { //this means we scanned whole array for x and not found
            return -1;
        }
        if (input[0] == x) { //this is small calculation part in this if found in 1st pos of arr return 0;
            return 0;
        }
        int small_array[] = new int[input.length-1];
        for (int i=1;i< input.length;i++ ) {
            small_array[i - 1] = input[i];
        }
        int output = firstIndex(small_array, x);
        if (output == -1) {
            return -1;
        } else {
            return output+1;
            /*so here everytime function call happens length was pre decreased so index changes to 0
            when found so to make it its original val, we add 1 example take 3 7 5 9 7 6 5,if x= 5 first 0 pos check not 5 so
            dec arr then check at 0 pos not 5 so dec again check found 5 return 0 to previous func check if and else
            else executed and output inc by one return to prev so on

            */

        }

    }
}
