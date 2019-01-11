package com.stackroute.pe5;

import com.stackroute.pe5.Val1AndVal2Map;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedHashMap;

import static org.junit.Assert.*;

public class Val1AndVal2MapTest {
    Val1AndVal2Map val1AndVal2Map;
    @Before
    public void setUp() throws Exception {
    val1AndVal2Map = new Val1AndVal2Map();
    }

    @After
    public void tearDown() throws Exception {
    val1AndVal2Map = null;
    }

    @Test
    public void val1AndVal2MapSuccess() {
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