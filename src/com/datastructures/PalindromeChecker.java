package com.datastructures;

import com.deque.Deque;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Deque<Character> charArray = new Deque<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Give word");
        String word = sc.next();
        for (Character c : word.toCharArray()){
            charArray.addAtHead(c);
        }
        while (!charArray.isEmpty() && charArray.peekHead() == charArray.peekTail()  ){
            charArray.deleteAtHead();
            charArray.deleteAtTail();
        }
        if(charArray.isEmpty()){
            System.out.println("Given word "+word+" is palindrome");
        }else {
            System.out.println("Given word "+word+" is not palindrome");
        }
    }
}
