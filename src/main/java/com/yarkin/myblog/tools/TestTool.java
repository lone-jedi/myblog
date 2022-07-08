package com.yarkin.myblog.tools;

import java.util.Random;

/**
 * TODO: add class / interface description
 *
 * @author OYarkin
 * @since 8.3.0
 */
public class TestTool
{
    public int test(boolean value) {
        if (value) {
            return (new Random()).nextInt(1,10);
        }

        return 0;
    }
}
