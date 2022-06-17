package Point;

public class Point {
    private int x, y;

    //constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Point(){
        this.x = 0;
        this.y = 0;
    }

    //getter methods
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }

    //setter methods
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return "(" + this.x + "," + this.y + ")";
    }
    public int[] getXY(){
        int[] result = new int[2];
        result[0] = this.x;
        result[1] = this.y;
        return result;
    }

    //return the distance from this instance to the given point
    public double distance(int x, int y){
        int xdiff = this.x - x;
        int ydiff = this.y - y;
        return Math.sqrt(xdiff*xdiff + ydiff*ydiff);
    }
    public double distance(Point anotherPoint){
        int xdiff = this.x - anotherPoint.x;
        int ydiff = this.y - anotherPoint.y;
        return Math.sqrt(xdiff*xdiff + ydiff*ydiff);
    }
    public double distance(){
        return Math.sqrt(this.x*this.x + this.y*this.y);
    }
}
