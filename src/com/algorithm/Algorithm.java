package com.algorithm;
import java.io.File;
import java.util.Scanner;

/**
 *  Algorithm class executed methods to solve word search using binary search algorithm
 */
public class Algorithm {
    // reusable static object for scanner class
    public static Scanner scan = new Scanner(System.in);

    public static void wordSearch(){
        try {
            File file = new File("src/resources/WordSearchFile.txt");
            String str[] = BinarySearch.readFile(file);
            System.out.println("Displaying word list:");
            for (String s : str) {
                System.out.print(s+" ");
            }
            System.out.println("\nInput word to be searched: ");
            String s = scan.nextLine();
            int n = BinarySearch.binarySearch(str, s);
            if (n > 0) {
                System.out.println("Found in list");
            } else {
                System.out.println("Not Found in list");
            }
            scan.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
	    // Welcome message
        System.out.println("Welcome to Algorithm Problems");
        // Word Search using Binary Search
        System.out.println("Searching word in array using binary search");
        wordSearch();
    }
}
