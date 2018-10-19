package MatillionTest;

import java.util.Scanner;

public class MatchedCharacters {
	
	/*
	This class uses Scanner class for user input.
	Both the Strings are converted to lower case so as to avoid any ambiguity.  
	matchedItems() method determines the number of unmatched items.
	The problem that two strings=
	"D23W8MCCIZQOP9"
	"D236862CEZQOPS"
	produces 5 unmatched items. Hence the problem statement is satisfied.
     */
	
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		ComparingStrings cs = new ComparingStrings();
		System.out.println("Enter the first string to be matched = ");
		String first = sc.nextLine().toLowerCase();	
		System.out.println("Enter the second string to be matched = ");
		String second= sc.nextLine().toLowerCase();
		
		
		cs.setFirstStrng(first);
		cs.setSecondStrng(second);
	    System.out.println("The Number of Unmatched items = "+ cs.matchedItems());
		
		
	}

}
