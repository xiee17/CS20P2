package Mastery;

import java.util.Scanner;

public class GuessGame {
	public static void main(String [] args) {
		Scanner userInput = new Scanner(System.in);
		
		int num = 4;
		int gnum = 0;
		
		
		
		while(gnum != num) {
			System.out.println("Enter a number between 1 and 20: ");
		gnum = userInput.nextInt();
		
		if(gnum < 1 || gnum > 20) {
			System.out.println("invalid number");
			continue;
		}
		if (gnum < num) {
			giveHint("higher");
		}
		else if (gnum > num) {
			giveHint("lower");
		}
		else {
			System.out.println("You won!");
			}
		}
		}

	
	
	public static void giveHint(String hint) {
		if (hint.equals("higher")) {
			System.out.println("try a higher number.");
		}
		else if (hint.equals("lower")) {
			System.out.println("try a lower number");
		}
	}

}
