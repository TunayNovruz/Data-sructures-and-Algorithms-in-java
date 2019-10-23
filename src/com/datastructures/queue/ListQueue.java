package com.datastructures.queue;

class ListQueue <E> {
    Node <E> first;
    Node <E> last; 
    int size;
    int maxSize = Integer.MAX_VALUE;

    class Node <T> {
        Node <T> next;
        T data;
        Node(T value){
            data = value;
        }
    }

    void enqueue(E data){
        Node <E> newNode = new Node <E>(data);
        if(first == null){
            first = newNode;
            last = first;        
        }else{
            last.next = newNode;
            last = newNode;
        }
        size++;
    }

    E dequeue(){
        if(first == null){
            return null;
        }else{
            Node <E> temp = first;
            first = first.next;
            size--;
            return temp.data;
        }
    }

    E peek(){
        if(last == null){
            return null;
        }
        return last.data;
    }

}