package com.stackroute.pe5;

import java.util.ArrayList;
/*Write a Java program to update specific array element by given element and empty the array list .
Input: [Apple, Grape, Melon, Berry]
Output: [Kiwi, Grape, Mango, Berry]
Array list after removing all elements []*/
public class ReplaceArrayList {
    public ArrayList<String> replaceArrayList(){
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Grape");
        list.add("Melon");
        list.add("Berry");
        list.set(0,"Kiwi");
        list.set(2,"Mango");
        return list;
    }
}
