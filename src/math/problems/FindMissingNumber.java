package math.problems;

import java.util.Arrays;

/**
 * Created by mrahman on 04/22/17.
 */
public class FindMissingNumber {

    public static void main(String[] args) {
        /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Write static helper method to find it.
         */
         int [] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
         //int[] array = new int[]{5,10,4,1,7,3,9,6,8};



        // If first no or the last no is missing , they need to e taken care of , say 1 is missing or 10
        int n = array.length +1;
        int missingno = findmissing(array,n);
        System.out.println("MISSING ELEMENT " + missingno);

    }


    public static int findmissing(int[] a , int n) {
        Arrays.sort(a);
        int missingno=-1;
        if(a[0]!=1) return 1;
        if(a[a.length-1]!=n) return n;
        for (int i = 0; i < a.length - 1; i++)
            if (a[i + 1] != a[i] + 1)
                missingno=(a[i]+1);
        return missingno;


    }

    }

