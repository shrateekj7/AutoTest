package Programs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataToTextFile {

	public static void main(String[] args) throws IOException {
		FileWriter wr=new FileWriter("C:\\Users\\Shrateek jaiswal\\Downloads\\sample3.txt");
		BufferedWriter bw=new BufferedWriter(wr);
		
		bw.write("This code is from selenium");
		
		System.out.println("finished");
		bw.close();
		
	}

}
