package com.stackroute.pe5;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;
/*Write a program to implement set interface which sorts the given randomly ordered names in
ascending order. Convert the sorted set in to an array list
Input : Harry Olive Alice Bluto Eugene
Output :
Sorted Set : Alice Bluto Eugene Harry Olive
Array list from Set : Alice Bluto Eugene Harry Olive*/

public class SortTheNames {
    public  ArrayList sortTheNames(String []names){
        Set set = new TreeSet();
        for(String name:names){
            set.add(name);
        }

        ArrayList list = new ArrayList(set);
        return list;
    }
}