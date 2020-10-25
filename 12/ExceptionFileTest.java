import java.io.*;

public class ExceptionFileTest {
  public static void main(String[] args) {
    try {
      FileReader reader = null;
      File file = new File("test.txt");
      reader = new FileReader(file);
      reader.close();
      System.out.println("ファイル処理完了");
    } catch(Exception e) {
      System.out.println(e);
    }
  }
}
