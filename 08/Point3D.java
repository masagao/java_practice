public class Point3D extends Point2D {
  private double z;

  public Point3D(double x, double y, double z) {
    super(x, y);
    setZ(z);
  }

  public double getZ() {
    return this.z;
  }

  public void setZ(double z) {
    this.z = z;
  }

  public double getDistance() {
    return Math.sqrt(Math.pow(getX(), 2) + Math.pow(getY(), 2) + Math.pow(getZ(), 2));
  }

  public String toString() {
    return "(" + getX() + ", " + getY() + ", " + getZ() + ")";
  }
}
