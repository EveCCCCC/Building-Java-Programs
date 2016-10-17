package Chapter9;

public class EmployeeMain {
	public static void main(String[] args) {
		System.out.print("Employee: ");
		Employee edna = new Employee();
		edna.setName("Edna");
		System.out.print(edna.getHours() + ", ");
		System.out.printf("$%.2f, ", edna.getSalary());
		System.out.print(edna.getVacationDays() + ", ");
		System.out.println(edna.getVacationForm());
		System.out.print("Secretary: ");
		
		Secretary stan = new Secretary();
		stan.setName("Stan");
		System.out.print(stan.getHours() + ", ");
		System.out.printf("$%.2f, ", stan.getSalary());
		System.out.print(stan.getVacationDays() + ", ");
		System.out.println(stan.getVacationForm());
		stan.takeDictation("hello");
		
		Lawyer leia = new Lawyer();
		leia.setName("Leia");
		System.out.print(leia.getHours() + ", ");
		System.out.printf("$%.2f, ", leia.getSalary());
		System.out.print(leia.getVacationDays() + ", ");
		System.out.println(leia.getVacationForm());
		leia.sue();
		
		System.out.print("Legal Secretary: ");
		LegalSecretary lucy = new LegalSecretary();
		lucy.setName("Lucy");
		System.out.print(lucy.getHours() + ", ");
		System.out.printf("$%.2f, ", lucy.getSalary());
		System.out.println(lucy.getVacationDays() + ", ");
		
		System.out.println(edna);
		System.out.println(stan);
		System.out.println(leia);
		System.out.println(lucy);
	}
}
