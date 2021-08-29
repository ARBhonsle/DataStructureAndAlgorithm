package com.algorithm;

import java.util.Arrays;

/**
 * Anagram Checker checks if given two string are anagrams by
 *  1. lengths of both strings same else not anagram
 *  2. frequency of each character in both strings same else not anagram
 */
public class AnagramChecker {
    // method checks if given string inputs are anagrams or not
    public boolean isAnagram(char[] str1, char[] str2)
    {
        int length1 = str1.length;
        int length2 = str2.length;

        if (length1 != length2){
            return false;
        }

        Arrays.sort(str1);
        Arrays.sort(str2);

        for (int i = 0; i < length1; i++)
            if (str1[i] != str2[i]){
                return false;
            }
        return true;
    }
}
