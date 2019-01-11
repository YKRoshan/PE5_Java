package com.stackroute.pe5;

import com.stackroute.pe5.SortTheNames;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SortTheNamesTest {
    SortTheNames sortTheNames;
    @Before
    public void setUp() throws Exception {
        sortTheNames = new SortTheNames();
    }

    @After
    public void tearDown() throws Exception {
        sortTheNames = null;
    }

    @Test
    public void sortTheNamesSuccess() {
        String[] names = {"Harry","Olive","Alice","Bluto","Eugene"};
        ArrayList actual = sortTheNames.sortTheNames(names);
        ArrayList expected = new ArrayList();
        expected.add("Alice");
        expected.add("Bluto");
        expected.add("Eugene");
        expected.add("Harry");
        expected.add("Olive");
        assertEquals(expected,actual);
    }

    @Test
    public void sortTheNamesFail() {
        String[] names = {"Rahul","Ajay","Alice","Bluto","Eugene"};
        ArrayList actual = sortTheNames.sortTheNames(names);
        ArrayList expected = new ArrayList();
        expected.add("Rahul");
        expected.add("Bluto");
        expected.add("Eugene");
        expected.add("Harry");
        expected.add("Olive");
        assertNotEquals(expected,actual);
    }
}