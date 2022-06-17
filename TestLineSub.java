package Point;

public class TestLineSub {
    public static void main(String[] args) {
        LineSub l1 = new LineSub(1,2,3,4);
        System.out.println("l1:" + l1.toString() + '\n');

        LineSub l2 = new LineSub(new Point(5, 6), new Point(7, 8));
        System.out.println("l2:" + l2.toString() + '\n');

        l1.setBegin(new Point(8, 9));
        l2.setEnd(new Point(9, 10));
        System.out.println("l1's new begin:" + l1.toString());
        System.out.println("l2's new end:" + l2.toString());

        l1.setBeginX(10);
        l1.setBeginY(15);
        l2.setEndX(11);
        l2.setEndY(18);
        System.out.println("l1's new begin's x: " + l1.getBeginX());
        System.out.println("l1's new begin's y: " + l1.getBeginY());
        System.out.println("l2's new end's x: " + l2.getEndX());
        System.out.println("l2's new end's y: " + l2.getEndY() + '\n');

        l1.setEndXY(14, 15);
        l2.setBeginXY(16, 17);
        System.out.println("l1's new end: " + l1.getEndXY());
        System.out.println("l2's new begin: " + l2.getBeginXY());
        System.out.println();
        System.out.printf("l1's length: %.2f%n", l1.getLength());
    }
    
}
