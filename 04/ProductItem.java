class ProductItem {
  char name;
  int price;

  public String toString() {
    return "[" + this.name + "," + this.price + "]";
  }

  public static void main(String[] args) {
    ProductItem pi = new ProductItem();
    pi.name = 't';
    pi.price = 100;
    System.out.println(pi.toString());
  }
}