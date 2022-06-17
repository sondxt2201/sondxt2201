package Point;

import java.util.Arrays;

public class LineSub extends Point {
    private Point end;

    //constructor;
    public LineSub(int x1, int y1, int x2, int y2) {
        super(x1, y1);
        this.end = new Point(x2, y2);
    };
    public LineSub(Point begin, Point end) {
        super(begin.getX(), begin.getY());
        this.end = end;
    };

    //getter and setter
    public Point getBegin() {
        return this;
    }
    public Point getEnd() {
        return this.end;
    }
    public void setBegin(Point begin) {
        super.setX(begin.getX());
        super.setY(begin.getY());
    }
    public void setEnd(Point end) {
        this.end = end;
    }

    //begin getter
    public int getBeginX() {
        return super.getX();
    }
    public int getBeginY() {
        return super.getY();
    }
    public String getBeginXY() {
        return Arrays.toString(super.getXY());
    }

    //begin setter
    public void setBeginX(int x) {
        super.setX(x);
    }
    public void setBeginY(int y) {
        super.setY(y);
    }
    public void setBeginXY(int x, int y) {
        super.setXY(x, y);
    } 

    //end getter
    public int getEndX() {
        return end.getX();
    }
    public int getEndY() {
        return end.getY();
    }
    public String getEndXY() {
        return Arrays.toString(end.getXY());
    }

    //end setter
    public void setEndX(int x) {
        end.setX(x);
    }
    public void setEndY(int y) {
        end.setY(y);
    }
    public void setEndXY(int x, int y) {
        end.setXY(x, y);
    } 

    public String toString() {
        return "[begin=" + super.toString() + ", end=" + this.end + "]"; 
    }
    public double getLength() {
        return super.distance(end);
    }
}
