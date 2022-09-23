package Recursion;
//The below is the first way refer second way to improve space complexity.
/*we are checking if array is sorted or not
* we consider a base case as, if length is 1 we return 1 as array with one element is sorted
* we compare 1st element of array with second element ,if 1st<2nd we return true as assume
our hypothesis here as n-1 length is sorted */
public class isSorted {
    //first way to do this
    public  static Boolean CheckArraySorted(int a[]) {
        if (a.length == 1) {
            return true;
        }
        if (a[0]>a[1]) { //we are checking everytime the length of array is decreased by one
            return false;
        }
        int smallArray[] = new int[a.length - 1];
        for (int i = 1; i < a.length; i++) { // copying
            smallArray[i-1]=a[i];
        }
        Boolean isSmallArraySorted = CheckArraySorted(smallArray);
        return isSmallArraySorted;
    }
    // second way:

    public static Boolean CheckArraySorted2(int a[],int si) { // Here si means starting index
        if (si == a.length - 1) {
            return true;
        }
        if (a[si] > a[si + 1]) {
            return false;
        }
        Boolean isSmallArraysorted=CheckArraySorted2(a,si+1);
        return isSmallArraysorted;
    }
}
