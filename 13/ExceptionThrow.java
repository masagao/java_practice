public class ExceptionThrow{
  public static void main(String[] args){
    int[] myarray = new int[3];
    try{
      System.out.println("代入します．");
      myAssign(myarray, 100, 0);
      System.out.println("代入しました．");
    }catch(ArrayIndexOutOfBoundsException ae){
      System.out.println("代入できませんでした．");
      System.out.println("例外は" + ae + "です．");
    }
    System.out.println("終了します．");
  }
  public static void myAssign(int[] array, int index, int value){
    System.out.println("myAssignに来ました");
    array[index] = value;
    System.out.println("myAssignから返ります");
  }
}
