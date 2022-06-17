package Point;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("c1:" + c1.toString());

        Circle c2 = new Circle(1,2, 3.5);
        System.out.println("c2:" + c2.toString());

        Circle c3 = new Circle(new Point(3,5), 3.5);
        System.out.println("c3:" + c3.toString() + '\n');

        c1.setCenter(new Point(3, 4));
        c1.setRadius(2.3);
        System.out.println("c1's new center:" + c1.getCenter());
        System.out.println("c1's new radius:" + c1.getRadius() + '\n');

        c2.setCenterX(5);
        c2.setCenterY(7);
        c2.setRadius(10);
        System.out.println("c2's new x: " + c2.getCenterX());
        System.out.println("c2's new y: " + c2.getCenterY());
        System.out.println("c2's new radius: " + c2.getRadius() + '\n');

        c3.setCenterXY(8, 9);
        System.out.println("c3's new center: " + c3.getCenterXY() + '\n');
        

        System.out.printf("c1's Area: %.2f%n",c1.getArea());
        System.out.printf("c2's Circumsference: %.2f%n", c2.getCircumference());
        System.out.printf("Distance from c1 to c3: %.2f%n", c1.getDistance(c3));
        

        
    }
    
}
