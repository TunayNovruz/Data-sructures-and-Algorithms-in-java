package com.datastructures.doublylinkedlist;

public class DoublyListNode <E> {
    DoublyListNode<E> prev;
    DoublyListNode<E> next;
    E data;

    DoublyListNode (E value){
        data = value;
    }
}