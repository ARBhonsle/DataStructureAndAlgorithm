package com.linkedlist;

/**
 * Interface with methods for performing Linked List operations
 *
 * @param <K>
 */
public interface INode<K> {
    // method to get variable key value
    K getKey();

    // method to set variable key value
    void setKey(K key);

    // method to get next node
    INode<K> getNext();

    // method to set next node
    void setNext(INode<K> next);

}
