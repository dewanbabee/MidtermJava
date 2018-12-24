package algorithm;

import java.util.Arrays;

public class Sort {

    long executionTime = 0;
	/*
	 * Please implement all the sorting algorithm. Feel free to add helper methods.
	 * Store all the sorted data into one of the databases.
	 */


    public int[] selectionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;

        for(int j=0; j<array.length-1; j++){
            int min = j;
            for(int i=j+1; i<array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here

        if(array.length<=1)
            System.out.println("Array is alraedy Sorted");

        for(int i=0;i<array.length;i++)
        {
            for(int j = i; j>0 ; j--)
            {
                if(array[j-1] > array[j])
                {
                    int temp = array[j];
                    array[j]= array[j-1];
                    array[j-1] = temp;

                }

            }
        }
//        for(int i =0;i<myArray.length;i++)
//            System.out.println(myArray[i]);


        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here

        if(array.length<=1)
            System.out.println("Array is alraedy Sorted");

        for(int i=0;i<array.length;i++)
        {
            for(int j = 0; j< array.length-1; j++)
            {
                if(array[j] > array[j+1])
                {
                    int temp = array[j];
                    array[j]= array[j+1];
                    array[j+1] = temp;

                }

            }
        }





        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
    

    public int [] mergeSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;

        msort(array,0,array.length -1);
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    // Main method that sorts arr[l..r] using
    // merge()
    void msort(int arr[], int l, int r)
    {
        if (l < r)
        {
            // Find the middle point
            int m = (l+r)/2;

            // Sort first and second halves
            msort(arr, l, m);
            msort(arr , m+1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }
  // this method is used by merge sort
    void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int L[] = new int [n1];
        int R[] = new int [n2];

        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i)
            L[i] = arr[l + i];
        for (int j=0; j<n2; ++j)
            R[j] = arr[m + 1+ j];

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }


    public int [] quickSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;


            int n = array.length;

            qsort(array, 0, n-1);



        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    int qspartition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] <= pivot)
            {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    /* The main function that implements QuickSort()
          arr[] --> Array to be sorted,
          low  --> Starting index,
          high  --> Ending index */
    void qsort(int arr[], int low, int high)
    {
        if (low < high)
        {
            /* pi is partitioning index, arr[pi] is
              now at right place */
            int pi = qspartition(arr, low, high);

            // Recursively sort elements before
            // partition and after partition
            qsort(arr, low, pi-1);
            qsort(arr, pi+1, high);
        }
    }




    public int [] heapSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;

        hsort(array);

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public void hsort(int arr[])
    {
        int n = arr.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // One by one extract an element from heap
        for (int i=n-1; i>=0; i--)
        {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
    void heapify(int arr[], int n, int i)
    {
        int largest = i; // Initialize largest as root
        int l = 2*i + 1; // left = 2*i + 1
        int r = 2*i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < n && arr[l] > arr[largest])
            largest = l;

        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest])
            largest = r;

        // If largest is not root
        if (largest != i)
        {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }


    public int [] bucketSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here

        // Bucket Sort
        int maxValue = maxValue(array);
        int[] Bucket = new int[maxValue + 1];


        for (int i = 0; i < array.length; i++)
            Bucket[array[i]]++;

        int outPos = 0;
        for (int i = 0; i < Bucket.length; i++)
            for (int j = 0; j < Bucket[i]; j++)
                array[outPos++] = i;







        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;

        return list;
    }

    static int maxValue(int[] sequence)
    {
        int maxValue = 0;
        for (int i = 0; i < sequence.length; i++)
            if (sequence[i] > maxValue)
                maxValue = sequence[i];
        return maxValue;
    }
    
    public int [] shellSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;

       int n = array.length;

        // Start with a big gap, then reduce the gap
        for (int gap = n/2; gap > 0; gap /= 2)
        {
            // Do a gapped insertion sort for this gap size.
            // The first gap elements a[0..gap-1] are already
            // in gapped order keep adding one more element
            // until the entire array is gap sorted
            for (int i = gap; i < n; i += 1)
            {
                // add a[i] to the elements that have been gap
                // sorted save a[i] in temp and make a hole at
                // position i
                int temp = array[i];

                // shift earlier gap-sorted elements up until
                // the correct location for a[i] is found
                int j;
                for (j = i; j >= gap && array[j - gap] > temp; j -= gap)
                    array[j] = array[j - gap];

                // put temp (the original a[i]) in its correct
                // location
                array[j] = temp;
            }
        }




        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
