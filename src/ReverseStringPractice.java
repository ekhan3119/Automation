
public class ReverseStringPractice {
	//Solution one
	public static void solvingReverse() {	

	//solution 1
	String str = "fantistic";
	
	int length = str.length();
	
	String reverse = "";
	
	//reverse  the letter from the last index
	
	for (int i = length-1; i >=0; i--) {
		reverse += str.charAt(i);
	
	}
	 System.out.println(reverse);
}
	//solution two
	static void solutionTwo() {
		String name= "babydoll";
		
		String rev="";
		char letter[]= name.toCharArray();
		int length=letter.length;
		for (int i= length-1; i>=0; i--) {
			rev+=letter[i];
		}
		 System.out.println(rev);
	}
	
	//Reverse String with string buffer class
	
	static void bufferString() {
		String buff= "I am a string";
		
		StringBuffer sb = new StringBuffer(buff);
		System.out.println(sb.reverse());
	}

	

	public static void main(String[] args) {
		

		solvingReverse();
		
		solutionTwo();
		
		bufferString();
		
		
	}
	
	

}
