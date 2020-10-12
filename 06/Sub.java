public class Sub {
  Class c;
  public Sub() {
    super();
    c = getClass();
    System.out.println(c);
    System.out.println(c.getSuperclass());
  }

  public static void main(String[] args) {
    Sub s = new Sub();
  }
}
