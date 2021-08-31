package com.datastructures;

import com.algorithm.Algorithm;
import com.linkedlist.INode;
import com.orderedLinkedList.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class OrderedListAbstract<K extends Comparable<K>> {
    static String[] strArray;
    orderedLinkedList<K> orderedlist;
    static Scanner sc = new Scanner(System.in);

    public OrderedListAbstract() {
        orderedlist = new orderedLinkedList<K>();
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

    public orderedLinkedList<K> getList(File file) {
        try {
            strArray = Algorithm.readFile(file);
            for (String strValue : strArray) {
                orderedlist.orderedInsert((K)strValue);
            }

        } catch (IOException exception) {
            System.out.println(exception);
        }
        return orderedlist;
    }

    public static void main(String[] args) throws IOException {
        File file = new File("D:\\JavaBasicPrograms\\untitled\\JavaOOPsPrograms\\DatastructuresAndAlgorithm\\src\\resources\\NumberList.txt");
        OrderedListAbstract<String> list = new OrderedListAbstract<>();
        list.getList(file);
        System.out.println("Enter: word");
        String word = sc.next();
        INode<String> node = list.orderedlist.searchNode(word);
        if(node==null){
            list.orderedlist.orderedInsert(word);
        } else {
            list.orderedlist.deleteNode(word);
        }
    }

}
