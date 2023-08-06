package file.read.write;

import java.io.FileWriter;
import java.io.IOException;

public class WriteDataInExistingFile {   //File is already exist  --- and i want to continue in that --i want to do append operation(,true)
	
	public static void main(String[] args) throws IOException{
		
		FileWriter writer=new FileWriter("F:\\Vishal-2023-java\\Vishal-2023-java-batch\\File_Handling\\MyFiles\\test.txt",true);
		writer.write(66 );
		writer.flush();
		writer.close();
	}

}
