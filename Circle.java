package Circle;

public class Circle {
    public static final double DEFAULT_RADIUS = 1.0;
    public static final String DEFAULT_COLOR = "red";

    private double radius;
    private String color;


    //constructor
    public Circle() {
        this.radius = DEFAULT_RADIUS;
        this.color = DEFAULT_COLOR;
        System.out.println("Constructing Circle with Circle()");
    }
    public Circle(double radius) {
        this.radius = radius;
        this.color = DEFAULT_COLOR;
        System.out.println("Constructing Circle with Circle(radius)");
    }
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
        System.out.println("Constructing Circle with Circle(radius, color)");
    }

    //getter method
    public double getRadius() {
        return this.radius;
    }
    public String getColor() {
        return this.color;
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }
    public double getCircumference() {
        return 2.0 * radius * Math.PI;
    }

    //setter method
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Circle[radius=" + this.radius + ", color=" + this.color + "]";
    }
}

