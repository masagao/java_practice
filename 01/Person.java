abstract class Person implements Job{
  String name;
  public Person(String n){
    this.name = n;
  }

  public String getName(){
    return this.name;
  }

  public void printInfo(){
    String s = getName()+"="+getJob();
    System.out.println(s);
  }
}
