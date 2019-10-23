package com.datastructures.stack;
import com.datastructures.stack.ListStack;
class StackResult {
    public static void main(String args []){
        ListStack <String> mylist =  new ListStack<String>(10);
        mylist.push("salam");
        mylist.push("sagol");
        mylist.push("wouww");
        String poped = mylist.pop();
        System.out.println(poped);
        System.out.println(mylist.peek());
    }
}