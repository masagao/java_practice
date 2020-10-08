public class HeapStack {
  public String name;
  public HeapStack(String name) {
    this.name = name;
  }

  public String howOld(int age) {
    return name + "は" + age + "歳です";
  }

  public static void main(String[] args) {
    HeapStack hp = new HeapStack("Alice");
    System.out.println(hp.howOld(10));
  }
}
