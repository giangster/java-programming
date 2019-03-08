// Create a class called MethodsLibrary for storing generic methods. That is, the MethodsLibrary class is a method library class 
// and it does not have the main method. Copy your already existing code of the factorial method to the MethodsLibrary class and 
// do the minor modification to make the method accessible from outside of the MethodsLibrary class.

// Create a program called MethodsUseLibraryClass that uses the method factorial of the MethodsLibrary class. The main method 
// inputs an integer from the user and calls the factorial method of the MethodsLibrary class to get the factorial of the integer. 
// Finally, the main method prints the result.

// Viope instruction: Exercises with multiple source files

// Copy/paste the source code of your program class to the Viope code editor window.
// * If there is a package directive, then remove it in Viope.
// Copy/paste the other class definition to the Viope code editor window below the program class code.
// * Remove the public keyword from the class definition. Viope allows only the program class to be public.
// If you have any import directives in your source texts, you have to move them to the top of the Viope editor window. 
// Place them before the program class code.

// Example output:
// Enter an integer: 4
// 4! = 24
import java.util.Scanner;

public class MethodsUseLibraryClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int var = Integer.parseInt(input.nextLine());
        System.out.println(var + "!" + "=" + MethodsLibrary.factorial(var));
    }
}

class MethodsLibrary {
    public static int factorial(int num) {
        int factorial = 1;
        for (int j = 1; j <= num; j++) {
            factorial = factorial * j;
        }
        return factorial;
    }
}