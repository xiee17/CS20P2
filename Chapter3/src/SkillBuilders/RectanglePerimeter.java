package SkillBuilders;

import java.util.Scanner;

public class RectanglePerimeter {

	public static void main(String[] args) 
	{
		Scanner userInput = new Scanner(System.in);
		
		// Declare variables
		int width;
		int length;

		// Create a Scanner object
        Scanner input = new Scanner(System.in);
        
        // Get the width
        System.out.print("Enter a width: ");
        width = input.nextInt();
        
        // Get the length
        System.out.print("Enter a length: ");
        length = input.nextInt();
        
        // Display the width
        System.out.println("The width is:" + width);
        
        // Display the length
        System.out.println("The length is:" + length);
		
        
	}

}
