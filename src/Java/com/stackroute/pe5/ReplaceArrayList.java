package com.stackroute.pe5;

import java.util.ArrayList;

public class ReplaceArrayList {
    public ArrayList<String> replaceArrayList(){
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Grape");
        list.add("Melon");
        list.add("Berry");
        //System.out.println(list);
        list.set(0,"Kiwi");
        list.set(2,"Mango");
        return list;
        //System.out.println(list);
    }
    public static void main(String []args){
        ReplaceArrayList replaceArrayList =new ReplaceArrayList();
        ArrayList<String> result =  replaceArrayList.replaceArrayList();
        System.out.println(result);
    }
}
