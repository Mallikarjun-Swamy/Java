package java8.functionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class PredicateFunctions {

    public static void main(String[] args) {

        List<Product> inventory = new ArrayList<>();
        inventory.add(new Product("Laptop", 50000.00, "Electronics"));
        inventory.add(new Product("Phone", 5050.00, "Electronics"));
        inventory.add(new Product("Table", 50000.00, "Furniture"));
        inventory.add(new Product("Desk Chair", 2000.00, "Furniture"));
        inventory.add(new Product("Milk", 50.00, "Grocery"));

        // 1. SUPPLIER: Creating a new product if the list was empty
        Supplier<Product> defaultItems = () -> new Product("Generic Item", 0.0, "General");
        if(inventory.isEmpty()){
            inventory.add(defaultItems.get());
        }

        System.out.println("Inventory List : " + inventory);




        // 2. PREDICATE: Finding specific items (Filtering)
        // Rule: Identify "Electronics" that cost more than 5000
        Predicate<Product> isExpensiveElectronics = p -> p.category.equals("Electronics") && p.price > 5000.00;

        System.out.println("--- Expensive Electronics ---");
        for (Product p : inventory){
            if(isExpensiveElectronics.test(p)){
                System.out.println("Found: " + p.name);
            }
        }



        // 3. FUNCTION: Converting objects to another type (Mapping)
        // Rule: Get just the names of all products for a report
        Function<Product, String> functionToUpperCase = p -> p.name.toUpperCase();

        List<String> productNames = new ArrayList<>();

        for (Product p : inventory){
            productNames.add(functionToUpperCase.apply(p));
        }
        System.out.println("\nProduct Names: " + productNames);

        //using streams
        //List<String> productNames = inventory.stream().map(functionToUpperCase).toList();
        // System.out.println("Product Names : " + productNames);



        // 4. UNARY OPERATOR: Modifying existing data (Updating)
        // Rule: Apply a 10% Clearance Sale discount to everything

        UnaryOperator<Double> applyDiscount = price -> price*0.90;

        for (Product p : inventory){
            p.price = applyDiscount.apply(p.price);
        }

        // 5. CONSUMER: Taking final action (Printing/Saving)
        // Rule: Print the final updated inventory details

        Consumer<Product> productConsumer = p -> System.out.println("Final Product is : " + p);
        inventory.forEach(productConsumer);




        // 6. BIPREDICATE: Comparing two items

        BiPredicate<Product, Product> isCategorySame = (p1, p2) -> p1.category.equals(p2.category);

        boolean match = isCategorySame.test(inventory.get(0), inventory.get(1));
        System.out.println("Is Matched : " + match);

    }

}




class Product {
    String name;
    double price;
    String category;

    Product(String name, double price, String category){
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return name + " (" + category + ") - $" + price;
    }

}
