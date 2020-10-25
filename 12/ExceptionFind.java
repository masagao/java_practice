public class ExceptionFind {
  public static void main(String[] args){
    try {
      Integer one = null;
      System.out.println(one.toString());
    } catch(NullPointerException e) {
      System.out.println("オブジェクトに null が使用されています.");
    }
  }
}
