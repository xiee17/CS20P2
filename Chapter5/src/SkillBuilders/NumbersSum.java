package SkillBuilders;

import java.util.Scanner;

public class NumbersSum {
	public static void main(String [] args) {
	Scanner userInput = new Scanner(System.in);
	
	int num = 0;
	int sum = 0;
	
	System.out.println("Enter a number: ");
	int num1 = userInput.nextInt();
	
	do {
		num++;
		System.out.println(num);
		sum += num;
	}while (num < num1 );
	
	System.out.println(sum);
	
        }
}

