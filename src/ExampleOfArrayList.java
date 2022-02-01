import java.util.ArrayList;

public class ExampleOfArrayList {
	
	public static void main (String args[]) {
		
		//Create an array
		
		int arr[]= {3,5,7,9};
		
		
		ArrayList <Integer> a = new ArrayList ();
		a.add(100);
		a.add(5);
		
		ArrayList <String> car = new ArrayList();
		car.add("honda");
		car.add("toyata");
		
		car.remove(1);
		System.out.println(car);
	} 

}
