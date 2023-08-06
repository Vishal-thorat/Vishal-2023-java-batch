package file.read.write;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoFiles {
	public static void main(String[] args)throws IOException {
//		String rootpath="F:\\Vishal-2023-java\\Vishal-2023-java-batch\\File_Handling\\MyFiles\\";
//		
//		File f=new File(rootpath,"abc.txt");
//		if(!f.exists()) {
//			f.createNewFile();  //if this line is write then also tis write in main--- throws IOException 
//		}
//		
//		FileWriter w=new FileWriter(f);
//		w.write("Hi Hello How are u");
//		w.flush();
//		w.close();
		
		
		FileWriter writer=new FileWriter("F:\\Vishal-2023-java\\Vishal-2023-java-batch\\File_Handling\\MyFiles\\test.txt");
		writer.write("Hello Good Morning" );
		writer.write("\n");
		writer.write(97);
		writer.write("\n");
		writer.write("This is end line");
		writer.flush();
		writer.close();
		
	}

}
