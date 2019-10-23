package com.datastructures.linkedlist;
import com.datastructures.linkedlist.ListNode;

public class LinkedList <T> {
    ListNode<T> root;
    int size = 0 ;
    

    void add(T data){
        ListNode<T> newNode= new ListNode<T>(data);
        if(root == null){
            root = newNode;
        }else{
            ListNode<T> temp  = root;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }          
        size++;
    }

    T remove(int index){
        T removedItem = null;
        if(index == 0){
            removedItem = root.data;
            root = root.next;
        }
        else{
            ListNode<T> temp = root;
            int i =0 ;    
            while(temp != null){
                if(i+1 == index && index<=size-1){
                    removedItem = temp.next.data;
                    temp.next = temp.next.next;            
                    break;
                }
                temp = temp.next;
                i++;
            }
        }
        size--;
        return removedItem;
    }

    T get(int index ){    
        ListNode<T> temp = root;
        T result = null ;
        int i = 0 ;
        while(temp != null){
            if(i == index){
                result = temp.data;
                break;
            }        
            temp = temp.next;
            i++;
        }
        return result;
    }
}