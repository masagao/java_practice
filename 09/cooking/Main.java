package cooking;
import mytool.*;
import mytool.colorpen.*;
import myfood.*;

public class Main {
  public static void main(String[] args) {
    MyItem[] items = {new MyPen(), new MyApple(), new RedPen()};
    for(MyItem i: items)
      System.out.println("I have a/an " + i.getName());
  }
}
