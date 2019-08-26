package linkedlist;
import linkedlist.LinkedList;

class Result {
    public static void main(String[] args) {
     LinkedList <String> list = new LinkedList<String>();
        list.add("birinci");        
        list.add("ikinci");
        list.add("ucuncu");
        list.add("sonuncu");

        System.out.println(list.get(0));
        System.out.println(list.get(2));

        String removed = list.remove(3);
        System.out.println("silinmis element:" + removed);
    }
}