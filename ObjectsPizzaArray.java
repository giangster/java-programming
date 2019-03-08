
public class ObjectsPizzaArray {
    public static void main(String[] args) {
        Pizza[] PizzaArray = { new Pizza("Diavolo", 8.75), new Pizza("Frutti al Mare", 9.00),
                new Pizza("Alla Pollo", 7.50) };
        for (int i = 0; i < PizzaArray.length; i++) {
            Pizza pizzaObject = PizzaArray[i];
            System.out.println(pizzaObject.toString());
        }

    }
}
