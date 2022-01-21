import java.util.Arrays;

public class arraySort {

	public static void main(String[] args) {
		
		//What is array sort
		
/*		
		int saleArray[] = {10, 20, 25, 63, 96, 57};
		
		int secondArray[] = {40, 20, 35, 63, 96, 17};
		
	      int size = saleArray.length;
	      
	      int secondSize= secondArray.length;
	      
	      System.out.println(size);
	      
	      
	      Arrays.sort(secondArray);
	      
	      System.out.println("sorted Array ::"+Arrays.toString(secondArray));
	      
	      int highestNum = secondArray[secondSize-1];
	      
	      System.out.println("largest element is ::"+ highestNum);
	      */
	      
	      int age[] = {5, 10, 40, 100, 3, 95, 56, 1,16, 23, 101};
	      
	      //who has the highest age?
	      int size = age.length;
	      System.out.println(size);
	      
	      //sort in asce  order
	      Arrays.sort(age);
	      
	      //print in string format the age array
	      System.out.println("sorted Array: " + Arrays.toString(age));
	      
	      //get the last value in the array and print
	      int highestAge= age[size-1];
	      System.out.println(highestAge);

	}

}
