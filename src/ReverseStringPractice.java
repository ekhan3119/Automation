
public class ReverseStringPractice {

	public static void main(String[] args) {
		
		String str = "fantistic";
		
		int length = str.length();
		
		String reverse = "";
		
		//reverse  the letter from the last index
		
		for (int i = length-1; i >=0; i--) {
			reverse += str.charAt(i);
			System.out.println(reverse);
		}
		
	
		
	}
	
	

}
