package com.stackroute.pe5;

import java.util.HashMap;

public class StoreStringInMap {
    public  HashMap storeStringInMap(String []keys){
        //String []keys = input.split(",");
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

    public static void main(String []args){
        StoreStringInMap ob = new StoreStringInMap();
        String []keys = {"a","b","c","d","a","c","c"};
        HashMap map = ob.storeStringInMap(keys);
            System.out.println(map);
    }
}
