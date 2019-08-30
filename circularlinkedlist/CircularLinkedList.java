package circularlinkedlist;
import circularlinkedlist.ListNode;
class CircularLinkedList <T>{
    ListNode<T> first;
    ListNode<T> last;
    int size =0;

    void add(T data){
        ListNode<T> newNode = new ListNode<T>(data);
        if(first == null){
            first = newNode;
            last = first;
        }else{
            newNode.prev = last;
            last.next = newNode;        
            last = newNode;
            first.prev = last;
            last.next = first;
        }
        size++;
    }

    void printList(){
        ListNode temp = first;
        for(int i = 0; temp!=null;i++){
            System.out.println(temp.data);
            temp = temp.next;
            if(i == size-1){
                break;
            }
        }
    }

    void traverse(){
        ListNode<T> temp = first.prev;
        for(int i = 0; temp!=null;i++){
            System.out.println(temp.data);
            temp = temp.prev;
            if(i == size-1){
                break;
            }
        }
    }

}