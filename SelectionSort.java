package cat;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String arg[]){
		int[] Sarray = {11,10,23,6,8,45,19,2,7,4,3,1};
		int[] kevin = selectionSort(Sarray);
		String tim = Arrays.toString(kevin);
		System.out.println(tim);
		
	}
	
	
	
	public static int[] selectionSort(int Sarray[]) 
	    { 
	        int length = Sarray.length; 
	  
	        for (int i = 0; i < length-1; i++) 
	        { 
	            int minindex = i; 
	            for (int j = i+1; j < length; j++) 
	                if (Sarray[j] < Sarray[minindex]) 
	                    minindex = j; 
	  
 
	            int temp = Sarray[minindex]; 
	            Sarray[minindex] = Sarray[i]; 
	            Sarray[i] = temp; 
	        }
	        return Sarray;
	        
	    } 
	
	
	
	
	
	
	}
