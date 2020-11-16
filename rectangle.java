package cat;

public class rectangle {
	private int x;
	private int y;
	private int height;
	private int width;
	
	public rectangle(int X, int Y, int H, int W) {
		this.x = X;
		this.y = Y;
		this.height = H;
		this.width = W;
	}
	public int changeSizeH(int H) {
		this.height = H;
		return H;
		
	}
	public int changeSizeW(int W) {
		this.width = W;
		return W;
		
	}

	
	public int getx(int x) {
		return x;
	}
	
	public int gety(int y) {
		return  y;
	}
	
	public int getheight(int height) {
		return height;
	}
	
	public int getwidth(int width) {
		return width;
	}
	
	public String S1() {
		return "Coordinate is (" + x + "," + y + ") and dimension is " + width + " x " + height;
		
	}
	
	public String S2() {
		return "Area is " + width*height;	
	}



}








