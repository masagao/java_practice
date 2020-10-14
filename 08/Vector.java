abstract public class Vector {
  private int dimension;
  private double[] elements;

  public Vector() {
    this.dimension = 2;
  }

  public Vector(int dimension) {
    setDimension(dimension);
  }

  public int getDimension() {
    return this.dimension;
  }

  public void setDimension(int dimension) {
    this.dimension = dimension;
    this.elements = new double[this.dimension];
  }

  public double getElement(int i) {
    return this.elements[i];
  }

  public void setElement(int i, double e) {
    this.elements[i] = e;
  }

  public String getElementsList() {
    String elementsList = "";
    int elementsLength = getDimension();

    for(int i = 0; i < elementsLength; i++) {
      elementsList += getElement(i);
      elementsList += (i == elementsLength-1 ? "" : ", ");
    }

    return elementsList;
  }

  public String toString() {
    return "(" + getElementsList() + ")";
  }
  
  abstract Vector scalarMultiplication(double scalar);

  abstract double innerProduct(Vector v);

  abstract Vector addVector(Vector v);
}
