class Averrage {
  public static void main(String[] args){
    double[] data = {-10.5, 8.1, 6.4, -3.0, -1.2, 0.9, 5.7};
    double average = 0.0d;
    for(double d : data) {
      average += d;
    }
    average = average / data.length;
    System.out.println("データの平均は"+average);
  }
}