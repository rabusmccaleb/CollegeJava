package cat;

public class Client {
	
	public static void main(String arg[]) {
		Undergraduate Alex = new Undergraduate("Cs",3.9, 54, true);
		Graduate Mary = new Graduate("Computer Science",4.1,31,"Cyber Security", "Masters", 1);
		
		
	
		
		System.out.print(Alex.show());
		System.out.print(Mary.show());
	}

}
