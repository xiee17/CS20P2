package Skillbuilder;

import java.util.Scanner;

public class Hurricane {
	public static void main (String [] args) {
	Scanner userInput = new Scanner(System.in);
	
	System.out.println("Please entre the category of hurricane (1-5): ");
	
	int category = userInput.nextInt();
	
	switch (category) {
		case 1: System.out.println("74-95 mph  64-82 kt  119-153 km/hr");break;
		case 2: System.out.println("96-110 mph  83-95 kt  154-177 km/hr");break;
		case 3: System.out.println("111-130 mph  64-82 kt  178-209 km/hr");break;
		case 4: System.out.println("131-115 mph  64-82 kt  210-249 km/hr");break;
		case 5: System.out.println("Greater than 155mph  135kt  249km/hr");break;
		default: System.out.println("Sorry, Invaild category.");break;
	}
	}
}
