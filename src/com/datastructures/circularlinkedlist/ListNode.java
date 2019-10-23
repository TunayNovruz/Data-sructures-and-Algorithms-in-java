package com.datastructures.circularlinkedlist;
class ListNode<O>{
    ListNode <O> prev;
    ListNode <O> next;
    O data;
    ListNode(O value){
        data = value;
    }
}