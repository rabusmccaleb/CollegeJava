package cat;

public class John {
	private int x,y;
	
	
	public static void main (String main[]) {
		System.out.print(cumsum(5));
		
		
	}
	
	public static int cumsum(int n ) {
		if(n==0) {return n;}
		else {return n + cumsum(n-1);}
	}
	
	public John(int x, int y) {
		this.x = x;
		this.y = y;
	}
	

}
