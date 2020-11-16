package cat;

import java.util.ArrayList;

import java.util.Scanner;
import java.util.Arrays;

public class Jarvis {
	public static void main(String arg[]) {
		int live;
		//Scanner person = new Scanner(System.in);
		//if(live = 1) {
		//	alive
		//}
	/// life is both recursive and tradional progaming 
		
		
		ArrayList <String> NameList = new ArrayList<String>();
		
		Scanner person = new Scanner(System.in);
		System.out.print("what is your name? ");
		System.out.println();
		String NewName = person.nextLine();// gap in dialogue
		NameList.add(NewName);// adds their name to array so it can use it later on.
		System.out.println("Hi " + NewName + "!");
		System.out.println("How are you doing today?");	
		String HAY = person.nextLine();// HAY= how are you?
		////////////////////////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////////////////////////
int HayCounter = 0;
String BadorGood;
		
		String[] Good = {"good","great","awesome","fine","well","perfect","Awesome","Great","Good","Fine","Well"};
		String[] Bad = {"bad","awful","shit","not good","Bad","Awful","Shit","Not","","","","","","",""};
		
		if(Good.length>Bad.length) {
			HayCounter = Good.length;
			BadorGood = "good";
		}else {HayCounter= Bad.length;
		BadorGood = "bad";	}//this is to loop to greatings without having to know the # of greetings
		// as you can see below the loop stops at the HayCounter.
		
		//System.out.println(HayCounter + BadorGood);// wanted to know if the index was working
		
		for(int x = 0; x< Good.length; x++){
			String G = Good[x];
			Boolean GCheck = G.equals(HAY);// Compares strings entered by the user
			
			if(GCheck == true) {
				System.out.println("I'm glad to hear that.");
				System.out.print("I doing pretty good also.");
			}	
		}
		
		
		for(int x = 0; x< Bad.length; x++){
			
			String B = Bad[x];
			Boolean BCheck = B.equals(HAY);// Compares strings entered by the user
		
			if(BCheck == true) {
				System.out.println("That sucks.");
				System.out.print("Not to brag, but I'm doing pretty great.");
			}	
		}
		////////////////////////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////////////////////////
		
		
		/// subjects of interest in a ranked order... will use for priority.
		int art = 5;
		int math = 0 ;
		int music = 3;
		int school = 1;
		int philosophy = 4 ;
		int entertainment =2 ;
		
		
		
		
		
		
		
		
		
		
		
	}

}
