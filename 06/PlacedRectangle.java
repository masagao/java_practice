class Rectangle {
  int width;
  int height;
  Rectangle() {
    setSize(0, 0);
  }
  Rectangle(int width, int height) {
    setSize(width, height);
  }
  void setSize(int width, int height) {
    this.width = width;
    this.height = height;
  }
  public String toString() {
    return "[" + width + "," + height + "]";
  }
}

class PlacedRectangle extends Rectangle {
  int x;
  int y;
  PlacedRectangle() {
    setLocation(0, 0);
  }
  PlacedRectangle(int x, int y) {
    setLocation(x, y);
  }
  PlacedRectangle(int x, int y, int width, int height) {
    setSize(width, height);
    setLocation(x, y);
  }
  void setLocation(int x, int y) {
    this.x = x;
    this.y = y;
  }
  public String toString() {
    return "[(" + x + ", " + y + "), (" + width + ", " + height + ")]";
  }
  public static void main(String[] args) {
    System.out.println("(1)");
    PlacedRectangle pr1 = new PlacedRectangle();
    System.out.println(pr1.toString());
    System.out.println("(2)");
    PlacedRectangle pr2 = new PlacedRectangle(10, 10);
    System.out.println(pr2.toString());
    System.out.println("(3)");
    PlacedRectangle pr3 = new PlacedRectangle(10, 10, 10, 10);
    System.out.println(pr3.toString());
  }
}
