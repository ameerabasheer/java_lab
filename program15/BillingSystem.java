import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Product {
    int id;
    String name;
    int qty;
    double price;
    double total;

    Product(int id, String name, int qty, double price) {
        this.id = id;
        this.name = name;
        this.qty = qty;
        this.price = price;
        this.total = qty * price;
    }
}

public class BillingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        System.out.print("Enter number of orders: ");
        int orders = sc.nextInt();

        // 🔁 Loop for each order
        for (int o = 1; o <= orders; o++) {

            LocalDateTime now = LocalDateTime.now();

            System.out.println("\n========== ORDER " + o + " ==========");

            System.out.print("Enter number of products: ");
            int n = sc.nextInt();

            Product[] products = new Product[n];
            double grandTotal = 0;

            
            for (int i = 0; i < n; i++) {
                System.out.println("\nEnter details for Product " + (i + 1));

                System.out.print("Product ID: ");
                int id = sc.nextInt();

                sc.nextLine(); 
                System.out.print("Product Name: ");
                String name = sc.nextLine();

                System.out.print("Quantity: ");
                int qty = sc.nextInt();

                System.out.print("Unit Price: ");
                double price = sc.nextDouble();

                products[i] = new Product(id, name, qty, price);
                grandTotal += products[i].total;
            }

            
            System.out.println("\n============= BILL =============");
            System.out.println("Order No: " + o);
            System.out.println("Date & Time: " + now.format(dtf));
            System.out.println("-----------------------------------------------");

            System.out.printf("%-10s %-15s %-10s %-10s %-10s\n",
                    "ID", "Name", "Qty", "Price", "Total");

            for (Product p : products) {
                System.out.printf("%-10d %-15s %-10d %-10.2f %-10.2f\n",
                        p.id, p.name, p.qty, p.price, p.total);
            }

            System.out.println("-----------------------------------------------");
            System.out.printf("Grand Total: %.2f\n", grandTotal);
            System.out.println("===============================================\n");
        }

        sc.close();
    }
}
