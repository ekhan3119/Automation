
public class ReverseStringPractice {

	public static void main(String[] args) {
		
		String str = "fantistic";
		
		String rev="";
		
		int length = str.length();
		
		for (int i= length -1; i >=0; i--) {
			rev += str.charAt(i);
		}
		System.out.println("Reverse string is: " + rev);
		
	}
	
	

}
