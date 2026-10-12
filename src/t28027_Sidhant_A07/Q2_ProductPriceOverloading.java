
class Product {
    int productId;
    String productName;
    double price;

    Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    double calculatePrice() {
        return price;
    }

    double calculatePrice(int quantity) {
        return price * quantity;
    }

    double calculatePrice(int quantity, double discount) {
        double total = price * quantity;
        return total - (total * discount / 100.0);
    }
}

public class ProductPriceOverloading {
    public static void main(String[] args) {
        Product p = new Product(101, "Keyboard", 1000);

        System.out.println("Price of One Product: Rs. "
                + p.calculatePrice());

        System.out.println("Price of 3 Products: Rs. "
                + p.calculatePrice(3));

        System.out.println("Price of 3 Products with 10% Discount: Rs. "
                + p.calculatePrice(3, 10.0));
    }
}
