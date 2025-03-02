package com.example;

import com.example.Main;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class MainTest {
    private MainJ main;

    @Before // This runs before each test
    public void setUp() {
        main = new MainJ();
    }

    @Test
    public void testGreet() {
        assertEquals("Hello, Jenkins!", main.greet());
    }
}

