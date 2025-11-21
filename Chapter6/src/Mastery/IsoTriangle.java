package Mastery;
import java.util.Scanner;
public class IsoTriangle {
	
		/**
		 * print a bar of triangle's size across the screen
		 * pre: length > 0
		 * post: Bar drawn of length characters
		 * point moved to next line.
		 */
		
		public static void main (String [] args) {
			Scanner userInput = new Scanner(System.in);
			
			System.out.println("Enter the size: ");
			int size = userInput.nextInt();
			
			for(int num = 1; num <= size; num++){
				addSpaces(size - num);
				drawBar(2 * num - 1);
				System.out.println();
				
			}
			
		}
			public static void drawBar(int c){
			for(int num = 0; num < c; num++) {
				System.out.print("*");
			}
			}
			
			
			public static void addSpaces(int c) {
				for(int num = 0; num < c; num++) {
				
				System.out.print(" ");
				
			}
			
		}
	}


