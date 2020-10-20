class Student extends Person
                       implements Learner{
    public Student(String n){
        super(n);
    }
    public String getLearning(){
 return "情報科学プログラミング 1";
    }

    public String getJob(){
        return "学生";
    }

    public void printInfo(){
       String s = getName()
                      +"="+getJob()
                      +":"+getLearning();
       System.out.println(s);
    }
}
