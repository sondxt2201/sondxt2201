package Point;

public class TestPoint2D3D {
    public static void main(String[] args) {
        Point2D p1 = new Point2D(1,2);
        System.out.println("p1: " + p1.toString());
        Point2D p2 = new Point2D();
        System.out.println("p2: " + p2.toString());

        p1.setX(3); 
        p1.setY(4);
        System.out.println("p1's new x: " + p1.getX());
        System.out.println("p1's new y: " + p1.getY());
        System.out.println();

        Point3D p3 = new Point3D(5,6,7);
        System.out.println("p3: " + p3.toString());
        Point3D p4 = new Point3D();
        System.out.println("p4: " + p4.toString()); 

        p4.setX(8);
        p4.setY(9);
        p4.setZ(10);
        System.out.println("p4's new x: " + p4.getX());
        System.out.println("p4's new y: " + p4.getY());
        System.out.println("p4's new z: " + p4.getZ());


    }
    
}
