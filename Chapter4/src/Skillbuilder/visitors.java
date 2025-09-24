package Skillbuilder;

import java.util.Scanner;

public class visitors {
	public static void main(String[] args)
	{
	
	Scanner input = new Scanner(System.in);
			
	int totalVisitors = 0;
	int numVisitors = 0;
	int avgVisitors = 0;
	
	for(int day = 1; day <= 5; day++)
	{
			System.out.println(
					"Enter the number"
					+"of visitors on day"
							+ day + ":"
							);
			numVisitors = input.nextInt();
			totalVisitors= totalVisitors + numVisitors;
			
	}//end of for loop
	
	avgVisitors = (totalVisitors / 5);
	System.out.println("The average number of"
			+ "visitors is :"
			+ avgVisitors);
	}

}
