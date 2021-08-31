package com.stack;

import com.linkedlist.INode;
import com.linkedlist.MyLinkedList;
import com.linkedlist.Node;

/**
 * Stack Operations
 */
public class MyStack<T> {
    MyLinkedList<T> linkedList;

    public MyStack() {
        linkedList = new MyLinkedList<T>();
    }

    public INode<T> createNode(T key) {
        return new Node<T>(key);
    }

    public void push(T key) {
        linkedList.addNode(createNode(key));
    }

    public void display() {
        linkedList.displayLinkedList();
    }

    public INode<T> peek() {
        return linkedList.head;
    }

    public void pop() {
        linkedList.pop();
    }

    public boolean isEmpty(){
        return linkedList.head==null;
    }

    public static void main(String[] args) {
        // MyStack object created
        System.out.println("Stack Operations");
        MyStack<Integer> stack = new MyStack<>();
        // elements pushed to stack
        System.out.println("56 pushed to stack");
        stack.push(56);
        System.out.println("30 pushed to stack");
        stack.push(30);
        System.out.println("70 pushed to stack");
        stack.push(70);
        System.out.println("Stack displayed");
        stack.display();
        System.out.println("Top Node : " + stack.peek().getKey());
        System.out.println("Pop stack elements: 70, 30, 56");
        stack.pop();
        stack.display();
        stack.pop();
        stack.display();
        stack.pop();
        stack.display();
    }
}
