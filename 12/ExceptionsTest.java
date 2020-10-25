import java.io.*;

public class ExceptionsTest {
  public static void main(String[] args){
  String aNumber;
  int number;
  try {
    int[] anArray = new int[10];
    System.out.print("数字を入力してください: n = ");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    aNumber = br.readLine();
    number = Integer.parseInt(aNumber);
    for (int i = 0;i < number;i++){
      anArray[i] = i;
    }
  } catch(NumberFormatException e) {
    System.out.println("例外は" + e + "です．");
  } catch(ArrayIndexOutOfBoundsException e) {
    System.out.println("例外は" + e + "です．");
  } catch(Exception e) {
    System.out.println("例外は" + e + "です．");
  }
  }
}
