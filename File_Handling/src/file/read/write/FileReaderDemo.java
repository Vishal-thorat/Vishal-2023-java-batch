package file.read.write;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class FileReaderDemo {   //character by character reader --performance down
	
	public static void main(String[] args)throws IOException {
		
		File f=new File("F:\\Vishal-2023-java\\Vishal-2023-java-batch\\File_Handling\\textfile.txt");
		
		 FileReader fr=new FileReader("F:\\Vishal-2023-java\\Vishal-2023-java-batch\\File_Handling\\textfile.txt");
		
		 // FileReader fr=new FileReader(f);
		//int ch=(char) fr.read();  // read method return ASCII values -(Unicode value) 
		 //if file is over fr.read() return (-1)  --file data empty then return (-1)
		 
		//read  character by character -reader
		 int ch= fr.read();
		 while(ch !=-1) {  
			 char c =(char)ch;
			 //System.out.print((char)ch);
			 System.out.print(c);
			 ch=fr.read();		
			 }
		 fr.close();
		 
		 //**here problem is we are reading character by character --solution
//		 
//		 long charSize=f.length();
//		 char[]arr=new char[(int)charSize];
//		 
//		 fr.read(arr);  
//		 
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
//		fr.close();
		
		
	}

}
