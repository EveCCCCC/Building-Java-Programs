package Chapter9;

public class EmployeeMain1 {
	public static void main(String[] args) {
		SuperclassAsInput();
		System.out.println();
		SuperclassToArray();
	}
	
	// 9.3.0	Superclass as an input type
	public static void SuperclassAsInput() {
		Employee edna = new Employee("Edna");
		Lawyer lucy = new Lawyer();
		Secretary stan = new Secretary();
		Employee leo = new LegalSecretary("Leo");
		
		superClassPrint(edna);
		superClassPrint(lucy);
		superClassPrint(stan);
		superClassPrint(leo); 
		((LegalSecretary)leo).takeDictation("Hello");
		((LegalSecretary)leo).fileLegalBriefs();
		System.out.println("\n" + (leo instanceof Employee));
		System.out.println((leo instanceof LegalSecretary) + "\n");
	}
	// 9.3.0	Superclass as an input type
	public static void superClassPrint(Employee e) {
		 System.out.print(e.getHours() + ", ");
		 System.out.printf("$%.2f, ", e.getSalary());
		 System.out.print(e.getVacationDays() + ", ");
		 System.out.print(e.getVacationForm() + ", ");
		 System.out.println(e); // calls toString 
	}
	
	// 9.3.1	Polymorphism Mechanics
	// Superclass to construct an array
	public static void SuperclassToArray() {
		Employee[] employees = {new Employee("Edna"), new Lawyer(), new Secretary(), new LegalSecretary("Leo")};
		for (Employee e : employees) { 
			superClassPrint(e);
		 }
		((LegalSecretary)employees[3]).takeDictation("Hello");
		((LegalSecretary)employees[3]).fileLegalBriefs();
	}
}
