
import java.util.ArrayList;
import java.util.Scanner;

class Product {
    int productId;
    String productName;
    double price;

    Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    void read(Scanner sc) {
        System.out.print("Enter Product ID: ");
        productId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Product Name: ");
        productName = sc.nextLine();

        System.out.print("Enter Price: ");
        price = sc.nextDouble();

        if (price < 0) {
            throw new IllegalArgumentException(
                "Price cannot be negative."
            );
        }
    }

    void display() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: Rs. " + price);
        System.out.println("--------------------");
    }
}

public class ProductArrayListDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();

        double totalPrice = 0;
        Product highestPriceProduct = null;

        for (int i = 0; i < 5; i++) {
            System.out.println("\nEnter details of Product " + (i + 1));

            Product p = new Product(0, "", 0);
            p.read(sc);
            products.add(p);
        }

        System.out.println("\nAll Product Details");

        for (Product p : products) {
            p.display();
            totalPrice += p.price;

            if (highestPriceProduct == null ||
                    p.price > highestPriceProduct.price) {
                highestPriceProduct = p;
            }
        }

        System.out.println("Total Price: Rs. " + totalPrice);

        System.out.println("\nProduct with Highest Price");
        if (highestPriceProduct != null) {
            highestPriceProduct.display();
        }

        sc.close();
    }
}

