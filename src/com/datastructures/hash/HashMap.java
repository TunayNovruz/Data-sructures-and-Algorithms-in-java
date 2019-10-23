package com.datastructures.hash;

import java.util.LinkedList;
import java.util.ListIterator;

class HashMap<E,T>{
    int size =0 ;
    int capacity;
    LinkedList<T> [] map  ;

    HashMap(int capacity){
        this.capacity = capacity;
        map = new LinkedList[capacity];
    }

    void insert (E key ,T value){
        int  hash = getHash(key);
        if(size == capacity){
            throw new IllegalArgumentException("map overflow");        
        }
        if(map[hash] == null){
            //collusion yoxdur
            map[hash] = new LinkedList<T>();
            map[hash].add(value);
        }else{
            ListIterator<T> iterator = map[hash].listIterator();
            while( iterator.hasNext()) {
                if(iterator.equals(value)){
                    //bu value artiq daxil edilib
                    iterator.set(value);
                    return;
                }            
            }
            map[hash].add(value);           
        }
        size++;
    }

    int getHash(E key){
        int hash = key.hashCode()%this.capacity;
        if(hash <0) hash *=-1;
        return hash;
    }

    void displayMap(){
        for (int i = 0; i < capacity; i++) {
            if(map[i] != null){
                System.out.println(map[i].toString());
            }
        }
    }

}