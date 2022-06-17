package Point;

import java.util.Arrays;

public class Circle {
    private Point center;
    private double radius;
    
    //constructor
    public Circle() {
        this.center = new Point();
        this.radius = 1.0;
    }
    public Circle(int xCenter, int yCenter, double radius) {
        this.center = new Point(xCenter, yCenter);
        this.radius = radius;
    }
    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    //Circle setter
    public void setCenter(Point center) {
        this.center = center;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    //Circle getter
    public Point getCenter() {
        return this.center;
    }
    public double getRadius() {
        return this.radius;
    }

    //Center's getter
    public int getCenterX() {
        return this.center.getX();
    }
    public int getCenterY() {
        return this.center.getY();
    }
    public String getCenterXY() {
        return Arrays.toString(this.center.getXY());
    }

    //Center's setter
    public void setCenterX(int x) {
        this.center.setX(x);
    }
    public void setCenterY(int y) {
        this.center.setY(y);
    }
    public void setCenterXY(int x, int y) {
        this.center.setXY(x, y);
    }

    public String toString() {
        return "[center=" + this.center + ", radius=" + this.radius + "]";
    }

    //Get Area
    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }
    //get Circumfernece
    public double getCircumference() {
        return 2.0 * this.radius * Math.PI;
    }
    //get distance
    public double getDistance(Circle anotherCircle) {
        return center.distance(anotherCircle.center);
    }
}
