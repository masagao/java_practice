package teikyo.ics.csp1lec14;
import java.io.*;
import teikyo.ics.csp1lec14.staff.*;
import teikyo.ics.csp1lec14.student.*;


public class Lec14Main{
    public static void main(String[] args) {
        if(args.length%3 != 0) {
            System.out.println("usage: java teikyo.ics.csp1lec14.Lec14Main Job Name Age...");
            return;
        }
        int n = args.length/3;
        Person persons[];
        persons = new Person[n];
        try{
            for(int i = 0; i < args.length; i++){
                if(i%3 == 0) {
                    if(args[i].equals("Teacher")) {
                        Teacher t = new Teacher();
                        t.setValues(args[i+1], Integer.parseInt(args[i+2]));
                        persons[i/3] = t;
                    } else if(args[i].equals("Student")) {
                        Student s = new Student();
                        s.setValues(args[i+1], Integer.parseInt(args[i+2]));
                        persons[i/3] = s;
                    }
                }
            }
            for(int i = 0; i < persons.length; i++) {
                persons[i].printInfo();
            }
        }catch(NumberFormatException e) {
            System.out.println("年齢が正しく入力されていません");
            return;
        }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("プログラム引数を見直してください");
            return;
        }catch(NullPointerException e) {
            System.out.println("プログラム引数を見直してください");
            return;
        }
    }
}
