package com.algorithm;

/**
 * Merge Sort to sort array elements by
 * splitting into two sub arrays L[], R[] by calculating mid
 * original array is copied into L[] and R[] and reassigned by
 * checking L[] and R[] elements in sorted order
 * this is repeated until start < end in sorting loop
 */
public class MergeSort {
    // Merges two sub arrays into original array into sorted order
    void merge(int arr[], int left, int mid, int right)
    {
        // Find sizes of two sub arrays to be merged
        int lengthLeft = mid - left + 1;
        int lengthRight = right - mid;

        /* Create temp arrays */
        int L[] = new int [lengthLeft];
        int R[] = new int [lengthRight];

        /*Copy data to temp arrays*/
        for (int i=0; i<lengthLeft; ++i)
            L[i] = arr[left + i];
        for (int j=0; j<lengthRight; ++j)
            R[j] = arr[mid + 1+ j];


        /* Merge the temp arrays */

        // Initial indexes of first and second sub arrays
        int i = 0, j = 0;

        // Initial index of merged sub array
        int k = left;
        // sorting in original array
        while (i < lengthLeft && j < lengthRight)
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
        while (i < lengthLeft)
        {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < lengthRight)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    // sorting array until start < end
    public void mergeSort(int[] arr, int start, int end){
        if (start < end)
        {
            // Find the middle point
            int m = (start+end)/2;

            // Sort first and second halves
            mergeSort(arr, start, m);
            mergeSort(arr , m+1, end);

            // Merge the sorted halves
            merge(arr, start, m, end);
        }
    }
}
