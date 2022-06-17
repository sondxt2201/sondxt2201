package Circle;

public class Cylinder extends Circle {
    private double height;
    
    //constructor
    public Cylinder() {
        super();
        this.height =  1.0;
        System.out.println("Constructing Cylinder with Cylinder()");
    }
    public Cylinder(double height) {
        super();
        this.height = height;
        System.out.println("Constructing Cylinder with Cylinder(height)");
    }
    public Cylinder (double height, double radius) {
        super(radius);
        this.height = height;
        System.out.println("Constructing Cylinder with Cylinder(height, radius)");
    }
    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
        System.out.println("Constructing Cylinder with Cylinder(height, radius, color)");
    }

    //getters and setters
    public double getHeight() {
        return this.height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume() {
        return super.getArea() * this.height;
    }
    public double getArea() {
        return 2*Math.PI*getRadius()*getHeight() + 2*super.getArea();
    }
    public double getBaseArea() {
        return super.getArea();
    }
    
    public String toString() {
        return "Cylinder[" + super.toString() + ", height: " + this.height + "]";
    }
}
