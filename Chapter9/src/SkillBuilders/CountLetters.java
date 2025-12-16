package SkillBuilders;

import java.util.Scanner;

public class CountLetters {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a sentence: ");
		String sentence = input.nextLine();
		
		int [] letterCounts = new int[26];
		
		for (int i = 0; i < sentence.length(); i++) {
            char currentChar = sentence.charAt(i);

            if (Character.isLetter(currentChar)) {
                currentChar = Character.toUpperCase(currentChar);
                int index = currentChar - 'A';
                letterCounts[index]++;
            }
        }

        // Display all letters, including those with 0 count
        System.out.println("\nLetter counts:");
        for (int i = 0; i < letterCounts.length; i++) {
            char letter = (char) ('A' + i);
            System.out.println(letter + ": " + letterCounts[i]);
        }
		
	}

}
