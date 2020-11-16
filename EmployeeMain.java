package cat;

public class EmployeeMain {
	public static void main(String arg[]) {
		Lawyer L = new Lawyer();
		janitor J = new janitor();
		HarvardLawyer HL = new HarvardLawyer();
		
		
		System.out.println("Lawyer");
		System.out.println("Hours: " + L.getHours()    );
		System.out.println("Salary: " + L.getSalary()  );
		System.out.println("Vacation Days: " + L.getVacationDays());
		System.out.println("Vaction Form(s): " + L.getVacationForm() );
		
		System.out.println("");

		System.out.println("Janitor");
		System.out.println("Hours: " + J.getHours()    );
		System.out.println("Salary: " + J.getSalary()  );
		System.out.println("Vacation Days: " + J.getVacationDays());
		System.out.println("Vaction Form(s): " + J.getVacationForm() );
		System.out.println(J.clean());
		
		System.out.println("");
		
		System.out.println("Harvard Lawyer");
		System.out.println("Hours: " + HL.getHours()    );
		System.out.println("Salary: " + HL.getSalary()  );
		System.out.println("Vacation Days: " + HL.getVacationDays());
		System.out.println("Vaction Form(s): " + HL.getVacationForm() );
		
		
		
	}
}
