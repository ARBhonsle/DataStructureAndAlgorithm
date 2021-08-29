package com.algorithm;

/**
 * Insertion sort for sorting array elements
 */
public class InsertionSort {

    void insertionSort(int arr[])
    {
        int length = arr.length;
        for (int i = 1; i < length; ++i) {
            int value = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > value) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = value;
        }
    }
}
