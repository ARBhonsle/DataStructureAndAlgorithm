package com.datastructures;

import com.algorithm.Algorithm;
import com.linkedlist.MyLinkedList;
import com.linkedlist.Node;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;

public class HashingFunction {
    public static void main(String[] args) throws IOException {
        int n = 11;
        MyLinkedList<Integer>[] hashNumbers=new MyLinkedList[n];
        File file = new File("D:\\JavaBasicPrograms\\untitled\\JavaOOPsPrograms\\DatastructuresAndAlgorithm\\src\\resources\\NumberList.txt");
        String[] list = Algorithm.readFile(file);
        for(String num : list){
            int val=Math.abs(Integer.parseInt(num));
            if(hashNumbers[val%n]==null) {
                hashNumbers[val%n] = new MyLinkedList<Integer>();
            }
            hashNumbers[val % n].appendNode(new Node<>(val));
        }
        for (int i=0;i<n;i++){
            System.out.print(i+":");
            if(hashNumbers[i]!= null){
                hashNumbers[i].displayLinkedList();
            }
            else{
                System.out.print("null");
            }
            System.out.println();
        }
    }
}
