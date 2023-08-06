package file.read.write;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterDemo {
	
	public static void main(String[] args)throws IOException {
		
		File f=new File("F:\\Vishal-2023-java\\Vishal-2023-java-batch\\File_Handling\\textfile.txt");
		
		//if u select filewriter then u can directly communicate with file or may be u can use file object to communicate
		FileWriter fr=new FileWriter(f,true);
		
		//drawback BufferedWriter never communicate to file need some writer
		BufferedWriter buff=new BufferedWriter(fr);
		
		//buff.write(int char);// if u want to write 'A' buff.write(65)
		//buff.write(char[]arr);
		//buff.write(String str);
		//buff.newLine();
		//buff.flush();
		//buff.close();
		buff.write(65);
		buff.newLine();
		char []arr= {'K','L','M','N'};
		buff.write(arr);
		buff.newLine();
		buff.write("Hello Good Morning India");
		buff.flush();
		buff.close();
	}

}
