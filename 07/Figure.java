class Figure {
  public String name;
  public Figure() {
    this.name = "Figure";
  }
  public double getArea() {
    return -1.0;
  }
  public static void main(String[] args) {
    Figure f = new Figure();
    System.out.println(f.name);
    System.out.println(f.getArea());

    f = new Circle(10.0);
    System.out.println(f.name);
    System.out.println(f.getArea());
  }
}

class Circle extends Figure {
  protected double radius;
  public Circle() {
    this.name = "Circle";
    setRadius(1.0);
  }
  public Circle(double radius) {
    this.name = "Circle";
    setRadius(radius);
  }
  protected void setRadius(double radius) {
    this.radius = radius;
  }
  public double getArea() {
    return Math.PI*radius*radius;
  }
}

class Square extends Figure {
  double side;
  public Square() {
    this.name = "Square";
    this.side = 1.0;
  }
  public Square(double side) {
    this.name = "Square";
    this.side = side;
  }
  public double getArea() {
    return side*side;
  }
}
