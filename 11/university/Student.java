class Student extends Person implements Learner {
  public Student(String n) {
    super(n);
  }

  public String getLearning() {
    return "情報科学プログラミング1";
  }

  public String getJob() {
    return "学生";
  }
}
