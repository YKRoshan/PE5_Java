package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

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
    public void replaceArrayListSuccess1() {
        ArrayList<String> actual = replaceArrayList.replaceArrayList();
        ArrayList<String> expected = new ArrayList<>();
        expected.add("Kiwi");
        expected.add("Grape");
        expected.add("Mango");
        expected.add("Berry");
        assertEquals(expected,actual);
    }

    @Test
    public void replaceArrayListSuccess2() {
        ArrayList<String> actual = replaceArrayList.replaceArrayList();
        ArrayList<String> expected = new ArrayList<>();
        expected.add("Kiwi");
        expected.add("Grape");
        expected.add("Mango");
        expected.add("Berry");
        assertEquals(expected,actual);
    }
    @Test
    public void replaceArrayListFail1() {
        ArrayList<String> actual = replaceArrayList.replaceArrayList();
        ArrayList<String> expected = new ArrayList<>();
        expected.add("Kiwi");
        expected.add("Grape");
        expected.add("Orange");
        expected.add("Berry");
        assertNotEquals(expected,actual);
    }

    @Test
    public void replaceArrayListFail2() {
        ArrayList<String> actual = replaceArrayList.replaceArrayList();
        ArrayList<String> expected = new ArrayList<>();
        expected.add("Banana");
        expected.add("Grape");
        expected.add("Orange");
        expected.add("Berry");
        assertNotEquals(expected,actual);
    }
}