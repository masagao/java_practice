package teikyo.ics.csp1lec14.staff;
import teikyo.ics.csp1lec14.*;

public class Teacher extends Person implements Worker{

  Job job = new Lecturer();

	public Teacher(){
		this.name = "Taro";
		this.age = 40;
		this.job = new Lecturer();
	}

  public Job getJob(){
    return new Lecturer();
  }

}
