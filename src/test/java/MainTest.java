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
public class MainTest {
    
    public MainTest() {
    }

    @Test
    public void testCountArray() {
        System.out.println("CountArray");
        int[] arrayToCount = {15,7,19,89,1};
        int n = 8;
        int count = 3;
        int result = Main.CountArray(arrayToCount, n);
        assertEquals(count, result);
        
    }
    
}
