class CountEven {
  public static void main(String[] args) {
    int a = 10;
    int count = 0;
    for(int i = 1; i <= a; i++){
      if(i % 2 == 0) count++;
    }
    System.out.println("Count="+count);
  }
}