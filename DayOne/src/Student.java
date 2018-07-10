
public class Student extends Person{
	
	public String section, roll;
	
	
	
	public Student(String section, String roll) {
		super();
		this.section = section;
		this.roll = roll;
	}



	public Student(){
		
	}



	public String getSection() {
		return section;
	}



	public void setSection(String section) {
		this.section = section;
	}



	public String getRoll() {
		return roll;
	}



	public void setRoll(String roll) {
		this.roll = roll;
	}



	@Override
	public String toString() {
		return "Student [section=" + section + ", roll=" + roll + "]";
	}
	
	
	

}
