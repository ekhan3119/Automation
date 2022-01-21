import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			int[] a = { 4, 6, 8, 9 };
			System.out.println(a[4]);
		} catch (Exception e) {
			System.out.println("an exception happen");
		}
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your favorite number?");
		
		try {
		int n = scan.nextInt();
		System.out.println(n);
		}catch (Exception e) {
			System.out.println("Please enter a number");
		}
		
		try {
		int [] a =null;
		System.out.println(a[1]);
		}catch (NullPointerException e) {
			System.out.println("Your array is null");
		}
	}

}
