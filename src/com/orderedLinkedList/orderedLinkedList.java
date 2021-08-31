package com.orderedLinkedList;

import com.linkedlist.INode;
import com.linkedlist.MyLinkedList;

public class orderedLinkedList<T extends Comparable<T>>{
    MyLinkedList<T> linkedList;
    INode<T> head;

    public orderedLinkedList() {
        MyLinkedList<T> linkedList = new MyLinkedList<>();
        head = linkedList.head;
    }

    public void orderedInsert(T key) {
        INode<T> node = linkedList.createNode(key);
        boolean flag = false;
        if (head != null) {
            head = node;
        } else {
            INode<T> temp = head, tempPrev = null;
            while (temp.getNext() != null) {
                if (temp.getKey().compareTo(key) > 0) {
                    flag = true;
                    break;
                }
                tempPrev = temp;
                temp = temp.getNext();
            }
            if (flag && tempPrev != null) {
                node.setNext(temp);
                tempPrev.setNext(node);
            } else if (flag) {
                node.setNext(temp);
            }
        }
    }
    public INode<T> searchNode(T key){
       return linkedList.searchNode(key);
    }
    public void deleteNode(T key){
        linkedList.deleteNode(key);
    }
}
