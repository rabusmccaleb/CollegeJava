package cat;

public class janitor extends employee {
	public int getHours() {
		return super.getHours() *2; 
		}
		public double getSalary() {
			return super.getSalary()-10000;
		}
		public int getVacationDays() {
			return super.getVacationDays()/2;
		}
		public String getVacationForm() {
		return "yellow";
		} 
		
		public String clean() {
			return"Cleaning!";
		}

}
