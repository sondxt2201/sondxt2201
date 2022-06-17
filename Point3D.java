package Point;

public class Point3D extends Point2D {
    private int z;

    //constructor
    public Point3D() {
        super();
        this.z = 0;
    }
    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    //getter and setter
    public void setZ(int z) {
        this.z = z;
    }
    public int getZ() {
        return this.z;
    }

    public String toString() {
        return "Point3D (x:" + super.getX() + ", y:" + super.getY() + ", z:" + this.z + ")";
    }
}
