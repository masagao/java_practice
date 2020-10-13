class Circle {
  int radius;
  Circle() {
    setRadius(1);
  }
  Circle(int radius) {
    setRadius(radius);
  }
  void setRadius(int radius) {
    this.radius = radius;
  }
  int getRadius() {
    return radius;
  }

  public String toString() {
    return "(radius = " + getRadius() + ")";
  }
}

class PlacedCircle extends Circle {
  int x;
  int y;
  PlacedCircle() {
    setLocation(0, 0);
  }
  PlacedCircle(int x, int y) {
    setLocation(x, y);
  }
  PlacedCircle(int x, int y, int radius) {
    setRadius(radius);
    setLocation(x, y);
  }
  void setLocation(int x, int y) {
    this.x = x;
    this.y = y;
  }
  public String toString() {
    return "(x, y, r) = (" + x + ", " + y + ", " + radius + ")";
  }
  public static void main(String[] args) {
    System.out.println("(1)");
    PlacedCircle pc1 = new PlacedCircle();
    System.out.println(pc1.toString());
    System.out.println("(2)");
    PlacedCircle pc2 = new PlacedCircle(12, 34);
    System.out.println(pc2.toString());
    System.out.println("(3)");
    PlacedCircle pc3 = new PlacedCircle(12, 34, 45);
    System.out.println(pc3.toString());
  }
}
