package Mastery;
import java.text.DecimalFormat;
import java.util.Scanner;


public class Election {

	public static void main(String[] args)
	{
		Scanner userInput = new Scanner(System.in);
		
		
		System.out.println("\nPlease enter the election results for the following candidates in New York:");
     
		System.out.println("Awbrey: ");
		int Awbreyx = userInput.nextInt();
		
		System.out.println("Martinez: ");
		int Martinezx = userInput.nextInt();
		
		
		
		System.out.println("\nPlease enter the election results in New Jersey:");
	     
		System.out.println("Awbrey: ");
		int Awbreyy = userInput.nextInt();
		
		System.out.println("Martinez: ");
		int Martinezy = userInput.nextInt();
		
		
		
		
		System.out.println("\nPlease enter the election results in Connecticut:");
	     
		System.out.println("Awbrey: ");
		int Awbreyj = userInput.nextInt();
		
		System.out.println("Martinez: ");
		int Martinezj = userInput.nextInt();
		
		
		
		
		
		int tMartinez = Martinezx + Martinezy + Martinezj;
		
		int tAwbrey = Awbreyx + Awbreyy + Awbreyj;
		
		int tVotes = tMartinez + tAwbrey;
		
		double Awbreypercent = (tAwbrey*100)/tVotes;
		
		double Martinezpercent = (tMartinez*100)/tVotes;
		
		 DecimalFormat Awbreypercentage = new DecimalFormat("#.00");

		 DecimalFormat Martinezpercentage = new DecimalFormat("#.00");
		
		System.out.print("The total amount of Awbrey’s votes are : " + tAwbrey);
		System.out.print("\nThe percentage of Awbrey’s votes are " + (Awbreypercentage.format(Awbreypercent)) + "%");
		
		System.out.print("\nThe total amount of Martinez’s votes are: " + tMartinez);
		System.out.print("\nThe percentage of Martinez’s votes are " + (Martinezpercentage.format(Martinezpercent)) + "%");
		
	}
		
	}
