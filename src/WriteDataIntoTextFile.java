import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoTextFile{

	public static void main(String[] args) throws IOException {		
	
		FileWriter fw = new FileWriter("/Users/evakhan/eclipse-workspace/test.txt");
		
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Selenium java");
		System.out.println("finished");
		
		bw.close();
		
	}

}

