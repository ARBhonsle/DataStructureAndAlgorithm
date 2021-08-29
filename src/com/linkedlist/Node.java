package com.linkedlist;

/**
 * Node of Linked List with implementation of interface methods
 *
 * @param <K>
 */
public class Node<K> implements INode<K> {
    // variable
    private K key;
    private INode<K> next;

    // constructor
    public Node(K key) {
        this.key = key;
        this.next = null;
    }

    // method to get key value
    @Override
    public K getKey() {
        return key;
    }

    // method to set key value
    @Override
    public void setKey(K key) {
        this.key = key;
    }

    // method to get next node
    public INode<K> getNext() {
        return next;
    }

    // method to set next node
    public void setNext(INode<K> next) {
        this.next = next;
    }
}
