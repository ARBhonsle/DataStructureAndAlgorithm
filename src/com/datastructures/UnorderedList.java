package com.datastructures;

import com.algorithm.Algorithm;
import com.linkedlist.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class UnorderedList<K> {
    static String[] strArray;
    MyLinkedList<K> myLinkedList;

    public UnorderedList() {
        myLinkedList = new MyLinkedList<>();
    }

    public static <K> void writeFile(File file, K[] word) {
        try {
            FileWriter writer = new FileWriter(file, false);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            for (K value : word) {
                if (value == null) {
                    value = (K) "";
                }
                bufferedWriter.write(" " + (String) value);
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String[] readFile(File file) throws IOException {
        return Algorithm.readFile(file);
    }

    public MyLinkedList<K> getList(String[] arr, File file) {
        try {
            String[] str = Algorithm.readFile(file);
            for (String strValue : str) {
                INode<K> temp = new Node<K>((K) strValue);
                myLinkedList.appendNode(temp);
            }

        } catch (IOException exception) {
            System.out.println(exception);
        }
        return myLinkedList;
    }
}
