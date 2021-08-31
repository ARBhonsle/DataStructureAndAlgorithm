package com.generics;

import java.util.Arrays;

public class SortAlgorithms<T extends Comparable> {
    public <T> int binarySearch(T[] strArray, T string) {
        int end = strArray.length - 1, begin = 0, mid;
        Arrays.sort(strArray);

        while (begin <= end) {
            mid = (end + begin) / 2;
            if (string.toString().equalsIgnoreCase(strArray[mid].toString())) {
                return mid;
            } else if (strArray[mid].toString().compareToIgnoreCase(string.toString()) < 0) {
                begin = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public <T> void insertionSort(T[] arr) {
        int length = arr.length;
        for (int i = 1; i < length; ++i) {
            T value = arr[i];
            int j = i - 1;

            while (j >= 0 && (int) arr[j] > (int) value) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = value;
        }
    }

    public <T> void bubbleSort(T[] arr) {
        int length = arr.length;
        T temp;
        for (int i = 0; i < length; i++) {
            for (int j = 1; j < (length - i); j++) {
                if ((int) arr[j - 1] > (int) arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
/*
    public <T extends Comparable> void merge(T[] arr, T left, T mid, T right) {
        // Find sizes of two sub arrays to be merged
        int lengthLeft = (int) mid - (int) left + 1;
        int lengthRight = (int) right - (int) mid;

        // Create temp arrays
        T[] L = (T[]) Array.newInstance(new Class<T>,lengthLeft);
        T[] R = (T[]) Array.newInstance(new Class<T>,lengthRight);;

        //Copy data to temp arrays
        for (int i = 0; i < lengthLeft; ++i)
            L[i] =  arr[(int) left + i];
        for (int j = 0; j < lengthRight; ++j)
            R[j] =  arr[(int) mid + 1 + j];


        // Merge the temp arrays

        // Initial indexes of first and second sub arrays
        int i = 0, j = 0;

        // Initial index of merged sub array
        int k = (int) left;
        // sorting in original array
        while (i < lengthLeft && j < lengthRight) {
            if (L[i].compareTo(R[j]) < 0) { // <=
                 arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < lengthLeft) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < lengthRight) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public <T> void mergeSort(T[] arr) {

    }
    */

}
