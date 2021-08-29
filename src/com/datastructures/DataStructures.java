package com.datastructures;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class DataStructures {
    public String outpath = "D:\\JavaBasicPrograms\\untitled\\JavaOOPsPrograms\\DatastructuresAndAlgorithm\\src\\resources\\OutputFile.txt";
    public String inpath = "D:\\JavaBasicPrograms\\untitled\\JavaOOPsPrograms\\DatastructuresAndAlgorithm\\src\\resources\\OutputFile.txt";
    public BufferedReader br;
    public BufferedWriter bw;
    public Scanner sc;

    public DataStructures() throws IOException {
        br = new BufferedReader(new FileReader(inpath));
        bw = new BufferedWriter(new FileWriter(outpath));
        sc = new Scanner(System.in);
    }

    public <T> void searchWord(T[] arr, T word) throws IOException {

        boolean flag = false;
        ArrayList<T> wordList = new ArrayList<>();
        for (T str : arr) {
            if (str.equals(word)) {
                flag = true;
            } else {
                wordList.add(str);
            }
        }
        System.out.println("Given word found: " + flag);
        if (!flag) {
            wordList.add(word);
        }
        for (Object str : wordList.toArray()) {
            bw.write(str + " ");
            System.out.print(str + " ");
        }
    }

    public void main(String[] args) throws IOException {
        // Welcome message
        DataStructures ds = new DataStructures();
        System.out.println("Welcome to Data Structures Problems");
        String[] arr = ds.br.readLine().split(" ");
        for (String str : arr) {
            System.out.print(str + " ");
        }
        System.out.println("\nGive word :");
        String word = ds.sc.next();
        searchWord(arr, word);
    }
}
