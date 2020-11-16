package cat;

public class Graduate extends Student {
	private String concentration;
	private String Degree;
	private int years;
	
	
	public Graduate(String major, double gpa, int creditHours,String concentration , String Degree, int years) {
		super(major, gpa, creditHours);
		// TODO Auto-generated constructor stub
		this.concentration = concentration;
		this.Degree = Degree;
		this.years = years;
	}



	public int getYears(int years){
		return years;
	}
	
	public String getConcentration (String concentration){
		return concentration;
	}
	
 public String show(){
	 return"Mary’s concentration:"+ concentration + ", years:"+ years+ "spent in grad school and+ major" + super.getmajor();
 }
}
