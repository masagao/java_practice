class Point {
  int x;
  int y;
  public Point(int x, int y) {
    this.setPosition(x, y);
  }

  void setPosition(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public String toString() {
    return "(" + this.x + "," + this.y + ")";
  }

  public static void main(String[] args) {
    Point p = new Point(10, 20);
    System.out.println(p);
  }
}
