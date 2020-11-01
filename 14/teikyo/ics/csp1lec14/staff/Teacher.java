package teikyo.ics.csp1lec14.staff;
import teikyo.ics.csp1lec14.*;

public class Teacher extends Person implements Worker, Settable{

  Job job = new Lecturer();

	public Teacher(){
		this.name = "Taro";
		this.age = 40;
		this.job = new Lecturer();
	}

	public void setValues(String name, int age) {
		this.name = name;
		this.age = age;
	}

  public Job getJob(){
    return this.job;
  }

	public void printInfo(){
		System.out.println( this.getName() + '/' + this.getAge() + '/' + this.job.getJobName());
	}

}
