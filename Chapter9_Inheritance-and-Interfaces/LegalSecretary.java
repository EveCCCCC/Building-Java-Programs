package Chapter9;

public class LegalSecretary extends Secretary{
	public LegalSecretary() {
		super();
	}
	public LegalSecretary(String name) {
		super(name);
	}
	
	// overrides getSalary from Employee class
	public double getSalary() {
		return super.getSalary() + 5000;
	}
	
	// new behavior of LegalSecretary objects
	public void fileLegalBriefs() {
		System.out.println("I could file all day!");
	}
	
	public String toString() {
		return "LegalSecretary: " + this.getName();
	}
}
