package com.queue;

import com.linkedlist.MyLinkedList;
import com.linkedlist.Node;

/**
 * OrderedListAbstract Operations
 */
public class MyQueue<T> {
    MyLinkedList<T> linkedList;

    public MyQueue() {
        linkedList = new MyLinkedList<T>();
    }

    public void enQueue(T key) {
        linkedList.appendNode(new Node<T>(key));
    }

    public void display() {
        linkedList.displayLinkedList();
    }

    public void deQueue() {
        linkedList.pop();
    }

    public static void main(String[] args) {
        System.out.println("OrderedListAbstract Operations");
        // MyQueue object created
        MyQueue<Integer> queue = new MyQueue<>();
        System.out.println("Add node 56, 30, 70 to queue");
        queue.enQueue(56);
        queue.enQueue(30);
        queue.enQueue(70);
        System.out.println("OrderedListAbstract : ");
        queue.display();
        System.out.println("OrderedListAbstract dequeue operation for : First element");
        queue.deQueue();
        queue.display();
        System.out.println("Second element");
        queue.deQueue();
        queue.display();
        System.out.println("Third element");
        queue.deQueue();
        queue.display();
    }
}
