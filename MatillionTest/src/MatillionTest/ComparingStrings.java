package MatillionTest;

public class ComparingStrings {
	
	// Two strings variables
	private String firstStrng;
	private String secondStrng;
	
	
	//Empty constructor
	public ComparingStrings() {
		
	}
	
	
	//Overloaded constructor
	public ComparingStrings(String firstStrng, String secondStrng) {
		super();
		this.firstStrng = firstStrng;
		this.secondStrng = secondStrng;
	}
	
	
	
	public String getFirstStrng() {
		return firstStrng;
	}


	public void setFirstStrng(String firstStrng) {
		this.firstStrng = firstStrng;
	}


	public String getSecondStrng() {
		return secondStrng;
	}


	public void setSecondStrng(String secondStrng) {
		this.secondStrng = secondStrng;
	}

	
	// lengthOfStrings() method determines if both the strings are of equal length or not
	public boolean lengthOfStrings(String first, String second) {
		
		boolean stringLength;
		
		if (first.length()!=second.length()) {
				stringLength = false;
		}else {
				stringLength = true;	 
	}
		return stringLength;
	}
	
	
	//matchedItems() method determines the unmatched items.
	public int matchedItems() {
		
		int noOfElements =0;
		
		if (lengthOfStrings(firstStrng, secondStrng)==true) {
			
		char firstStringToChar [] =firstStrng.toCharArray();
		char secondStringToChar [] =secondStrng.toCharArray();
		
		for (int i =0; i < firstStringToChar.length; i++) {
			
			if (firstStringToChar[i]!= secondStringToChar[i]) {
				noOfElements ++;
		}
			
		}
		}else {
			System.out.println("The strings length do not match");
		}
		return noOfElements;
	}
	}
	
	
	