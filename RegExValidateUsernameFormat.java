// /Create a program called RegExValidateUsernameFormat that first inputs an email username from the user./The username should be a standard Haaga-Helia student email in the following format:a1234567 @myy.haaga-helia.fi./If the username is in the correct format,the program should print"OK"./Otherwise,the program should print"Invalid username format"./Validate the username with a single regular expression.

// /Example output:/Enter username:a1798765 @myy.haaga-helia.fi/OK

import java.util.Scanner;

public class RegExValidateUsernameFormat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = input.nextLine();
        if (username.matches("a[0-9]{7}@myy.haaga-helia.fi")) {
            System.out.print("OK");
        } else {
            System.out.print("Invalid username format");
        }
        input.close();
    }
}