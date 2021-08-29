package com.datastructures;

import com.algorithm.Algorithm;
import com.orderedLinkedList.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class OrderedListAbstract<K extends Comparable<K>> {
    static String[] strArray;
    orderedLinkedList<K> orderedlist;

    public OrderedListAbstract() {
        orderedlist = new orderedLinkedList<K>();
    }

    public void writeFile(File file, K[] word) {
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

    public static String[] readFile(File file) throws IOException {
        return Algorithm.readFile(file);
    }

    public orderedLinkedList<K> getList(String[] arr, File file) {
        try {
            String[] str = Algorithm.readFile(file);
            for (String strValue : str) {
                orderedlist.orderedInsert((K) strValue);
            }

        } catch (IOException exception) {
            System.out.println(exception);
        }
        return orderedlist;
    }
}
