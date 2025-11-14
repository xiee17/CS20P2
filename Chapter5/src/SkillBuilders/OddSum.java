package SkillBuilders;

import java.util.Scanner;

public class OddSum {
	public static void main(String [] args) {
		Scanner userInput = new Scanner(System.in);
		
		int sum = 0;
		
		System.out.println("Enter a number: ");
		int num1 = userInput.nextInt();
		
		for (int num = 1; num <= num1; num++) {
			if(num % 2 != 0) {
				sum += num;
			}
			
		}
		System.out.println("The sum of odd numbers between 1-" + num1 + " is "+ sum + ".");
		
	}

}
