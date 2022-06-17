package Shape;

public class Triangle extends Shape{
    private int base, height;

    public Triangle(String color, int base, int height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    public String toString() {
        return "Triangle [base=" + this.base + ", height=" + this.height + ", " + super.toString() + "]";
    }

    public double getArea() {
        return 0.5 * base * height;
    }
    
}
