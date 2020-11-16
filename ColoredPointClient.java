package cat;

public class ColoredPointClient {
	public static void main(String arg[]) {
		
		Point P = new ColoredPoint();
		ColoredPoint CP = new ColoredPoint();
		//CP.equals(o);
		CP.toString();
		CP.equals(CP);
		System.out.println(CP.toString() +
		CP.equals(CP));
	}

}
