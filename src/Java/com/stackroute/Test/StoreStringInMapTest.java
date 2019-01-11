package com.stackroute.Test.com.stackroute.pe5;

import com.stackroute.pe5.StoreStringInMap;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class StoreStringInMapTest {
    StoreStringInMap storeStringInMap;
    @Before
    public void setUp() {
        storeStringInMap = new StoreStringInMap();
    }

    @After
    public void tearDown()  {
        storeStringInMap = null;
    }

    @Test
    public void storeStringInMapSuccess() {
        String []keys = {"a","b","c","d","a","c","c"};
        HashMap actual =storeStringInMap.storeStringInMap(keys);
        HashMap expeced = new HashMap();
        expeced.put("a",true);
        expeced.put("b",false);
        expeced.put("c",true);
        expeced.put("d",false);
        assertEquals(expeced,actual);

    }
    @Test
    public void storeStringInMapFail() {
        String []keys = {"a","b","c","d","a","c","c","d"};
        HashMap actual =storeStringInMap.storeStringInMap(keys);
        HashMap expeced = new HashMap();
        expeced.put("a",true);
        expeced.put("b",false);
        expeced.put("c",true);
        expeced.put("d",false);
        assertNotEquals(expeced,actual);

    }
}