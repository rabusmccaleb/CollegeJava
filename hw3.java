package cat;
//Rabus McCaleb

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class hw3 {

	public static void main(String arg[]) {
		System.out.println("Please enter 2 integers:");
		Scanner rabus = new Scanner(System.in);
		int  a = rabus.nextInt();
		int b =rabus.nextInt();
		System.out.print("The Multiplication between those two numbers are: ");
		multiply(a,b);
		System.out.println("" + multiply(a,b));
		
	}
	
	public static int multiply (int a, int b) {
		if (a == 0 || b == 0) {
			return 0;
		}
		if (b == 1) {
			return a;
		}
		if (a == 1) {
			return b;
		}
		
		else if( b < 0 ) {
		    return - a + multiply(a, b + 1);
		}

		else {
		    return a + multiply(a, b - 1);
		}
		
		
	}
	
	/*
	 Ok Rabus lets understand break this question...
	recursion stores stacks of commands in a row that depend on the finishing another stack which means that to get something to work I must first: understand the
	 logic of the problem before  applying a  recursive method.
	 
	 
	 recur(a b)
	 
	 if a or b = 0 say 0
	 if a = 1 say b 
	 if b = 1 say a
	 
	 else a + recur(a , do it until b-1 , b = 0)
	 
	*/
}
