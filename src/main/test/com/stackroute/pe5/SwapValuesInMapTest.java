package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedHashMap;

import static org.junit.Assert.*;

public class SwapValuesInMapTest {
    SwapValuesInMap val1AndVal2Map;
    @Before
    public void setUp() {
    val1AndVal2Map = new SwapValuesInMap();
    }

    @After
    public void tearDown() {
    val1AndVal2Map = null;
    }

    @Test
    public void val1AndVal2MapSuccess1() {
        LinkedHashMap map = new LinkedHashMap();

        map.put("val1","java");
        map.put("val2","c++");
        LinkedHashMap map1 = new LinkedHashMap();

        map1.put("val1"," ");
        map1.put("val2","java");

        LinkedHashMap actual = val1AndVal2Map.val1AndVal2Map(map);
        LinkedHashMap expected = map1;
        assertEquals(expected,actual);
    }

    @Test
    public void val1AndVal2MapSuccess2() {
        LinkedHashMap map = new LinkedHashMap();

        map.put("key1","apple");
        map.put("key2","banana");
        LinkedHashMap map1 = new LinkedHashMap();

        map1.put("key1"," ");
        map1.put("key2","apple");

        LinkedHashMap actual = val1AndVal2Map.val1AndVal2Map(map);
        LinkedHashMap expected = map1;
        assertEquals(expected,actual);
    }

    @Test
    public void val1AndVal2MapFail() {
        LinkedHashMap map = new LinkedHashMap();

        map.put("val3","stack");
        map.put("val4","route");
        LinkedHashMap map1 = new LinkedHashMap();

        map1.put("val3","route");
        map1.put("val4","stack");

        LinkedHashMap actual = val1AndVal2Map.val1AndVal2Map(map);
        LinkedHashMap expected = map1;
        assertNotEquals(expected,actual);
    }
}