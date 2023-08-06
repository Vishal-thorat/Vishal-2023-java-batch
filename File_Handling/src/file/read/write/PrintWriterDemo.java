package file.read.write;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {
	
public static void main(String[] args)throws IOException {   //read line by line
		
		File f=new File("F:\\Vishal-2023-java\\Vishal-2023-java-batch\\File_Handling\\textfile.txt");
		
		FileWriter f1=new FileWriter(f,true);
		//***********Writer
		PrintWriter pr=new PrintWriter(f1);
		pr.println();
		pr.print(1000);
		pr.print("Hi Good Moring india");
		pr.print(true);
		pr.flush();
		pr.close();
		
		
		
		//**********Reader
		
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader (fr);
		
		String str=br.readLine();
		while(str !=null) {
			System.out.println(str);
			str=br.readLine();
		}
		
		br.close();
	}

}
