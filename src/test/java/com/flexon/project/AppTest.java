package com.flexon.project;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
	App obj = new App();
	
    @Test
    public void testGetInteger()
    {
        int[] array = new int[]{4, 2, 3, 5, 1};
        int expResult = 2;
        int result = obj.getInteger(array, 3);
        assertEquals(expResult, result);
    }
    
    
}

