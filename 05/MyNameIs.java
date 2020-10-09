public class MyNameIs {
  public static void main(String[] args) {
    String name = "帝京太郎";
    if(args.length != 1) {
      System.out.println("usage: java MyNameIs 名前");
    } else if(args[0].equals(name)) {
      System.out.println("私の名前は" + args[0] + "です");
    } else {
      System.out.println("私の名前は" + args[0] + "ではありません");
    }
  }
}
