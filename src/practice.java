import java.util.Arrays;

public class practice {

	public static void main(String[] args) {
		
		
		//Find the total sale
		//the monthly average sale
		//find the number of months which have sales more than the average
		
		int sale []= {6,9,7, 10, 11, 9, 7, 12, 14, 15,13,11};
		
		String month[]= {"jan", "feb", "mar","april", "may","june","july", "aug","sep","oct","nov","dec"};
		//Find the total sale
		int totalSale =0;
		
		for(int i=0; i<sale.length; i++) {
			
			totalSale += sale[i];
				
		}
	
		System.out.println("The total sale is :" + totalSale);
		
		//the monthly average sale , get the double value
		
		double average = (double) totalSale / sale.length;
		System.out.println("the average monthly sale: " + average);

		//find the number of months which have sales more than the average
		
		 for (int i =0; i<sale.length; i++) {
			 if(sale[i]> average) {
				
				//System.out.println(sale[i]);
			 }
			 
			 
		 }
		
		 
		//find the highest sale 
		int  maxSale = sale[0];
		for (int i =0; i< sale.length; i++) {
			if (sale[i]> maxSale) {
				maxSale= sale[i];
				
			}
		}
		System.out.println("this is the max sale: " +maxSale);
		 
		 //find the minimum  sale 
		
		int minSale = sale[0];
		for (int i=0;i< sale.length; i++) {
			if(sale[i]< minSale) {
				minSale = sale[i];
			}
		}
		System.out.println("this is the min sale: " +minSale);
		 
	}

}

