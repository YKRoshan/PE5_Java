package com.stackroute.pe5;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class SortTheNames {
    public  ArrayList sortTheNames(String []names){
        Set set = new TreeSet();
        for(String name:names){
            set.add(name);
        }
       // System.out.println(set);

        ArrayList list = new ArrayList(set);
        return list;
    }
}