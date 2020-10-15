class LockerTester {
  public static void main(String[] args) {
    Kinko k = new Kinko(1000);
    LockableJewelBox j = new LockableJewelBox(false);

    k.lock(new KeyWord1());
    j.lock(new KeyWord2());

    k.unlock(new KeyWord2());
    j.unlock(new KeyWord2());

    k.printDeposit();
    j.printEmpty();
  }
}
