import java.util.ArrayList;

public class Item {
    private String name;
    private double price;

    public Item (String name, double price) {
        this.name = name;
        this.price = price;
    }

// Create a getter method
    public String getName(){
    return this.name;
}

// Create a getter method
    public double getPrice(){
    return this.price;
}

// Create a setter method
    public void setName(String name){
    this.name = name;
}

// Create a setter method
    public void setPrice(double price){
    this.price = price;
}


}