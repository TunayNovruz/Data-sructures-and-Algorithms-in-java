package doublylinkedlist;
import doublylinkedlist.DoublyLinkedList;;
class DoublyResult{
    public static void main(String[] args) {
        DoublyLinkedList <String> myList = new  DoublyLinkedList<String>();
        myList.add("birinci");
        myList.add("ikinci");
        myList.add("ucuncu");
        myList.add("dorduncu");
        myList.add("besinci");
        //myList.printList();

        String str = myList.get(0);
        //System.out.println(str);
        String removed = myList.remove(2);
        //myList.printTraverse();
        myList.printList();


    }
}