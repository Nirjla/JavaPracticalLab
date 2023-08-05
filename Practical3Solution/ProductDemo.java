class Product {
    String name;
    int qty;
    double price;

    public Product(String name, int qty, double price) {
        this.name = name;
        this.qty = qty;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public int getQty() {
        return this.qty;
    }

    public double getPrice() {
        return this.price;
    }

    public double getTotal() {
        return this.qty * this.price;
    }
}

public class ProductDemo {
    public static void main(String[] args) {

        // create objects of Product class
        Product prod1 = new Product("Laptop", 2, 65000);
        Product prod2 = new Product("Mobile", 3, 20000);

        // display details of prod1
        System.out.println("Product 1:");
        System.out.println("Name: " + prod1.getName());
        System.out.println("Quantity: " + prod1.getQty());
        System.out.println("Price: " + prod1.getPrice());
        // compute and display total price
         System.out.println("\nTotal price: " + prod1.getTotal());

        // display details of prod2
        System.out.println("\nProduct 2:");
        System.out.println("Name: " + prod2.getName());
        System.out.println("Quantity: " + prod2.getQty());
        System.out.println("Price: " + prod2.getPrice());
        // compute and display total price
         System.out.println("\nTotal price: " + prod2.getTotal());

        
       
        
    }

}
