package SkillBuilders;

import java.text.DecimalFormat;
import java.util.Scanner;

public class gradeAve1 {
	public static void main(String[] args)
	{
		Scanner userInput = new Scanner(System.in);
				
		System.out.println("Please enter the first grade: ");
		int gradef = userInput.nextInt();
		
		System.out.println("Please enter the second grade: ");
		int grades = userInput.nextInt();
		
		System.out.println("Please enter the third grade: ");
		int gradet = userInput.nextInt();
		
		System.out.println("Please enter the fourth grade: ");
		int gradeo = userInput.nextInt();
		
		System.out.println("Please enter the fifth grade: ");
		int gradei = userInput.nextInt();
		
		int tGrade = gradef + grades + gradet + gradeo + gradei;
		
		double aveGrade = tGrade / 5.0;
				
		DecimalFormat aveGrades = new DecimalFormat("#.00");
		
		System.out.println("The average for these five grades is:" + aveGrades.format(aveGrade));
		
		
	}

}
