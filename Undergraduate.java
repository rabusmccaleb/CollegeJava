package cat;

public class Undergraduate extends Student {
	
	public Undergraduate(String major, double gpa, int creditHours, Boolean honors) {
		super(major, gpa, creditHours);
		// TODO Auto-generated constructor stub
		this.honors = honors;
	}

	private Boolean honors;
	
	
	public Boolean isHonors(Boolean honors) {
		if (honors = true) {}
		return honors;
	}
	

	public String show(){
		return"Alex’s major:"+ super.getmajor()+ ", gpa"+ super.getGpa(getGpa(3.9)) + ", year Freshman" + "Honnors:Yes"  ;
	}
}
