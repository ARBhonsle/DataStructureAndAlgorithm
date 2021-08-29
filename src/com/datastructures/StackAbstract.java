package com.datastructures;

import com.algorithm.Algorithm;
import com.stack.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class StackAbstract<K> {
    static String[] strArray;
    MyStack<K> stack;

    public StackAbstract(){
        stack = new MyStack<K>();
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

    public MyStack<K> getList(String[] arr, File file){
        try{
            String[] str=Algorithm.readFile(file);
            for (String strValue : str){
                stack.push((K)strValue);
            }

        }catch (IOException exception){
            System.out.println(exception);
        }
        return stack;
    }
}
