package cat;

import java.util.Arrays;

public class Lab10 {
	public static void main(String arg[]) {
	int[] nums = {1,3,2,5,4,7,6,9,8,10,32,42,22,11,45};
	int Cat = SeqSer(nums,9);
	System.out.println(Cat);
	
	int Dog = BinSer(nums,9);
	System.out.println(Dog);
	
	int fish = BinRecSer(nums, 0, nums.length, 9);
	System.out.println(fish);
	
	}
	
	public static int SeqSer(int [] nums,int x) {
		for(int n = 0;n< nums.length; n++) {
			int r = nums[n];
			if(nums[n] == x) {
				return n;
			}
		}
		return 1;
	}
	
	
	
	public static int BinSer(int [] nums,int x) {
		Arrays.sort(nums);		
		int index1 = Arrays.binarySearch(nums,0,nums.length,x);
		return  index1;		
}
	
	 
	 
	 
	 
	 public static int BinRecSer(int[] nums, int begin, int Stop, int theNUM) {
			Arrays.sort(nums);	
		    int middle = (begin + Stop) / 2;
		    if(Stop < begin) {
		        return -1;
		    } 

		    if(theNUM==nums[middle]) {
		        return middle;
		    } else if(theNUM<nums[middle]) {
		        return BinRecSer(nums, begin, middle - 1, theNUM);
		    } else {
		        return BinRecSer(nums, middle + 1, Stop, theNUM);
		    }
	 }
	}


