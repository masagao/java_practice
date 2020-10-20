class University {
  public static void main(String[] args) {
    Person[] person = {new Professor("太郎"), new Student("次郎"), new Student("花子")};
    for(int i = 0; i < person.length; i++) person[i].getInfo();
  }
}
