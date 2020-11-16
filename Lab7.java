package cat;

import java.util.*;
public class Lab7 {
	
//////////////
	public static void main(String arg[]) {
		ArrayList <String> aList = new ArrayList<String>();
		ArrayList <String> aList2 = new ArrayList<String>();
		aList.add("Jake");
		aList.add("kevin");
		aList.add("Mike");
		aList.add("liz");
		aList.add("Tim");
		aList.add("Mark");
		System.out.println("Array list Before Odd removal: " + aList);
		removeOddLength(aList);
		System.out.println("Array list Odd removal: " + aList);
////////////////////////////////////////////////////////////
		System.out.println("Array list Before rearrangement: " + aList);
		swapPairs(aList, aList2);
		System.out.println("Array list rearrangement: " + aList);
////////////////////////////////////////////////////////////
		ArrayList <Integer> listofN1 = new ArrayList<Integer>();
		listofN1.add(1);
		listofN1.add(2);
		listofN1.add(4);
		listofN1.add(6);
		listofN1.add(8);
		listofN1.add(10);
		ArrayList <Integer> listofN2 = new ArrayList<Integer>();
		listofN2.add(1);
		listofN2.add(2);
		listofN2.add(3);
		listofN2.add(4);
		listofN2.add(5);
		listofN2.add(6);
		////////////////////////////////////////////////////////////
		System.out.println("List one of integers: "+ listofN1);
		System.out.println("List one of integers: "+ listofN2);
		intersect(listofN1 , listofN2 );
		System.out.println("The points at which this list interseccts is:"+listofN1);
	}
///////////////////////////////////////////////////////////////////
	public static void removeOddLength( ArrayList <String> aList ){
		for(int x =0;x <aList.size() ;x++) {
			String y= aList.get(x);
			int z = y.length();
			if (z % 2 != 0) {
				aList.remove(x);
			}
		}
	}
////////////////////////////////////////////////////////////
	public static void swapPairs( ArrayList <String> aList , ArrayList <String> aList2 ) {		
		   for(int i = 0; i <= aList.size() - 2; i += 2) {
		        String str = aList.get(i + 1);
		        aList.set(i + 1, aList.get(i));
		        aList.set(i, str);
		    }	
	}
////////////////////////////////////////////////////////////	
	public static void intersect(ArrayList <Integer> listofN1 , ArrayList <Integer> listofN2) {		
			listofN1.retainAll(listofN2);	
	}
}
