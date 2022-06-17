package Author;

public class Book {
    private String name;;
    private Author author;
    private double price;
    private int quantity;

    public Book(String name, Author author, double price, int quantity) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return this.name;
    }
    public Author getAuthor() {
        return this.author;
    }
    public double getPrice() {
        return this.price;
    }
    public int getQuantity() {
        return this.quantity;
    }

    public String toString() {
        return "Book{" + this.name + "} by {" + this.author + "} cost is " + this.price + "vnd and quantity is: " + this.quantity;
    }
}
