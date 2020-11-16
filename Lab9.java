package cat;

public class Lab9 {
	
	public static void main(String arg[]) {
		int fa = Fibonacci(6);
		int fb = Fibonacci(10);
		int fc = Fibonacci(3);
		
		System.out.println("Fibonacci: ");
		System.out.println(fa);
		System.out.println(fb);
		System.out.println(fc);
		///////
		System.out.println("");
		System.out.println("");
		///////
		System.out.println("Cumulative Sum: ");
		int ca = cumulativeSum(6);
		int cb = cumulativeSum(10);
		int cc = cumulativeSum(3);
		System.out.println(ca);
		System.out.println(cb);
		System.out.println(cc);
		
		System.out.println("");
		System.out.println("");
		System.out.println("Print method: ");
		print(5);
		System.out.println();
		
		System.out.println("");
		System.out.println("");
		System.out.println("PrintNum method: ");
		printNum(6);
		System.out.println();
	}
	
	//////////////////////////////////////////////////
	public static int cumulativeSum(int n) {
		if (n == 0) {
			return 0;
		}else {
			return n + cumulativeSum(n-1);
		}
	}
	
	
	
	
	
	/////////////////////////////////////////////////
	public static int Fibonacci(int n)  {
	    if(n == 0)
	        return 0;
	    else if(n == 1)
	      return 1;
	   else
	      return Fibonacci(n - 1) + Fibonacci(n - 2);
	}

	
	/////////////////////////////////////////////////////////////////////
	/*
	 * 
	 *
	 *The output for those two methods below will be this:
	2 
	2 4 
	2 4 6 
	2 4 6 8 
	2 4 6 8 10 



	2 4 6 8 10 12 
	*/
	/////////////////////////////////////////////////////////////////////
	   public static void print(int n) {
		     if (n!=0){
			print(n-1);
		     	printNum(n);
			System.out.println();
			}
	      }

	public static void printNum(int n){
		if(n!=0){
				printNum(n-1);
				System.out.print(n+ n+ " ");
		}
	}
	
		
}
