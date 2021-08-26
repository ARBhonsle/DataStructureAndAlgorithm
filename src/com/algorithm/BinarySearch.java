package com.algorithm;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Binary Search a word from list of words in file
 */

public class BinarySearch {

    /* method to read file f and return string array of file f contents */
    public static String[] readFile(File f) throws IOException {
        String word = "";
        ArrayList<String> s1 = new ArrayList<String>();
        FileReader fr = new FileReader(f);
        int c;
        while ((c = fr.read()) != -1) {
            if (c == 32) {
                s1.add(word);
                word = "";
            } else {
                word = word + String.valueOf((char) c);
            }
        }
        fr.close();
        String[] s = new String[s1.size()];
        s1.toArray(s);
        return s;
    }
    /* Input of String array and string to be searched and returns valid index else -1 */
    public static int binarySearch(String[] arr, String s) {
        int high = arr.length - 1, low = 0, mid;
        Arrays.sort(arr);

        while (low <= high) {
            mid = (high + low) / 2;
            if (s.equalsIgnoreCase(arr[mid])) {
                return mid;
            } else if (arr[mid].compareToIgnoreCase(s) < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
