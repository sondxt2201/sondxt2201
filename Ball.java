package Ball;

public class Ball {
    private double x, y, xStep, yStep;

    public Ball(double x, double y, double xStep, double yStep) {
        this.x = x;
        this.y = y;
        this.xStep = xStep;
        this.yStep = yStep;
    }
    public double getX() {
        return this.x;
    }
    public double getY() {
        return this.y;
    }
    public double getXStep() {
        return this.xStep;
    }
    public double getYStep() {
        return this.yStep;
    }

    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public void setXStep(double xStep) {
        this.xStep = xStep;
    }
    public void setYStep(double yStep) {
        this.yStep = yStep;
    }

    public String toString() {
        return "Ball@(" + x + "," + y +"), speed = (" + xStep + "," + yStep + ")";
    }

    public double[] getXY() {
        double[] result = new double[2];
        result[0] = this.x;
        result[1] = this.y;
        return result;
    }
    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double[] getXYStep() {
        double[] result = new double[2];
        result[0] = this.xStep;
        result[1] = this.yStep;
        return result;
    }
    public void setXYStep(double xStep, double yStep) {
        this.xStep = xStep;
        this.yStep = yStep;
    }

    public Ball move() {
        x += xStep;
        y += yStep;
        return this;
    }

}
