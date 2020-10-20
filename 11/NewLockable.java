public interface NewLockable {
  public static final int UNLOCKED = 0;
  public static final int LOCKED = 1;
  int ChangeLockState(int state);
  int getLockState();
}
