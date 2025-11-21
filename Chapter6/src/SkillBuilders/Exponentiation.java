package SkillBuilders;

import java.util.Scanner;

public class Exponentiation {
	 public static void main(String [] args){
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Please enter the first number:");
		double num1 = userInput.nextDouble();
		
		System.out.println("Please enter the second number:");
		double num2 = userInput.nextDouble();
		
		double exp = powerOf(num1, num2);
		
		System.out.println(num1 + " rasied to the power of " + num2 + " is " + exp);
	 }
	 
		public static double powerOf(double num1,double num2) {
		return Math.pow(num1, num2);
		
	}

}
