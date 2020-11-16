package cat;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayorder {
	
	public static void main(String arg[]) {
		Scanner M = new Scanner(System.in);
		System.out.println("Enter a set of numbers seperated by a comma without any spaces:");
		String N = M.nextLine();
		String[] P = N.split(",");
		Integer[] Q = new Integer[P.length];
		Arrays.sort(P);
			for(int x = 0; x<= P.length - 1; x++) {
				Q[x] = Integer.parseInt(P[x]);
				System.out.println(Q[x]);
	}
			
			if(Q.length>= P.length) { 
				System.out.println("True");
				}
				
				 else {
					System.out.println("False");
				}
				
			
			
	
		
}
}
