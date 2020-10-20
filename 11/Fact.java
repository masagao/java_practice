class Fact {
  public static void main(String[] args) {
    if(args.length <= 0) {
      System.out.println("入力値が無効です。");
      return;
    }

    int x = Integer.parseInt(args[0]);

    if(x <= 0) {
      System.out.println("入力値が無効です。");
      return;
    }

    int result = fact(x);
    System.out.println(x + "の階乗は" + result);
  }

  public static int fact(int x) {
    if(x == 0) return 1;
    return fact(x-1) * x;
  }
}
