public class Point2D {
  private double x;
  private double y;

  public Point2D(double x, double y) {
    setX(x);
    setY(y);
  }

  public double getX() {
    return this.x;
  }

  public void setX(double x) {
    this.x = x;
  }

  public double getY() {
    return this.y;
  }

  public void setY(double y) {
    this.y = y;
  }

  public double getDistance() {
    return Math.sqrt(Math.pow(getX(), 2) + Math.pow(getY(), 2));
  }

  public String toString() {
    return "(" + getX() + ", " + getY() +")";
  }
}
