class X {
  int a;

  public static void main(String[] args) {
    X x, a;
    x = X();
    X.a = 10;
    x.a = 10;
    a.x = 10;
    System.out.println(x.a);
  }
}