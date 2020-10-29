import java.io.*;

class ExceptionOrder {
  public static void main(String[] args){
    PrintWriter pw = null;
    try {
      pw = new PrintWriter(new FileWriter("sample.txt"));
      pw.println("error");
    } catch(FileNotFoundException e) {
      System.out.println("FileNotFoundException");
    } catch(IOException e) {
      System.out.println("IOException");
    } catch(Exception e) {
      System.out.println("Exception");
    } finally {
      pw.close();
    }
  }
}
