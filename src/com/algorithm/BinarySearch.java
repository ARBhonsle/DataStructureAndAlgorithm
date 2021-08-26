package com.algorithm;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Binary Search a word from list of words in file
 */

public class BinarySearch {

    /* method to read file f and return string array of file f contents */
    public static String[] readFile(File f) throws IOException {
        String word = "";
        ArrayList<String> strList = new ArrayList<>();
        FileReader fileReader = new FileReader(f);
        int c;
        while ((c = fileReader.read()) != -1) {
            if (c == 32) {
                strList.add(word);
                word = "";
            } else {
                word = word + String.valueOf((char) c);
            }
        }
        fileReader.close();
        String[] s = new String[strList.size()];
        strList.toArray(s);
        return s;
    }

    /* Input of String array and string to be searched and returns valid index else -1 */
    public static int binarySearch(String[] arr, String s) {
        int end = arr.length - 1, begin = 0, mid;
        Arrays.sort(arr);

        while (begin <= end) {
            mid = (end + begin) / 2;
            if (s.equalsIgnoreCase(arr[mid])) {
                return mid;
            } else if (arr[mid].compareToIgnoreCase(s) < 0) {
                begin = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
