package Point;


public class TestLine {
    public static void main(String[] args) {
        Line line_1 = new Line(1,2,3,4);
        System.out.println("line_1: " + line_1.toString());

        Line line_2 = new Line(new Point(3, 4), new Point(5, 6));
        System.out.println("line_2: " + line_2.toString() + '\n');

        line_1.setBegin(new Point(7,8));
        line_1.setEnd(new Point(9,10));
        System.out.println(line_1.toString());
        System.out.println("line_1's begin point is: " + line_1.getBegin());
        System.out.println("line_1's end point is: " + line_1.getEnd() + '\n');

        line_1.setBeginX(11);
        line_1.setEndY(15);
        System.out.println("line_1's new begin point is: " + line_1.getBeginXY());
        System.out.println("line_1's new end point is: " + line_1.getEnd() + '\n');

        line_2.setBeginXY(12, 13);
        line_2.setEndXY(17, 20);
        System.out.println("line_2's begin point is: " + line_2.getBegin());
        System.out.println("line_2's end point is: " + line_2.getEndXY() + '\n');

        System.out.printf("line_1's length is: %.2f%n ", line_1.getLength());
        System.out.printf("line_2's length is: %.2f%n ", line_2.getLength());

    }
}
