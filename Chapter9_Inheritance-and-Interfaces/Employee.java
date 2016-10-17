package Chapter9;

// A Class to represent employees in general

public class Employee {
	private String name;
	
	public Employee() {
	}
	
	public Employee(String name) {
		setName(name);
	}
	
	public int getHours() {
		return 40;
	}
	
	public double getSalary() {
		return 40000.0;
	}
	
	public int getVacationDays() {
		return 10;
	}
	
	public String getVacationForm() {
		return "yellow";
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return "Employee: " + name;
	}
}
