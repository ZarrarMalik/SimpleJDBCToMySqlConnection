package MatillionTest;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class ComparingStringTest {
	

	@Test
		void sizeOfStrings() {	
		ComparingStrings comparingStrings = new ComparingStrings();
		assertTrue("The length of two strings should be equal", comparingStrings.lengthOfStrings("Raheem", "Stones"));
		assertTrue("The length of two strings should be equal", comparingStrings.lengthOfStrings("BLACKPOOL", "liverpool"));
		assertTrue("The length of two strings should be equal", comparingStrings.lengthOfStrings("56789", "12345"));
		assertTrue("The length of two strings should be equal", comparingStrings.lengthOfStrings("", ""));
	}

	@Test
		void sizeOfStringsCheck() {
		ComparingStrings comparingStrings = new ComparingStrings();
		assertFalse("This Test should return false for wrong length", comparingStrings.lengthOfStrings("Arsenal", "Totenham"));
		assertFalse("This Test should return false for wrong length", comparingStrings.lengthOfStrings("Suzanne", "SARAH"));
		assertFalse("This Test should return false for wrong length", comparingStrings.lengthOfStrings("1", "10000"));
		assertFalse("This Test should return false for wrong length", comparingStrings.lengthOfStrings("-1", "1"));
	}
		
	@Test
	
	public void shouldReturnUnmatchedItems() {
		ComparingStrings comparingStrings= new ComparingStrings();
		int unmatchedItems;
		String firstLine="D23W8MCCIZQOP9";
		String secondLine="D236862CEZQOPS";
		comparingStrings.setFirstStrng(firstLine);
		comparingStrings.setSecondStrng(secondLine);
		unmatchedItems=comparingStrings.matchedItems();
		assertEquals(5, unmatchedItems, "The number of unmatched items should be 5");
	
	}
	
	@Test
	public void shouldReturnUnmatchedItemsWithoutCases() {
		ComparingStrings comparingStrings= new ComparingStrings();
		int unmatchedItems;
		String firstLine="matillion";
		String secondLine="MATILLION".toLowerCase();
		comparingStrings.setFirstStrng(firstLine);
		comparingStrings.setSecondStrng(secondLine);
		unmatchedItems=comparingStrings.matchedItems();
		assertEquals(0, unmatchedItems, "The number of unmatched items should be 0");
	
	}
	@Test
	public void noMatchedItems() {
		ComparingStrings comparingStrings= new ComparingStrings();
		int unmatchedItems;
		String firstLine="123Isnotastring";
		String secondLine="ThisisaString£$";
		comparingStrings.setFirstStrng(firstLine);
		comparingStrings.setSecondStrng(secondLine);
		unmatchedItems=comparingStrings.matchedItems();
		assertEquals(15, unmatchedItems, "The number of unmatched items should be 0");
	
	}
	
	
}
