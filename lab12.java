package cat;
import java.util.Arrays;
import java.util.ArrayList;
public class lab12 {
	public static void main(String arg[]) {
	String[] Sarray = {"tammy", "paul", "johnson","kevin","peterson","michael","lee"};
	
	String[] kevin = SelectionSort(Sarray);
	System.out.println(Arrays.toString(Sarray));
	
	String[] Sarray2 = {"tammy", "paul", "johnson","kevin","peterson","michael","leeeeeeeeeeeeeeeeeeeeeeeee"};
	String[] Lisa = InsertionSort(Sarray2);
	System.out.println(Arrays.toString(Sarray2));
	
	String[] Sarray3 = {"tammy", "paul", "johnson","kevin","peterson","michael","lee"};
	int[] Sarray3nums = {11,10,23,6,8,10,45,19,2,7,4,3,1};
	
	NumWord(Sarray3, Sarray3nums);
	String tim = Arrays.toString(Sarray3nums);
	String him = Arrays.toString(Sarray3);
	String[] Array1 = {tim, him};
	ArrayList<String> NumsNStrings= new ArrayList<String>();
	for(int x = Sarray3nums.length-1; x>=0; x--) {
		int nums = Sarray3nums[x];
		String mike = Integer.toString(nums);
		NumsNStrings.add(mike);
		
	}
	for(int y = 0; y<=6;y++) {
		String names =Sarray3[y];
		//String mike = String.toString(names);
		NumsNStrings.add(names);
	}
	
	
	

	//System.out.println(Arrays.toString(Sarray3) + Arrays.toString(Sarray3nums) );
	//System.out.println(Arrays.toString(Array1));
	System.out.println(NumsNStrings);
	
	}
	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	public static String[] SelectionSort(String[] Sarray){
		for(int x = 0; x< Sarray.length;x++) {
			String ArrElmX = Sarray[x];
			int firstString = 0;
		for(int y = x+1;y <Sarray.length;y++) {
			String ArrElmY = Sarray[y];
			if(ArrElmX.length()> ArrElmY.length()) {
				firstString = y;
			}
			String temp = Sarray[ firstString ]; 
	          Sarray[ firstString ] = Sarray[ x ];
	          Sarray[ x ] = temp; 
		}
	}
		return Sarray;
}
	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	  public static String[] InsertionSort(String Sarray2[]) 
	    { 
		  
	        for (int i = 0; i < Sarray2.length; i++) {
	        	
	            for(int j = i ; j > 0 ; j--){
	                if(Sarray2[j].length() < Sarray2[j-1].length()){
	                    String temp = Sarray2[j];
	                    Sarray2[j] = Sarray2[j-1];
	                    Sarray2[j-1] = temp;
	                }
	            }
	        }
	        return Sarray2;
	    }
	  
	  
		/*
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
	  
	  public static void NumWord(String[] Sarray3, int[] Sarray3nums) {
			for(int x = 0; x< Sarray3.length;x++) {
				String ArrElmX = Sarray3[x];
				int firstString = 0;
			for(int y = x+1;y <Sarray3.length;y++) {
				String ArrElmY = Sarray3[y];
				if(ArrElmX.length()> ArrElmY.length()) {
					firstString = y;
				}
				String temp = Sarray3[ firstString ]; 
		          Sarray3[ firstString ] = Sarray3[ x ];
		          Sarray3[ x ] = temp; 
			}
		}
			
			int i, j, first, tempo;  
		     for ( i = Sarray3nums.length - 1; i > 0; i -- )  
		     {
		          first = 0;  
		          for(j = 1; j <= i; j ++)   
		          {
		               if( Sarray3nums[ j ] < Sarray3nums[ first ] )         
		                 first = j;
		          }
		          tempo = Sarray3nums[ first ]; 
		          Sarray3nums[ first ] = Sarray3nums[ i ];
		          Sarray3nums[ i ] = tempo; 
		      }
		  
	  }
	  
	  




}
