package com.oo;


import org.junit.Test;

import static org.junit.Assert.*;

public class MyAppTest {

    @Test
    public void testAdd() throws Exception {
        MyApp myApp = new MyApp();
        int res = myApp.add(1, 2);
        assertEquals(3, res);
    }
}