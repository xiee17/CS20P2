package Mastery;

import java.util.Scanner;

public class QuadraticEquation {
	public static void main(String[] args)
	{
		Scanner userInput = new Scanner(System.in);
		
			System.out.println("Enter value for a:");
			double a = userInput.nextDouble();
			
			System.out.println("Enter value for b:");
			double b = userInput.nextDouble();
			
			System.out.println("Enter value for c:");
			double c = userInput.nextDouble();
			
			//determine whether it has roots
			double discriminant = b*b - 4*a*c;
			
			double root1 = ((-b + Math.sqrt(b*b - 4*a*c))/ (2*a));
			double root2 = ((-b - Math.sqrt(b*b - 4*a*c)) / (2*a));
			
			if (discriminant > 0) {
				System.out.println("The roots are " + root1 + " and " + root2);
			}
			else if (discriminant == 0) {
				System.out.println("There's one real root:" + root1);
			}
			
			else {
				System.out.println("There's no real root.");
			}
			}
		
		
	}
