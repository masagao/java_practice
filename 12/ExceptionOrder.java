import java.io.*;

class ExceptionOrder {
  public static void main(String[] args) {
    try(PrintWriter pw = new PrintWriter(new FileWriter("sample.txt"));) {
      pw.println("Hello World");
    } catch(FileNotFoundException e) {
      System.out.println("FileNotFoundException");
    } catch(IOException e) {
      System.out.println("IOException");
    } catch(Exception e) {
      System.out.println("Exception");
    }
  }
}
