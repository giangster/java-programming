// Create a program called StringCreateUsername that has a method called createUsername that creates a new 
// username based on the user'sfirst name and surname.The method should accept first name and surname as its 
// input parameters and return either a new username or null if the username cannot be created.

// The main method first inputs first name and surname from the user and then calls the method createUsename 
// with the inputted data.Finally,the main method prints either the username or"Not enough letters to create 
// a username!"

// A username should be written in small letters only and it should include first three letters from the given 
// surname and first two letters from the first name.No username should be created if there are not enough 
// letters available in the first name or in the surname.

// Example output:
// Enter first name:Rowan 
// Enter surname:Zorbas 
// zorr
import java.util.Scanner;

public class StringCreateUsername {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first name: ");
        String firstName = input.nextLine();
        System.out.print("Enter surname: ");
        String surName = input.nextLine();
        createUsername(firstName, surName);
        input.close();
    }

    private static void createUsername(String firstname, String surname) {
        String username = "";
        if (firstname.length() >= 2 && surname.length() >= 3) {
            for (int i = 0; i < 3; i++) {
                username = username + surname.charAt(i);
            }
            for (int i = 0; i < 2; i++) {
                username = username + firstname.charAt(i);
            }
            System.out.print(username.toLowerCase());
        } else {
            System.out.println("Not enough letters to create a username!");
        }
    }
}