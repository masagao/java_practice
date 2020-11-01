package teikyo.ics.csp1lec14.student;
import teikyo.ics.csp1lec14.*;

public class Student extends Person implements Learner, Settable{

	Study study;

	public Student(){
		this.study = new Programming();
		this.age = 20;
		this.name = "Hanako";
	}

	public void setValues(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Study getStudy(){
    return this.study;
  }

	public void printInfo(){
		System.out.println( this.getName() + '/' + this.getAge() + '/' + this.study.getStudyName());
	}

}
