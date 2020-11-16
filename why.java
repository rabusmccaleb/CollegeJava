package cat;
import java.util.Arrays;

public class why {
	public static void main(String arg[]) {
		int[] arrY= {1,10,4,3,8,5,7,6,9,2};
		System.out.println("before sort:" + Arrays.toString(arrY));
		
		int[] frog = SelectionSort ( arrY );
		System.out.println("After sort:" + Arrays.toString(arrY));
		
		int[] arrY1= {1,10,4,3,8,5,7,6,9,2};
		System.out.println("before sort:" + Arrays.toString(arrY1));
		
		int[] cat= bubbleSort ( arrY1 );
		System.out.println("After sort:" + Arrays.toString(cat));
		
		/////
		int[] arrY2= {1,10,4,3,8,5,7,6,9,2};
		System.out.println("before sort:" + Arrays.toString(arrY2));
		
		
		int[] dog= InsertionSort( arrY2 );
		System.out.println("After sort:" + Arrays.toString(dog));
		
	}
	
	
	public static int[] SelectionSort ( int [ ] arrY )
	{
	     int i, j, first, temp;  
	     for ( i = arrY.length - 1; i > 0; i -- )  
	     {
	          first = 0;  
	          for(j = 1; j <= i; j ++)   
	          {
	               if( arrY[ j ] < arrY[ first ] )         
	                 first = j;
	          }
	          temp = arrY[ first ]; 
	          arrY[ first ] = arrY[ i ];
	          arrY[ i ] = temp; 
	      }
	     return arrY;
	}
	
	
	
	public static int[] bubbleSort(int[] arrY1) {
		
		int n = arrY1.length;
		int temp = 0;
		
		for(int i=0; i < n; i++){
			for(int j=1; j < (n-i); j++){
				
				if(arrY1[j-1] < arrY1[j]){
					temp = arrY1[j-1];
					arrY1[j-1] = arrY1[j];
					arrY1[j] = temp;
				}}}
		return arrY1;
		}
	
	
	
	
	  public static int[] InsertionSort(int a[]) 
	    { 
		  int temp;
	        for (int i = 1; i < a.length; i++) {
	            for(int j = i ; j > 0 ; j--){
	                if(a[j] < a[j-1]){
	                    temp = a[j];
	                    a[j] = a[j-1];
	                    a[j-1] = temp;
	                }
	            }
	        }
	        return a;
	    }
}
