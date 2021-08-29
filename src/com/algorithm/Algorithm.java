package com.algorithm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Algorithm class executed methods to solve
 * 1.word search using binary search algorithm,
 * 2. insertion sort to sort array
 * 3. bubble sort
 * 4. merge sort
 * 5. anagram check
 * 6. find prime number within range
 * 7. checks if primes found within range is palindrome and anagrams
 */
public class Algorithm {
    // reusable static object for scanner class
    public static Scanner scan = new Scanner(System.in);
    // variable
    static int[] arr = {1, 25, -34, 5, 2, 21, -4, 15, 23, 3};

    /* display array */
    static void displayArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    /* method to read file f and return string array of file f contents */
    public static String[] readFile(File f) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(f));
        ArrayList<String> strList = new ArrayList<>();
        String[] wordList = br.readLine().split(" ");
        for ( String str : wordList) {
            strList.add(str);
        }
        String[] strArr=new String[strList.size()];
        int i=0;
        for (String string : strList){
            strArr[i]=string;i++;
        }
        return strArr;
    }

    // Word Search using Binary Search
    public static void wordSearch(String[] str) {
        System.out.println("\nInput word to be searched: ");
        String s = scan.next();
        int n = BinarySearch.binarySearch(str, s);
        if (n > 0) {
            System.out.println("Found in list");
        } else {
            System.out.println("Not Found in list");
        }
    }

    // Insertion Sort
    public static void insertionSort(int[] arr) {
        InsertionSort sort = new InsertionSort();
        displayArray(arr);
        sort.insertionSort(arr);
        displayArray(arr);
    }

    // BubbleSort
    public static void bubbleSort(int[] arr) {
        BubbleSort sort = new BubbleSort();
        displayArray(arr);
        sort.bubbleSort(arr);
        displayArray(arr);
    }

    // Merge Sort
    public static void mergeSort(int[] arr) {
        MergeSort sort = new MergeSort();
        displayArray(arr);
        sort.mergeSort(arr, 0, arr.length - 1);
        displayArray(arr);
    }

    // Anagram Check
    public static void anagramCheck(String str1, String str2) {
        AnagramChecker anagram = new AnagramChecker();
        if(anagram.isAnagram(str1.toCharArray(), str2.toCharArray())){
            System.out.println("Strings are anagrams: "+str1+" "+str2);
        }else{
            System.out.println("Strings are not anagrams: "+str1+" "+str2);
        }
    }

    // find Prime Number up to given number
    public static void findPrimeNumber(int number) {
        PrimeNumbers primeNumbers = new PrimeNumbers();
        primeNumbers.findPrimeNumbers(number);
    }
    public static void checkIfPrimeIsPalindromeAndAnagram(int number){
        PrimeNumbers primeNumbers = new PrimeNumbers();
        primeNumbers.findPrimeNumbers(number);
        primeNumbers.primeIsAnagramAndPalindrome();
    }
    public static void main(String[] args) {
        // Welcome message
        System.out.println("Welcome to Algorithm Problems");
        System.out.println("Choose option: 1.Word Search 2.Insertion Sort 3.Bubble Sort");
        System.out.println(" 4.Merge Sort 5. Anagram Detection");
        int option = scan.nextInt();
        switch (option) {
            case 1:
                try {
                    File file = new File("src/resources/WordSearchFile.txt");
                    String[] str = readFile(file);
                    System.out.println("Displaying word list:");
                    for (String s : str) {
                        System.out.print(s + " ");
                    }
                    System.out.println("Searching word in array using binary search");
                    wordSearch(str);
                } catch (Exception e) {
                    System.out.println(e);
                }
                break;
            case 2:
                System.out.println("Insertion Sort");
                insertionSort(arr);
                break;
            case 3:
                System.out.println("Bubble Sort");
                bubbleSort(arr);
                break;
            case 4:
                System.out.println("Merge Sort");
                mergeSort(arr);
                break;
            case 5:
                System.out.println("Anagram Check");
                System.out.println("Give Two String input:");
                String[] str = new String[2];
                str[0] = scan.next();
                str[1] = scan.next();
                anagramCheck(str[0], str[1]);
                break;
            case 6:
                System.out.println("Prime Numbers in 0-1000 range");
                findPrimeNumber(1000);
            case 7:
                System.out.println("Check if primes in range (0-1000) are anagrams and palindromes:");
                checkIfPrimeIsPalindromeAndAnagram(1000);
            default:
                System.out.println("Incorrect Input");
                break;
        }
    }
}

