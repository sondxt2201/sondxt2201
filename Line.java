package Point;

import java.util.Arrays;

public class Line {
    Point begin, end;    

    public Line(int x1, int y1, int x2, int y2) {
        begin = new Point(x1, y1);
        end = new Point(x2, y2);
    }

    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    //line getter
    public Point getBegin() {
        return this.begin;
    }
    public Point getEnd() {
        return this.end;
    }

    //Line setter
    public void setBegin(Point begin) {
        this.begin = begin;
    }
    public void setEnd(Point end) {
        this.end = end;
    }

    //Line's begin getter
    public int getBeginX() {
        return begin.getX();
    }
    public int getBeginY() {
        return end.getX();
    }
    public String getBeginXY() {
        return Arrays.toString(begin.getXY());
    }

    //Line's begin setter
    public void setBeginX(int x) {
        begin.setX(x);
    }
    public void setBeginY(int Y) {
        begin.setY(Y);
    }
    public void setBeginXY(int x, int y) {
        begin.setXY(x, y);
    }   

    //Line's end getter
    public int getEndX() {
        return end.getX();
    }
    public int getEndY() {
        return end.getY();
    }
    public String getEndXY() {
        return Arrays.toString(end.getXY());
    }

    //Line's end setter
    public  void setEndX(int x) {
        end.setX(x);
    }
    public void setEndY(int y) {
        end.setY(y);
    }
    public void setEndXY(int x, int y) {
        end.setXY(x, y);
    }

    public String toString() {
        return "Line [begin=" + this.begin + ", end=" + this.end + "]"; 
    }
    public double getLength() {
        return begin.distance(end);
    }
}
