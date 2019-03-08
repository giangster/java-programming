import java.util.ArrayList;

public class ObjectsShoppingCartProgram {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Product product_1 = new Product(10, "Bicycle", 500.00);
        Product product_2 = new Product(11, "Energy bar", 1.50);
        Product product_3 = new Product(12, "Water bottle", 6.00);

        System.out.println(cart);

        cart.add(product_1, 1);
        cart.add(product_2, 5);
        cart.add(product_3, 2);
        System.out.println(cart);

        cart.remove(product_2);
        System.out.println(cart);
    }
}

class Product {
    int pNumber;
    String pName;
    double pPrice;

    public Product(int pNumber, String pName, double pPrice) {
        this.pNumber = pNumber;
        this.pName = pName;
        this.pPrice = pPrice;
    }

    public int getPrdNumber() {
        return this.pNumber;
    }

    public String getPrdName() {
        return this.pName;
    }

    public double getPrdPrice() {
        return this.pPrice;
    }

    public void setPrdName(String pName) {
        this.pName = pName;
    }

    public void setPrdNumber(int pNumber) {
        this.pNumber = pNumber;
    }

    public void setPrdPrice(double pPrice) {
        this.pPrice = pPrice;
    }
}

class Item {
    Product product;
    int quantity;

    public Item(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return this.product;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public double getSubtotal() {
        return this.quantity * this.product.getPrdPrice();
    }
}

class ShoppingCart {
    ArrayList<Item> itemList = new ArrayList<Item>();

    ShoppingCart() {
        // this.itemList = itemList;
    }

    public void add(Product product, int quantity) {
        Item item = new Item(product, quantity);
        itemList.add(item);
    }

    public void remove(Product product) {
        for (Item itemObject : itemList) {
            if (itemObject.getProduct().equals(product)) {
                int index = itemList.indexOf(itemObject);
                itemList.remove(index);
                return;
            }
        }
    }

    public double getTotalPrice() {
        double total = 0;
        for (Item itemObject : itemList) {
            total = total + itemObject.getProduct().getPrdPrice() * itemObject.getQuantity();
        }
        return total;
    }

    public String toString() {
        if (itemList.size() == 0) {
            return "There are no items in the shopping cart.";
        } else {
            String hurray = "=== Shopping cart ===\n";
            double everything = 0;
            for (Item itemObject : itemList) {
                everything = everything + itemObject.getSubtotal();
                hurray = hurray + itemObject.getProduct().getPrdNumber() + ": " + itemObject.getProduct().getPrdName()
                        + ", quantity: " + itemObject.getQuantity() + ", unit price: "
                        + String.format("%.2f", itemObject.getProduct().getPrdPrice()) + ", subtotal: "
                        + String.format("%.2f", itemObject.getSubtotal()) + "\n";
            }
            hurray = hurray + "TOTAL PRICE: " + String.format("%.2f", everything) + " euros";
            return hurray;
        }
    }

}