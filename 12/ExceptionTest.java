public class ExceptionTest {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("usage java ExceptionTest n");
            System.exit(1);
        }
        int n = Integer.parseInt(args[0]);
        int[] array = new int[3];
        try {
            System.out.println("配列を初期化します．");
            for(int i = 0; i < n; i++) {
                array[i] = i*2;
            }
            System.out.println("配列の初期化を完了しました．");
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("例外" + e + "が発生しました．");
        }
    }
}
