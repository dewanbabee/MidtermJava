package algorithm;

import org.testng.Assert;

public class UnitTestSorting {

    /*
      This class is about Unit testing for Sorting Algorithm.
     */

    public static void main(String[] args) {
        int[] tempArray = {6,9,2,5,1,0,4};
        int [] unSortedArray = {6,9,2,5,1,0,4};
        int [] sortedArray =   {0,1,2,4,5,6,9};
        //Create Sort object
        Sort sort = new Sort();
        //apply unsorted array to selectionSort.
        sort.selectionSort(unSortedArray);
        //verify if the unsorted array is sorted by the selection sort algorithm.
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "Array is not Sorted");
        }catch(Exception ex){
            ex.getMessage();
        }

        //Now implement Unit test for rest of the soring algorithm...................below
        unSortedArray = tempArray;     //to make the array unsorted again
        sort.bubbleSort(unSortedArray);
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "Tesing Bubble Sort: Array is not Sorted");
        }catch(Exception ex){
            ex.getMessage();
        }

        unSortedArray = tempArray;  //to make the array unsorted again
         sort.mergeSort(unSortedArray);
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "Array is not Sorted");
        }catch(Exception ex){
            ex.getMessage();
        }

        unSortedArray = tempArray;
        sort.bubbleSort(unSortedArray);
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "Array is not Sorted");
        }catch(Exception ex){
            ex.getMessage();
        }

        unSortedArray = tempArray;     //to make the array unsorted again
        sort.quickSort(unSortedArray);
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "Array is not Sorted");
        }catch(Exception ex){
            ex.getMessage();
        }
        unSortedArray = tempArray;   ////to make the array unsorted again
        sort.bubbleSort(unSortedArray);
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "Array is not Sorted");
        }catch(Exception ex){
            ex.getMessage();
        }

    }
}