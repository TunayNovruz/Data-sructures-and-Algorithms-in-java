package com.datastructures.stack;
import com.datastructures.stack.StackNode;

class ListStack <E> {
    StackNode <E> top;
    int size;
    int maxSize = Integer.MAX_VALUE;

    ListStack (int maxSize){
        this.maxSize = maxSize;
    }

    public void push(E data){
        StackNode <E> newNode = new StackNode <E>(data);
        if(size == maxSize){
            //stack doldu
            return;
        }
        if(top == null){
            top = newNode;
        }else{
            StackNode<E> temp = top;
            top = newNode;
            top.next = temp;
        }
        size++;         
    }

    public E pop(){
        StackNode<E> temp = top;
         top = top.next;
         size--;
         return temp.data;
    }

    public E peek(){
        if(top == null) return null;
        else return top.data;
    }


}
