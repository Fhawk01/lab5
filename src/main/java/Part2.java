/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Faith
 */
public class Part2 {
    public static void main(String[] args) {
        int[] testArray = new int[5];
        
        getTotal(testArray);
        getAverage(testArray);
        getHighest(testArray);
        getLowest(testArray);
    }
    
    public static int getTotal(int[] arrayToTest)
    {
        int total = 0;
        
        for(int i=0; i<arrayToTest.length; i++)
        {
            total += arrayToTest[i];
        }
        
        
        return total;
    }
    
    public static int getAverage(int[] arrayToTest){
        int average = 0;
        
        for(int i=0; i<arrayToTest.length; i++)
        {
            average += arrayToTest[i];
        }
        
        average = average/arrayToTest.length;
        
        return average;
        
        
    }
    
    public static int getHighest(int[] arrayToTest){
        int highest = arrayToTest[0];
        
            for (int i = 0; i<arrayToTest.length; i++)
    {    
        if (arrayToTest[i] > highest)
        {
            highest = arrayToTest[i];
        }     
    }
            return highest;
    }
    public static int getLowest(int[] arrayToTest){
        int lowest = arrayToTest[0];
        
            for (int i = 0; i<arrayToTest.length; i++)
    {    
        if (arrayToTest[i] < lowest)
        {
            lowest = arrayToTest[i];
        }     
    }
            return lowest;
    }
}
