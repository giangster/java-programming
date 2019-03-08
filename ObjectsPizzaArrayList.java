// Create a program called ObjectsPizzaArrayList. The program is a variation of the ObjectsPizzaArray program.

// Use the ArrayList class and create a list of Pizzas. Reuse the Pizza class from the previous exercise.

// Create three Pizza objects and save their references to the list. See the example output for the pizza names and prices. 
// Finally, the program should iterate the list and print a pizza list exactly as shown in the example output.

// * Hint: To make it easier, you can use the enhanced for loop to iterate the list.

// Example output:
// Diavolo (8,75 euros)
// Frutti al Mare (9,00 euros)
// Alla Pollo (7,50 euros)
import java.util.ArrayList;

public class ObjectsPizzaArrayList {
    public static void main(String[] args) {
        ArrayList<Pizza> pizzaList = new ArrayList<Pizza>();
        pizzaList.add(new Pizza("Diavolo", 8.75));
        pizzaList.add(new Pizza("Frutti al Mare", 9.00));
        pizzaList.add(new Pizza("Alla Pollo", 7.50));

        for (Pizza pizzaObject : pizzaList) {
            System.out.println(pizzaObject.toString());
        }

    }
}