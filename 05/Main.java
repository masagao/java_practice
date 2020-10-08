public class Main{
  public static void main(String[] args) {
    if(args.length > 0) {
      for(int i = 0; i < args.length; i++){
        System.out.println("args[" + i + "] = " + args[i]);
      }
    } else {
      System.out.println("コマンドライン引数がありません");
    }
  }
}
