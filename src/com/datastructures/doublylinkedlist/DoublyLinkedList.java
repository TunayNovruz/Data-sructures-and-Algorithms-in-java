package com.datastructures.doublylinkedlist;
import com.datastructures.doublylinkedlist.DoublyListNode;

public class DoublyLinkedList <T> {
    DoublyListNode <T> root;   
    DoublyListNode <T> tail;
    int size = 0 ;  
    
    void add(T data){
        DoublyListNode<T> newNode =  new DoublyListNode<T>(data);
        if(root == null){
            root = newNode;
            tail = root;
        }else{
            // Birinci yol 
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;

            // ikinci ve uzun  yol
            /* 
                DoublyListNode<T> temp = root;
                while(temp.next != null){
                    temp = temp.next;
                }
                newNode.prev = temp;
                temp.next = newNode;
                tail = temp.next;
            */            
        }
        size++;
    }

    void printList(){
        DoublyListNode<T> temp = root;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    T get(int index){
        T result = null;
        DoublyListNode<T> temp = root;
        for(int i =0;temp != null; i++){
            if(i == index){
                result = temp.data;
                break;
            }
            temp = temp.next;
        }
        return result;
    }

    void printTraverse(){
        DoublyListNode <T> temp = tail;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.prev;
        }
    }

    T remove(int index){
        T result = null ;
        if(size == 0){
            return null;
        }
        if(index == 0){
            result  = root.data;
            root = root.next;
            root.prev = null;
        }
        else if(index == size-1){
            result  = tail.data;
            tail.prev.next = null;
            tail= tail.prev;            
        }else{
            DoublyListNode <T> temp = root;
            for(int i =0;temp.next != null; i++){
                if(i == index){
                    result = temp.data;
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                    break;
                }
                
                temp = temp.next;
            }

        }
        size--;
        return result;
    }

}