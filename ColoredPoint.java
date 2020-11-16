package cat;

public class ColoredPoint extends Point implements Colored{
	private static final String red = null;

	public String Colored1() {
		return red;
	}
	
		
	 public boolean equals(Object o) {
	       if (o instanceof Point) {
	           Point other = (Point) o;
	           return getX() == other.getX() && y == other.y && red ==  red;
	       } else {  
	           return false;
	       }
	   }
	 
	 public String toString() {
	       return "(" + getX() + ", " + getY() + "," + Colored1() +")";
	   }
	 

}
