class LockerTester {
  public static void main(String[] args) {
    Kinko k = new Kinko(1000);
    LockableJewelBox j = new LockableJewelBox(false);

    PrintState[] state = {k, j};
    for(PrintState s: state) {
      s.print();
    }

    // Lockable[] state = {k, j};
    // for(Lockable s: state) {
    //   s.lock();
    // }

    // for(PrintState s: state) {
    //   s.print();
    // }
  }
}
