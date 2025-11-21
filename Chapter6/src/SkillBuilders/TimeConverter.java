package SkillBuilders;

import java.util.Scanner;

public class TimeConverter {
	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);
		        
		System.out.println("Choose which time you would like to convert between"); 
		System.out.println("1. Hours to minutes");
		System.out.println("2. Days to hours");
		System.out.println("3. Minutes to hours");
		System.out.println("4. Hours to days");

		int choice = userInput.nextInt();

		if (choice == 1) {
			System.out.print("How many hours?");
		    int HM = userInput.nextInt();
		    
		    double fMinutes = (HM * 60);
		    System.out.print("There are " + fMinutes + " minutes " + "in " + HM + " hours");
		}

		else if (choice == 2) {
		    System.out.print("How many days?");
		    int DH = userInput.nextInt();
		        
		    double fHours = (DH * 24);
		    System.out.print("There are " + fHours + " hours " + "in " + DH + " days");    
		}
		else if (choice == 3) {
		    System.out.print("How many minutes?");
		    int MH = userInput.nextInt();
		        
		    double fHours = (MH / 60);
		    System.out.print("There are " + fHours + " hours " + "in " + MH + " minutes"); 
		}

		else if (choice == 4) {
		    System.out.print("How many hours?");
		    int HD = userInput.nextInt();
		        
		    double fDays = (HD / 24);
		    System.out.print("There are " + fDays + " days " + "in " + HD + " hours"); 
		}

		}


}
