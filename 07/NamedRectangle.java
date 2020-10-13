class Rectangle {
  int width;
  int height;

  void setSize(int width, int height) {
    this.width = width;
    this.height = height;
    System.out.println("setSize in Rectangle");
  }
}

public class NamedRectangle extends Rectangle {
  String name;
  @Override
  void setSize(int width, int height) {
    this.width = width;
    this.height = height;
    System.out.println("setSize in NamedRectangle");
  }

  public static void main(String[] args) {
    NamedRectangle nrect = new NamedRectangle();
    nrect.setSize(123, 45);
  }
}
