class A {
  int x = 1;
  int y = 2;
  int z = 3;
}

class B extends A {
  int y = 4;
}

class C extends B {
  int x = 5;
}

public class Encapsulation {
  public static void main(String[] args) {
    A a = new A();
    B b = new B();
    C c = new C();

    System.out.println("a.x = " + a.x);
    System.out.println("a.y = " + a.y);
    System.out.println("a.z = " + a.z);
    System.out.println("b.x = " + b.x);
    System.out.println("b.y = " + b.y);
    System.out.println("b.z = " + b.z);
    System.out.println("c.x = " + c.x);
    System.out.println("c.y = " + c.y);
    System.out.println("c.z = " + c.z);
  }
}
