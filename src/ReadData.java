import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadData {

	public static void main(String[] args) throws IOException {
		
		//File reader using BufferedReader class and Using FileReader
		/*
		FileReader fr = new FileReader ("/Users/evakhan/eclipse-workspace/test.txt");
		
		BufferedReader br = new BufferedReader(fr);
		
		String str;
		 while((str = br.readLine())!= null) {
			 System.out.println(str);
		 }
		 br.close();
		
		 */
		 
		 //Approach 2: Scanner & file
		
		FileReader fr = new FileReader ("/Users/evakhan/eclipse-workspace/test.txt");
		
		Scanner sc = new Scanner (fr);
		
		/*//Loop to read the file
		
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
		
		*/
		//Approach 3
		
		sc.useDelimiter("//Z");
			System.out.println(sc.next());
			
			
		
		
		
		
	}

}
