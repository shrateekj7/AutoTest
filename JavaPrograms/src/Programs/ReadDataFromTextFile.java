package Programs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataFromTextFile {

	public static void main(String[] args) throws IOException {
		
		//approach 1
		FileReader fr=new FileReader("C:\\Users\\Shrateek jaiswal\\Downloads\\sample3.txt");
		BufferedReader br=new BufferedReader(fr);
		
		String str;
		while((str=br.readLine())!=null)
		{
		System.out.println(str);	
		}
		br.close();
		
		//approach 2
		File file=new File("C:\\Users\\Shrateek jaiswal\\Downloads\\sample3.txt");
		Scanner sc=new Scanner(file);
		
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
		
		//approach 3
				File f=new File("C:\\Users\\Shrateek jaiswal\\Downloads\\sample3.txt");
				Scanner s=new Scanner(f);
				
				s.useDelimiter("\\Z");
				System.out.println(s.next());

	}

}
