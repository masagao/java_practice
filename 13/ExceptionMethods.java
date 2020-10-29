public class ExceptionMethods {
  public static void main(String[] args){
    try{
      method1(0);
    }catch(Exception e){
      System.out.println("method1：" + e);
    }
    try{
      method2(0);
    }catch(Exception e){
      System.out.println("method2：" + e);
    }
    try{
      method3(0);
    }catch(Exception e){
      System.out.println("method3：" + e);
    }
  }
  static void method1(int x) throws Exception{
    if (x < 0){
      throw new Exception();
    }
  }
  static void method2(int x) throws Exception{
    if (x < 0){
      throw new Exception();
    }
  }
  static void method3(int x) throws Exception{
    if (x < 0){
      throw new Exception();
    }
  }
}
