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

    public static String[] readFile(File file) throws IOException {
        return Algorithm.readFile(file);
    }

    public void main(String[] args){
        try{
            File file = new File("D:\\JavaBasicPrograms\\untitled\\JavaOOPsPrograms\\DatastructuresAndAlgorithm\\src\\resources\\Stack.txt");
            String[] str=Algorithm.readFile(file);
            for (String strValue : str){
                if(str.equals("(")) {
                    stack.push((K) strValue);
                }else{
                    stack.pop();
                }
            }
            if(stack.isEmpty()){
                System.out.println("Equation is balanced");
            } else {
                System.out.println("Equation is not balanced");
            }
        }catch (IOException exception){
            System.out.println(exception);
        }
    }
}
