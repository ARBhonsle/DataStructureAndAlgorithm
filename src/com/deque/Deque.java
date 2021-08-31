package com.deque;

import com.linkedlist.INode;
import com.linkedlist.Node;


public class Deque<T> {
    INode<T> head, tail;

    public Deque() {
        head = null;
        tail = null;
    }

    public void addAtHead(T key) {
        INode<T> node = new Node<>(key);
        if (head == null) {
            tail = node;
        } else {
            node.setNext(head);
        }
        head = node;
    }

    public void addAtTail(T key) {
        INode<T> node = new Node<>(key);
        if (tail == null) {
            head = node;
        } else {
            node.setNext(tail.getNext());
        }
        tail = node;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void deleteAtHead() {
        if (head != null && head.getNext() != null) {
            head = head.getNext();
        } else {
            head = tail = null;
        }
    }

    public void deleteAtTail() {
        INode<T> temp = head;
        if (tail == head) {
            head = null;
            tail = null;
        }
        if (head != null) {
            while (tail != null && temp.getNext() != tail) {
                temp = temp.getNext();
            }
            tail = temp;
            tail.setNext(null);
        }
    }

    public T peekHead() {
        return head.getKey();
    }

    public T peekTail() {
        return tail.getKey();
    }
}
