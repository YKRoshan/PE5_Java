package com.stackroute.pe5;

import com.stackroute.pe5.ReplaceArrayList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class ReplaceArrayListTest {
    ReplaceArrayList replaceArrayList;
    @Before
    public void setUp() {
        replaceArrayList = new ReplaceArrayList();
    }

    @After
    public void tearDown()  {
        replaceArrayList = null;
    }

    @Test
    public void replaceArrayListSuccess() {
        ArrayList<String> actual = replaceArrayList.replaceArrayList();
        ArrayList<String> expected = new ArrayList<>();
        expected.add("Kiwi");
        expected.add("Grape");
        expected.add("Mango");
        expected.add("Berry");
    }
}