class Rectangle {
  int width;
  int height;
  static int number = 0;

  Rectangle(int width, int height) {
    setSize(width, height);
    number = number + 1;
  }

  void setSize(int width, int height) {
    this.width = width;
    this.height = height;
  }

  int getArea() {
    return this.width * this.height;
  }

  static int getArea(Rectangle rect) {
    return rect.width * rect.height;
  }

  public static void main(String[] args) {
    Rectangle r = new Rectangle(10, 20);
    System.out.println(r.number);

    Rectangle s = new Rectangle(200, 10);
    System.out.println(s.number);

    System.out.println(Rectangle.number);
    System.out.println(r.number);

    System.out.println(r.getArea());
    System.out.println(Rectangle.getArea(s));
  }
}
