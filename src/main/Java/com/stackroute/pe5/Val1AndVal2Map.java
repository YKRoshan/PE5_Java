package com.stackroute.pe5;

import java.util.*;

public class Val1AndVal2Map {
    public  LinkedHashMap val1AndVal2Map(LinkedHashMap inputMap){
        if(inputMap.size()<2 || inputMap.size()>2)
            return null;

        LinkedHashMap map = new LinkedHashMap();
        Set keys = inputMap.keySet();
        Collection values = inputMap.values();

        Iterator it = keys.iterator();
        String str1 = (String)it.next();
        String str2 = (String)it.next();
        Iterator it2 = values.iterator();
        String val1 = (String) it2.next();

        map.put(str1," ");
        map.put(str2,val1);

        return map;
    }
//    public static void main(String []args){
//       LinkedHashMap map = new LinkedHashMap();
//
//       map.put("val1","java");
//        map.put("val2","c++");
//        System.out.println(map);
//
//        map=val1AndVal2Map(map);
//        System.out.println(map);
//    }
}