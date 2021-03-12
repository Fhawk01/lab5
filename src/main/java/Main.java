import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Faith
 */
public class Main {
    public static void main(String[] args) {
        int[] numbers = {9,18,57,1,98}; 
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a number");
        int n = keyboard.nextInt();
        
        int count = CountArray(numbers,n);
        System.out.println(count + " numbers were greater");
        
    }
  
    
    
public static int CountArray(int[] arrayToCount, int n){
    int count = 0;
    
    for (int i = 0; i<arrayToCount.length; i++)
    {    
        if (arrayToCount[i] > n)
        {
            count++;
        }     
    }
    
    return count;
}
}


