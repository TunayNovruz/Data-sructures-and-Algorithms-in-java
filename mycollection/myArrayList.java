package mycollection;

import java.util.*;

class myArrayList {
    public static void main(String[] args) {
        ArrayList <String> list1 = new ArrayList<>();
        HashMap <String,String> map = new HashMap<String,String>();
        list1.add("salam");
        list1.add("dunya");
        list1.set(1,"zzzz");
        list1.remove(0);
        System.out.println(list1); 

        ArrayList<String>list2 = new ArrayList<>();

        list2.add("ikinciden");

        list1.addAll(list2);

        System.out.println(list1);

    }
}