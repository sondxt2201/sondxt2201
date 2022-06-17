package Shape;

abstract public class Shape {
    private String color;

    //constructor
    public Shape(String color) {
        this.color = color;
    }
    
    public String toString() {
        return "color=" + this.color;
    }

    abstract public double getArea();
    //{
        //System.err.println("Shape unknown cannot compute area");
        //return 0;
    //}
}
