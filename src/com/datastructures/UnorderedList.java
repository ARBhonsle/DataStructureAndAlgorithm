package com.datastructures;

import com.algorithm.Algorithm;
import com.linkedlist.*;

import java.io.*;
import java.util.Scanner;

public class UnorderedList<K> {
    static String[] strArray;
    MyLinkedList<K> myLinkedList;
    static Scanner sc = new Scanner(System.in);

    public UnorderedList() {
        myLinkedList = new MyLinkedList<>();
    }

    public static <K> void writeFile(File file, K[] word) {
        try {
            FileWriter writer = new FileWriter(file, false);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            for (K value : word) {
                bufferedWriter.write(" " + (String) value);
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String[] read(File file) throws IOException {
        return Algorithm.readFile(file);
    }

    public MyLinkedList<K> getList(File file) {
        try {
            strArray = Algorithm.readFile(file);
            for (String strValue : strArray) {
                INode<K> temp = new Node<K>((K) strValue);
                myLinkedList.appendNode(temp);
            }

        } catch (IOException exception) {
            System.out.println(exception);
        }
        return myLinkedList;
    }

    public static void main(String[] args) throws IOException {
        File file = new File("D:\\JavaBasicPrograms\\untitled\\JavaOOPsPrograms\\DatastructuresAndAlgorithm\\src\\resources\\WordSearchFile.txt");
        UnorderedList<String> list = new UnorderedList<>();
        list.getList(file);
        System.out.println("Enter: word");
        String word = sc.next();
        INode<String> node = list.myLinkedList.searchNode(word);
        if(node==null){
            list.myLinkedList.appendNode(new Node<String>(word));
        } else {
            list.myLinkedList.deleteNode(word);
        }
    }

}
