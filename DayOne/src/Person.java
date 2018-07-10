
public class Person {

	
	private String name;
	private int age;
	private boolean family;
	
	
	public Person(){
		
	}
	public Person(String name, int age, boolean family){
		this.name=name;
		this.age=age;
		this.family=family;
	}
	
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isFamily() {
		return family;
	}

	public void setFamily(boolean family) {
		this.family = family;
	}

	public void setName(String name){
		this.name=name;
	}
	
	public String getName(){
		return name;
	}
	
	
	
	
	
	
	
}
