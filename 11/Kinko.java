public class Kinko implements Lockable, PrintState{
    boolean isLock = false;
    int deposit = 0;
    String keyToken;

    public Kinko(int d){
        deposit = d;
    }

    public boolean lock(MyKey k){
        keyToken = k.getKeyToken();
        isLock = true;
        return isLock;
    }

    public boolean unlock(MyKey k){
        if(keyToken == k.getKeyToken()) {
            isLock = false;
        }
        return isLock;
    }

    public void print() {
        printDeposit();
    }

    void printDeposit (){
        if(isLock == true)System.out.println("ロックされています");
        else System.out.println("預金額は"+deposit+"です");
    }
}
