package Point;

public class MoveTest{
    public static void main(String[] args) {
        MovablePoint p1 = new MovablePoint(1, 2);
        System.out.println("p1: " + p1.toString());
        
        p1.moveDown();
        System.out.println("p1: " + p1.toString());

        p1.moveLeft();
        System.out.println("p1: " + p1.toString());

        p1.moveRight();
        p1.moveRight();
        System.out.println("p1: " + p1.toString());
    }
    
}
