package file.read.write;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
           
public class BufferedReaderDemo {
	public static void main(String[] args)throws IOException {   //read line by line
		
		File f=new File("F:\\Vishal-2023-java\\Vishal-2023-java-batch\\File_Handling\\textfile.txt");
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
