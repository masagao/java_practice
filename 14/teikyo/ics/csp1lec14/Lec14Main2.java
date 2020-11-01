package teikyo.ics.csp1lec14;

public class Lec14Main2{

    public static void main(String[] args){
        try{
            Class c = Class.forName(args[0]);
            System.out.println("Target class is " + c.getCanonicalName());
            
            Lec14Main2 l = new Lec14Main2();
            l.getSuperclassHelper(c);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public Class getSuperclassHelper(Class targetClass) {
      Class s = targetClass.getSuperclass();

      if(s == null) return null;
      else System.out.println("Super class is " + s.getCanonicalName());

      return getSuperclassHelper(s);
    }
}
