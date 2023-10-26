package hw1_21000710_ChuQuocTuan;

public class Sphere {
    private double r;
    private double x;
    private double y;
    private double z;

    public Sphere(double r, double x, double y, double z) {
        this.r = r;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Sphere{" +
                "r=" + r +
                ", x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
