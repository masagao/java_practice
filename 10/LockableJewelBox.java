public class LockableJewelBox extends JewelBox implements Lockable {
  boolean isLock = false;
  String keyToken;

  public LockableJewelBox(boolean e) {
    super(e);
  }

  public boolean lock(MyKey k) {
    keyToken = k.getKeyToken();
    isLock = true;
    return isLock;
  }

  public boolean unlock(MyKey k) {
    if(keyToken == k.getKeyToken()) {
        isLock = false;
    }
    return isLock;
  }

  public void printEmpty() {
    if(isLock == true) System.out.println("ロックされています。");
    else super.printEmpty();
  }
}
