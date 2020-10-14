class LockerTester {
  public static void main(String[] args) {
    Kinko k = new Kinko(1000);
    k.printDeposit();

    LockableJewelBox j = new LockableJewelBox(false);
    j.printEmpty();

    Lockable[] l = {k, j};
    for(Lockable i : l) i.lock();

    k.printDeposit();
    j.printEmpty();
  }
}
