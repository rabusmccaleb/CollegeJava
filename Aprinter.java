package cat;

public class Aprinter {
	public static void main(String arg[]) {
	PC[] elements = {new PC(), new GamingPC(), new DELLGamingPC(), new HPGamingPC()};
	for(int i = 0; i<elements.length; i++) {
		elements[i].method1();
		System.out.println();
		elements[i].method2();
		System.out.println();
		System.out.println(elements[i]);
		System.out.println();
	}

}
}
