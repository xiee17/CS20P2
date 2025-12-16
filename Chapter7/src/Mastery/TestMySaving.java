package Mastery;

import java.util.Scanner;

public class TestMySaving {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        MySavings piggybank = new MySavings();
        int choice;

        do {
            System.out.println("1. Show total in bank.");
            System.out.println("2. Add pennies.");
            System.out.println("3. Add nickels.");
            System.out.println("4. Add dimes.");
            System.out.println("5. Add quarters.");
            System.out.println("6. Take money out of bank.");
            System.out.println("Enter 0 to quit.");
            System.out.print("Enter your choice: ");

            choice = userInput.nextInt();

            switch (choice) {

                case 0:
                    break;

                case 1:
                    System.out.println("The total amount in your account is: " 
                                       + piggybank.getTotal());
                    break;

                case 2:
                    System.out.print("Enter the amount of pennies: ");
                    piggybank.addPenny(userInput.nextInt());
                    break;

                case 3:
                    System.out.print("Enter the amount of nickels: ");
                    piggybank.addNickel(userInput.nextInt());
                    break;

                case 4:
                    System.out.print("Enter the amount of dimes: ");
                    piggybank.addDime(userInput.nextInt());
                    break;

                case 5:
                    System.out.print("Enter the amount of quarters: ");
                    piggybank.addQuarter(userInput.nextInt());
                    break;

                case 6:
                    piggybank.takeMoneyOut();
                    System.out.println("All money removed from bank.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);

        userInput.close();
    }
}
