package cat;

public class HarvardLawyer extends Lawyer{
	 public int getVacationDays() {
		 return super.getVacationDays() + 3;
	 }
	 
	 public double getSalary() {
		double x= super.getSalary()*.20;
			return super.getSalary() +x;
	 }

	 
	 public String getVacationForm() {
		 return super.getVacationForm()+ ", " + super.getVacationForm() + ", "+ super.getVacationForm()
		 + ", "+ super.getVacationForm();
	 }
}
