class Rectangle {
  int width;
  int height;
  public Rectangle(int width, int height) {
    this.width = width;
    this.height = height;
  }
  public String toString() {
    return "[" + this.width + "," + this.height + "]";
  }

  public static void main(String[] args) {
    Rectangle rec = new Rectangle(123, 45);
    System.out.println(rec.toString());
  }
}
