package Shape;


public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Rectangle("red", 4, 5);
        System.out.println(s1.toString() + "\n");

        Shape s2 = new Triangle("blue", 5, 6);
        System.out.println(s2.toString() + "\n");

        // Shape s3 = new Shape("green");
        // System.out.println("Shape [" + s3.toString() + "]" + "\n");

        System.out.println("Rectangle's area is: " + s1.getArea());
        System.out.println("Triangle's area is: " + s2.getArea());
        // System.out.println("Shape's area is: " + s3.getArea());

        
    } 
}
