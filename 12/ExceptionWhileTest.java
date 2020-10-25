import java.io.*;

public class ExceptionWhileTest {
  public static void main(String[] args) {
    try {
      int c;
      while((c = System.in.read()) != -1){
        System.out.println(c);
      }
    } catch(IOException e) {
      System.err.println(e.getMessage());
    }
  }
}
