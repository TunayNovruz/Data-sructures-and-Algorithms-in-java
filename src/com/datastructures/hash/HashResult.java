package com.datastructures.hash;
import com.datastructures.hash.HashMap;

class HashResult {
    public static void main(String[] args) {
        HashMap<String,String> myMap = new HashMap <String,String>(15);

        myMap.insert("first","birinci");
        myMap.insert("second","ikinic");
        myMap.insert("third","ucuncu");
        myMap.insert("forth","dorduncu");

        myMap.displayMap();


        //System.out.println("hello world".hashCode());
    }
}