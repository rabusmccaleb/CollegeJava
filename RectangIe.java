package cat;
import java.io.*;
public class RectangIe {
	
	
	
	 private int height;
	 private int width;
	 private Point topCorner;
	 
	 
	/////////////////////////////////////////////////////////// 
	 ///////////////////////////////////////////////////////// 
	//////////////////////////////////////////////////////// 
	 /////////////////////////////////////////////////////
	 public class Point implements Comparable<Point> {
		    private int x;
		    private int y;
		    public Point() {
		        this(0, 0);
		    }
		    public Point(int x, int y) {
		        this.x=x;
		        this.y=y;
		    }
		    public int getX() {
		        return x;
		    }
		    public int getY() {
		        return y;
		    }
		    public String toString() {
		        return "(" + x + ", " + y + ")";
		    }
		    public int compareTo(Point pt){
			if(x==pt.x)
				return y-pt.y;
			else
				return x-pt.x;
		}
		} 
	/////////////////////////////////////////////////////////// 
	 /////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////// 
	 /////////////////////////////////////////////////////

	 //int x, int y
	 
	 public RectangIe(int height, int width, Point topCorner) {
		 this.height = height;
		 this.width = width;
		 this.topCorner= topCorner;
		 
	 }
	 
	 public int gety(int y) {
		 return y;
	 }
	 
	 public int retHeight(int height) {
		 return height;
	 }
	 
	 public int retWidth(int width) {
		 return width;
	 }
	 public Point getCorner(Point topCorner) {
		 return topCorner;
	 }
	 
	///////////////////////////////////////////////////////////
	 
	 /////////////////////////////////////////////////////////
	 
	//////////////////////////////////////////////////////// 
	 
	 /////////////////////////////////////////////////////
	
	 

}
