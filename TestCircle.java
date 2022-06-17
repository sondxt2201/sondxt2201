package Circle;

public class TestCircle {
    public static void main(String[] args) {

        Circle circle_1 = new Circle(1.1, "blue");
        System.out.println(circle_1 + "\n");

        Circle circle_2 = new Circle(2.2);
        System.out.println(circle_2 + "\n");

        Circle circle_3 = new Circle();
        System.out.println(circle_3 + "\n");

        circle_1.setRadius(3.3);
        circle_1.setColor("black");
        System.out.println(circle_1 + "\n");

        System.out.println("The radius of the circle is " + circle_1.getRadius());
        System.out.println("The color of the circle is " + circle_1.getColor());
        System.out.printf("The area of the circle is %.2f%n", circle_1.getArea());
        System.out.printf("The circumference of the circle is %.2f%n", circle_1.getCircumference());
    }
}