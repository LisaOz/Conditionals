package com.qa.conditionals;


public class Conditionals {

//	Given 2 integer values greater than 0, return whichever is closest to 21 
//	without going over 21. If they both go over 21 then return 0

// What to do if they are both the same value, house wins 
	public static int Blackjack(int x, int y) {

		if(x > 21 && y > 21) {
			return 0;
		} else if (x > 21) { // if both of them aren't over 21 AND x is over 21 - y has won
			return y;
		} else if (y > 21) {
			return x;
		} else if (x > y) {
			return x;
		} else {
			return y;
		}
	// Run this from the main and check the syso - sanity
	// with coverage
	// green - tested and successful
	// yellow - branching code, haven't fully tested it
	// red = not tested or test fails
	}
	


public static String Example(int number) {
	number = 8;
		if(number < 10) {
				
			return "Number is less than 10";
		} else {
			
			return "Number is greater than 10";
	}
		

	
}
		

}


