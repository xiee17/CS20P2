package Skillbuilder;

import java.util.Scanner;

public class perfectSquare {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		
		int num = input.nextInt();
		
		double squareRoot = Math.sqrt(num);
		
		int squared = (int) Math.pow(squareRoot, squareRoot);
		
		if (num == squared)
		{
			System.out.println("It is a perfect square.");
		}
		else
		{
			System.out.println("It is not a perfect square.");
		}
	}

}
