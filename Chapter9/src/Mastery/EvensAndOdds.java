package Mastery;
import java.util.ArrayList; 
public class EvensAndOdds {

   public static void main(String[] args) { 	   
       
       int[] randomNumbers = new int[25];
       
             for (int i = 0; i < 25; i++) { 
    	    	
           randomNumbers[i] = (int)(Math.random() * 100); 
       }
       
       ArrayList<Integer> evens = new ArrayList<>(); 
       ArrayList<Integer> odds = new ArrayList<>();         
           for (int i = 0; i < 25; i++) {
           if (randomNumbers[i] % 2 == 0) { 
               evens.add(randomNumbers[i]);
           } else {
               odds.add(randomNumbers[i]); 
           } 
       } 
       
             System.out.println("ODD: "); 
       for (int odd : odds) { 
           System.out.print(odd + " "); 
       } 
       
             System.out.println();
             
             System.out.println("EVEN: "); 
       for (int even : evens) { 
           System.out.print(even + " "); 
       } 
   } 
} 

