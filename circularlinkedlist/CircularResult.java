package circularlinkedlist;
import circularlinkedlist.CircularLinkedList;
class CircularResult{
    public static void main(String[] args) {
        
        CircularLinkedList<String> ls = new CircularLinkedList<String>();
        ls.add("bir");
        ls.add("iki");
        ls.add("uc");
        ls.add("dord");

        // ls.printList();
        ls.traverse();
        
    }
}