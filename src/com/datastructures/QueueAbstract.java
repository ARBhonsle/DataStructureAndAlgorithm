package com.datastructures;

import com.algorithm.Algorithm;
import com.queue.MyQueue;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class QueueAbstract<K> {
    static String[] strArray;
    MyQueue<K> queue;

    public QueueAbstract(){
        queue = new MyQueue<K>();
    }

    public static <K> void writeFile(File file, K[] word) {
        try {
            FileWriter writer = new FileWriter(file, false);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            for(K value: word){
                bufferedWriter.write(" "+(String) value);
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String[] readFile(File file) throws IOException {
        return Algorithm.readFile(file);
    }

    public MyQueue<K> getList(String[] arr, File file){
        try{
            String[] str=Algorithm.readFile(file);
            for (String strValue : str){
                queue.enQueue((K) strValue);
            }

        }catch (IOException exception){
            System.out.println(exception);
        }
        return queue;
    }
    
}
