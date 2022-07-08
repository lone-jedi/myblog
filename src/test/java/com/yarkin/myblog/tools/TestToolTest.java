package com.yarkin.myblog.tools;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestToolTest
{

    @Test
    void testMethod()
    {
        TestTool testTool = new TestTool();
        int test = testTool.test(false);
        assertEquals(0, test);
    }

    @Test
    void whenParameterIsTrue()
    {
        TestTool testTool = new TestTool();
        int test = testTool.test(true);
        assertEquals(1, test);
    }
}