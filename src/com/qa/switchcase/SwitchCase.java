package com.qa.switchcase;


public class SwitchCase {

	// Switch case statements are used when we have a large if else statement chain
	// Days of the week (if (day == "Monday")) 
	// Used by having a single variable you're checking for

	public static int fruitSwitchCase(String fruit) {

		int rating = 0;

		// This is the variable we're telling it to listen to, can be any data type
		switch(fruit) {

		case "kiwi": // case - this is the code block for if fruit = kiwi
			
			rating = 10;
			break;   // break - used to stop other cases from happening

		case "watermelon":
			rating = 2;
			break;

		case "mango": 
			rating = 5;
		
			break;

		default: // else {} used if the switch isnt covered by one of the above cases
			
			break;
		} 

		return rating;

	}

}