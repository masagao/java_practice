abstract class Person{
  String name;

  public Person(String n) {
    this.name = n;
  }

  public String getName() {
    return this.name;
  }

  public void getInfo() {
    String s = getName() + "=" + getJob();
    System.out.println(s);
  }

  public abstract String getJob();
}
