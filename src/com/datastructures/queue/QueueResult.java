package com.datastructures.queue;
import com.datastructures.queue.ListQueue;

class QueueResult {
    public static  void main (String  [] args){
        ListQueue <Integer> queue = new ListQueue<Integer>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);    

        System.out.println("Elave olunduqdan sonra : ");
        System.out.println(queue.first.data);
        System.out.println(queue.last.data);

        int removed  = queue.dequeue();
        System.out.println("Silinmis element : "+removed);
        
        System.out.println("birinci silindikden sonra : ");
        System.out.println(queue.first.data);
        System.out.println(queue.last.data);
    }
}