package com.stackroute.Test.com.stackroute.pe5;

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
    public void findNumberOfCount() {
        String str = "one one -one___two,,three,one @three*one?two";
        String actual = findNumberOfCount.findNumberOfCount(str);
        String expected = "one:5,two:2,three:2";
        assertEquals(expected,actual);
    }
}