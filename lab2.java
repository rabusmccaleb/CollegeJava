package cat;
import java.util.Scanner;
import java.util.Arrays;
public class lab2 {
	
	public static void main(String arg[]) {
		Scanner A = new Scanner(System.in);
		int[] nums = new int[10];
		
		//places the entered numbers in the array
		for (int i = 0; i < nums.length; i++) {
			System.out.print("Enter a number: ");
			nums[i] = A.nextInt();	
		}
		
		

/*
	//prints the original order of the array	
		System.out.print("Your original array:[");
		for(int x = 0; x< nums.length;x++) {
				System.out.print(nums[x]+",");
		}
		System.out.print("]");
		
*/
		
		//prints the reverse order of the array
		System.out.println("");
		System.out.print("your array in reverse order:[");
		reverseArray(nums);
		System.out.print("]");
		
		// trying to print max:
		System.out.println("");
		System.out.print("Your largest integer Entered is:");
		getLargest(nums);
		
		
	//doubling the array:	
		computeTwice(nums);
	}
	public static void reverseArray(int[] nums) {
	
		
		for (int y = 9; y > 0;y--) {
			System.out.print(nums[y] + ",");
		}
		System.out.print(nums[0]);
	}
	
	public static int getLargest(int nums[]) {
		for(int z=1;z<=1;z++) {
		Arrays.sort(nums);
		System.out.print(nums[9]);
		}
		return nums[9];
		
	}
	public static void computeTwice(int[] nums) {
		System.out.println("");
		System.out.print("Your original array doubled:[");
		for(int x = 0; x< nums.length;x++) {
				System.out.print(nums[x]*2 +",");
		}
		System.out.print("]");
		
		
	}



}

