package Ball;

import java.util.Arrays;

public class TestBall {
    public static void main(String[] args) {

    Ball b1 = new Ball(1,2,3,4);
    System.out.println(b1.toString() + "\n");

    b1.setX(5);
    b1.setY(6);
    b1.setXStep(7);
    b1.setYStep(8);
    System.out.println(b1.toString());
    System.out.println("x is: " + b1.getX());
    System.out.println("y is: " + b1.getY());
    System.out.println("x step is: " + b1.getXStep());
    System.out.println("y step is: " + b1.getYStep() + "\n");

    b1.setXY(9,10);
    b1.setXYStep(15,16);
    System.out.println(b1.toString());
    System.out.println("x and y are: " + Arrays.toString(b1.getXY()));
    System.out.println("x step and y step are: " + Arrays.toString(b1.getXYStep()) + "\n");
    System.out.println(b1.move());
    System.out.println(b1.move().move());
    }
}
