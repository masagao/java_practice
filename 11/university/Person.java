abstract class Person{
    String name;   //人の名前

    //コンストラクタ(引数に人の名前を指定）
    public Person(String n){
       this.name = n;
    }
    public String getName(){
      return this.name;
    }
    public void printInfo(){
       String s = getName()+"="+getJob() ;
       System.out.println(s);
    }

    public abstract String getJob();
}
