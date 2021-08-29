package com.algorithm;

import java.util.Arrays;

/**
 * Binary Search a word from list of words in file
 */

public class BinarySearch {

    /* Input of String array and string to be searched and returns valid index else -1 */
    public static int binarySearch(String[] arr, String string) {
        int end = arr.length - 1, begin = 0, mid;
        Arrays.sort(arr);

        while (begin <= end) {
            mid = (end + begin) / 2;
            if (string.equalsIgnoreCase(arr[mid])) {
                return mid;
            } else if (arr[mid].compareToIgnoreCase(string) < 0) {
                begin = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
