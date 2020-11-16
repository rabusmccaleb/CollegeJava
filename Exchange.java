package cat;

public class Exchange extends Student   {
	
	
	public Exchange(String major, double gpa, int creditHours, String year, String country ) {
		super(major, gpa, creditHours);
		// TODO Auto-generated constructor stub
		this.year = year;
		this.country = country;
	}
	
	private String year;
	private String country;
	public String getYear(String year){
		return year;
	}
	
	public String getCountry(String country){
		return country;
		
	}
	
	public String here() {
		return "Ok's major:"+super.getmajor()+", gpa:"+super.getGpa(getGpa(4.2))+", and country"+ country;
	}
}
