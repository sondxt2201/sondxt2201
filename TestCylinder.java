package Circle;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cy1 = new Cylinder();
        System.out.println("Cylinder cy1 has:" +
                "Radius is: " + cy1.getRadius() +
                ", Height is: " + cy1.getHeight() +
                ", Color is: " + cy1.getColor() +
                ", Base Area is: " + cy1.getBaseArea() +
                ", Area is: " + cy1.getArea() +
                ", Volume is: " + cy1.getVolume());

        System.out.println();
        Cylinder cy2 = new Cylinder(5, 8);
        System.out.println("Cylinder cy2 has:" +
                "Radius is: " + cy2.getRadius() +
                ", Height is: " + cy2.getHeight() +
                ", Color is: " + cy2.getColor() +
                ", Base Area is: " + cy2.getArea() +
                ", Volume is: " + cy2.getVolume());

        System.out.println();
        Circle c1 = new Circle();
        System.out.println("Circler c1 has:" +
                "Radius is: " + c1.getRadius() +
                ", Color is: " + c1.getColor() +
                ", Area is: " + c1.getArea());

    }

}
