/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Faith
 */
public class Part2Test {
    
    public Part2Test() {
    }


    @Test
    public void testGetTotal() {
        System.out.println("getTotal");
        int[] arrayToTest = {5,5,5};
        int expResult = 15;
        int result = Part2.getTotal(arrayToTest);
        assertEquals(expResult, result);
        
    }

    @Test
    public void testGetAverage() {
        System.out.println("getAverage");
        int[] arrayToTest = {5,5,5,5,5};
        int expResult = 5;
        int result = Part2.getAverage(arrayToTest);
        assertEquals(expResult, result);
        
    }

    @Test
    public void testGetHighest() {
        System.out.println("getHighest");
        int[] arrayToTest = {1,8,58,9,10, 90};
        int expResult = 90;
        int result = Part2.getHighest(arrayToTest);
        assertEquals(expResult, result);
        
    }

    @Test
    public void testGetLowest() {
        System.out.println("getLowest");
        int[] arrayToTest = {98,8,10,7,10,1};
        int expResult = 1;
        int result = Part2.getLowest(arrayToTest);
        assertEquals(expResult, result);
        
    }
    
}
