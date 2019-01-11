package com.stackroute.pe5;

import java.util.HashMap;
/*Write a program where an array of strings is input and output is a Map< String ,boolean> where
each different string is a key and its value is true if that string appears 2 or more times in the array
Input : String arr[] = {“a”,”b”,”c”,”d”,”a”,”c”,”c”}
Output - {“a” : true,”b” :false ,”c” :true,”d” : false}*/
public class StoreStringInMap {
    public  HashMap storeStringInMap(String []keys){
        HashMap map = new HashMap();
        for(int i=0;i<keys.length;i++){
           int count=0;
            if(!keys[i].equalsIgnoreCase("")){
            for(int j=i+1;j<keys.length;j++){
                if(keys[i].equalsIgnoreCase(keys[j])){
                    count++;
                    keys[j]="";
                }
            }
            if(count>0){
                map.put(keys[i],true);
            }else {
                map.put(keys[i],false);
            }
            }
        }

        return map;
    }
}
