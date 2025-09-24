package Mastery;
import java.text.DecimalFormat;
import java.util.Scanner;

public class spending {

	public static void main(String[] args)
	{
		Scanner userInput = new Scanner(System.in);
		
		
		System.out.println("\nPlease enter the amount spent last month on the following items:");
     
		System.out.println("Food: ");
		double foodf = userInput.nextInt();
		
		System.out.println("Clothing: ");
		double clothingf = userInput.nextInt();
		
		System.out.println("Entertaiment: ");
		double entertaimentf = userInput.nextInt();
		
		System.out.println("Rent: ");
		double rentf = userInput.nextInt();
		
		
		
		
		
		double tFee = rentf + entertaimentf + clothingf + foodf;
		
		
		double foodpercent = (foodf*100)/tFee;
		double clothingpercent = (clothingf*100)/tFee;
		double entertaimentpercent = (entertaimentf*100)/tFee;
		double rentpercent = (rentf*100)/tFee;
		
		
		 DecimalFormat foodpercentage = new DecimalFormat("#.00");

		 DecimalFormat clothingpercentage = new DecimalFormat("#.00");
		 
		 DecimalFormat entertaimentpercentage = new DecimalFormat("#.00");
		 
		 DecimalFormat rentpercentage = new DecimalFormat("#.00");
		 
		
		
		System.out.print("\nFood: $" + foodf);
		System.out.print("\nClothing: $" + clothingf);
		System.out.print("\nEntertaiment: $" + entertaimentf);
		System.out.print("\nRent: $" + rentf);
		
		System.out.println();
		
		System.out.print("\nFood: " + (foodpercentage.format(foodpercent)) + "%");
		System.out.print("\nClothing: " + (clothingpercentage.format(clothingpercent)) + "%");
		System.out.print("\nEntertaiment: " + (entertaimentpercentage.format(entertaimentpercent)) + "%");
		System.out.print("\nRent: " + (rentpercentage.format(rentpercent)) + "%");

	    
	}
		
	}

