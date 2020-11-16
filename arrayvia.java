package cat;

import java.util.Scanner;

public class arrayvia {

	public static void main(String arg[]) {
		//System.out.println("please enter a list of numbers seperated by a comma and no spaces");
		//String userNumbers = rabus.nextLine().trim();
		
		
		Scanner rabus = new Scanner(System.in);
		String input = rabus.nextLine(); // Read 1st line
		String[] kitten = input.split(","); // Split based on comma
		Integer[] array = new Integer[kitten.length];
		for(int x = 0; x<= kitten.length; x++) {
			array[x] = Integer.parseInt(kitten[x]);
			
		}

		}
		
		//for(int x=0;x<kitten.length;x++)
       // {
       //     System.out.println(array[x]);
        //}
		
		
		
		
		
		
		
		
		
		// int index1 = userNumbers.indexOf(",");
		//String Number = userNumbers.substring(0,index1);
			
		
		
		//int cat = userNumbers.length();
		//System.out.println(cat);
		
		

}

	//private static void isSorted(Integer[] array) {
		// TODO Auto-generated method stub
		 

		
	


	
	

	


