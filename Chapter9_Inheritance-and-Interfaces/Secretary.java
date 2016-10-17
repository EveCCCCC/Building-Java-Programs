package Chapter9;

// A class to represent secretaries

public class Secretary extends Employee{
	public Secretary() {
		super();
	}
	public Secretary(String name) {
		super(name);
	}
	
	public void takeDictation(String text) {
		System.out.println(this.getName() + " Dictating text: " + text);
	}
	
	public String toString() {
		return "Secretary: " + this.getName();
	}
}
