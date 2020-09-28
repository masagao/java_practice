class PreSubject {
  public static void main(String[] args) {
    double[] a = {-0.5, 1.0, 3.0};
    double[] b = a;
    b[1] = -1.0;
    System.out.println(a.length);
    System.out.println(a[1]);
    System.out.println(b[1]);
  }
}