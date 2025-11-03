package Mastery;

import java.text.DecimalFormat;
import java.util.Scanner;

public class InverseTrigFunction {

	public static void main(String[] args)
	{
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter an angle in degrees: ");
		double an = userInput.nextDouble();
		
		double radians = Math.toRadians(an);
		
		double Asin = Math.asin(radians);
		double Acos = Math.acos(radians);
		double Atan = Math.atan(radians);
		
		DecimalFormat DecimalFormat = new DecimalFormat("0.00");
		
		System.out.println("Arcsin: " + DecimalFormat.format(Asin));
		System.out.println("Arccos: " + DecimalFormat.format(Acos));
		System.out.println("Arctan: " + DecimalFormat.format(Atan));
			
		
	}
	
}

