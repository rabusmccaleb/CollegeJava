package cat;

import java.util.ArrayList;

public class exam2Practice {

	public static void main(String arg[]) {
		ArrayList<Integer> List= new ArrayList<Integer>();
		List.add(2);
		List.add(8);
		List.add(4);
		List.add(7);
		List.add(5);
		List.add(27);
		List.add(3);
		//System.out.print(power(3,4));
		int[] name = SortedAlist(List);
		System.out.print("");
		
	}
	
	public int[] SortedAlist(int[] List) {
		
		//int i,j,minValue,minIndex,temp=0;
		for(int x = 0; x<List.length;x++) {
			int minValue =List[x];
			int minIndex =x;
			
			for(int y = x; y<List.length; y++) {
				if(List[y] < minValue ) {
					minValue = List[y];
					minIndex=y;
					
				}
				
			}
			
			if(minValue<List[x]) {
				int temp = List [x];
				List[x] = List[minIndex];
				List[minIndex]=temp;
				
				
			}
		}
		return List;
	}


}
