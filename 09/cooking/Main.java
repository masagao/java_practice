package cooking;
import mytool.*;
import mytool.colorpen.*;
import myfood.*;

public class Main {
  public static void main(String[] args) {
    MyPen p = new MyPen();
    MyApple a = new MyApple();
    RedPen r = new RedPen();
    System.out.println("I have a " + p.getName());
    System.out.println("I have an " + a.getName());
    System.out.println("I have a " + r.getName());
  }
}
