class Schoolmate extends Person implements Friends {
  String nickname;

  public Schoolmate(String n) {
    super(n);
  }
  public void setNickname(String name) {
    this.nickname = name;
  }
  public String getNickname() {
    return this.nickname;
  }

  public static void main(String[] args) {
    Schoolmate s = new Schoolmate("masanao");
    s.setNickname("masa");
    System.out.println(s.getNickname());
  }
}
