import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Menu items
        Item item1 = new Item("drip coffee", 1.5);
        Item item2 = new Item("mocha", 2.5);
        Item item3 = new Item("latte", 3.5);
        Item item4 = new Item("cappuccino", 6);

        // Order variables -- order1, order2 etc.
        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order();
        Order order4 = new Order();

        order3.addItem(item1);
        order3.addItem(item2);
        order3.addItem(item3);

        order3.getStatusMessage();
        order3.setReady(true);
        System.out.printf("Status: %s\n",order3.getStatusMessage());

        order3.getOrderTotal();
        System.out.printf("Total: %s\n",order3.getOrderTotal());

        order3.display();

        // order2.items.add(item1);
        // order2.total += item1.price;

        // order3.items.add(item4);
        // order3.total += item4.price;

        // order4.items.add(item2);
        // order4.total += item2.price;

        // order4.items.add(item2);
        // order4.total += item2.price;
        // order4.items.add(item2);
        // order4.total += item2.price;

        // Application Simulations
        // Use this example code to test various orders' updates
        
        // System.out.printf("Name: %s\n", order1.getName());
        // // System.out.printf("Total: %s\n", order1.total);
        // System.out.printf("Ready: %s\n", order1.isReady());

        // System.out.printf("Name: %s\n", order2.getName());
        // // System.out.printf("Total: %s\n", order2.total);
        // System.out.printf("Ready: %s\n", order2.isReady());

        // System.out.printf("Name: %s\n", order3.getName());
        // // System.out.printf("Total: %s\n", order3.total);
        // System.out.printf("Ready: %s\n", order3.isReady());

        // System.out.printf("Name: %s\n", order4.getName());
        // // System.out.printf("Total: %s\n", order4.total);
        // System.out.printf("Ready: %s\n", order4.isReady());
    }
}