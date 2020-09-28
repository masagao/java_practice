class ProductItem {
  String name;
  int price;
  public ProductItem(String name, int price) {
    this.name = name;
    this.price = price;
  }

  public static void main(String[] args) {
    String name = "PC";
    int price = 100000;
    ProductItem pi = new ProductItem(name, price);
    System.out.println("name = " + pi.name + ", price= " + pi.price);
  }
}