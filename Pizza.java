
public class Pizza {
    private String name;
    private double price;

    public Pizza(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    // public setName(String name) {
    // this.name = name;
    // }

    // public setPrice(double price) {
    // this.price = price;
    // }

    public String toString() {
        return this.name + " (" + String.format("%.2f", this.price) + " euros)";
    }
}