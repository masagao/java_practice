class Count {
  public static void main(String[] args) {
    int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    int cnt = 0;
    int i = 0;
    while(i < data.length) {
      if(data[i] % 2 == 0) cnt++;
      i++;
    }
    System.out.println(cnt);
  }
}