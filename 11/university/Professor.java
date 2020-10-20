class Professor extends Person
                  implements Teacher{
    public Professor(String n){
        super(n);
    }
    public String getTeaching(){
 return "プログラミング 1";
    }
    public String getJob(){
        return "教授";
    }
}
