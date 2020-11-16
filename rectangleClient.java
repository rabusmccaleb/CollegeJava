package cat;

public class rectangleClient {
	public static void main(String arg[]) {
		rectangle R1 = new rectangle(5,12,8,4);
	System.out.println(R1.S1());
	System.out.println(R1.S2());
	
	R1.changeSizeW(3);
	R1.changeSizeH(10);
	System.out.println(R1.S1());
	System.out.println(R1.S2());

}
}
