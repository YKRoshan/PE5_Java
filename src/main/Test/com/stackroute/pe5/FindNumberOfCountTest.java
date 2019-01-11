package com.stackroute.pe5;

import com.stackroute.pe5.FindNumberOfCount;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindNumberOfCountTest {
    FindNumberOfCount findNumberOfCount;
    @Before
    public void setUp() throws Exception {
        findNumberOfCount = new FindNumberOfCount();
    }

    @After
    public void tearDown() throws Exception {
        findNumberOfCount = null;
    }


    @Test
    public void findNumberOfCountSuccess1() {
        String str = "one one -one___two,,three,one @three*one?two";
        String actual = findNumberOfCount.findNumberOfCount(str);
        String expected = "one:5,two:2,three:2";
        assertEquals(expected,actual);
    }

    @Test
    public void findNumberOfCountSuccess2() {
        String str = "one dfffdj two0vv dfdn one fjgf three";
        String actual = findNumberOfCount.findNumberOfCount(str);
        String expected = "one:2,two:1,three:1";
        assertEquals(expected,actual);
    }

    @Test
    public void findNumberOfCountFail1() {
        String str = "one one -one___two,,three,one @three*one?two";
        String actual = findNumberOfCount.findNumberOfCount(str);
        String expected = "one:5,two:3,three:2";
        assertNotEquals(expected,actual);
    }

    @Test
    public void findNumberOfCountFail2() {
        String str = "";
        String actual = findNumberOfCount.findNumberOfCount(str);
        String expected = null;
        assertEquals(expected,actual);
    }
}