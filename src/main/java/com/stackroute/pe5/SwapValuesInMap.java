package com.stackroute.pe5;

import java.util.*;
/*Write a method that accepts a Map object having two key-value pairs with the keys val1 and val2.
Modify and return the given map as follows:
a. If the key `val1` has
b. Set the key `val1` to
Example 1:
The map {"val1": "java",
"java"}
Example 2:
The map {"val1": "mars",
"mars"}
a value, set the key `val2` to have that value, and
have the value `" "` (empty string ).
"val2": "c++"} should return {"val1": " ", "val2":
"val2": "saturn"}
should return {"val1": " ", "val2":*/
public class SwapValuesInMap {
    public  LinkedHashMap val1AndVal2Map(LinkedHashMap inputMap){
        if(inputMap.size()<2 || inputMap.size()>2)
            return null;

        LinkedHashMap map = new LinkedHashMap();
        Set keys = inputMap.keySet();
        Collection values = inputMap.values();

        Iterator iterator1 = keys.iterator();
        String str1 = (String)iterator1.next();
        String str2 = (String)iterator1.next();
        Iterator iterator2 = values.iterator();
        String val1 = (String) iterator2.next();

        map.put(str1," ");
        map.put(str2,val1);

        return map;
    }
}