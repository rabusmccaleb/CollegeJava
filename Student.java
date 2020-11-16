package cat;

public class Student {
private String major;
private double gpa;
private int creditHours;


public Student(String Major,double Gpa, int CreditHours) {
	this.major= Major;
	this.gpa = Gpa;
	this.creditHours= CreditHours;
}

///////////////////////////////////////////////////

public double getGpa( double Gpa) {
	return Gpa;
	}


////////////////////////////////////////////////////

public int cHours(int CreditHours) {
	return CreditHours;
}


public String getmajor() {
	return major;
}

///////////////////////////////////////////////////
public void  getYear(int x){
	 x = creditHours;
	if(x<32) {
		System.out.println("freshman");
	}
	
else if(x>32) {
		if(x<64) {
			System.out.println("Somphmmore");
		}
	}

else if(x>64) {
			if(x<96) {
			System.out.print("Junior");
			}
		}


else if(x>=96) {
			System.out.println("Junior");
			}
	
	
}


}




