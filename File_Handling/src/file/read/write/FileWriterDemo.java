package file.read.write;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
	
	public static void main(String[] args)throws IOException {
		
	File f=new File("F:\\Vishal-2023-java\\Vishal-2023-java-batch\\File_Handling\\textfile.txt");
    if(!f.exists()) {
    	f.createNewFile();
    	
    }
    
    FileWriter fr=new FileWriter(f,true);
    //1  fr.write(int ch);  fr.write(65);  
    //2  fr.write(char [] arr);
    //3  fr.write (String str);
    //4  fr.flush()  &&   fr.close()
    
    //limitation here if you want to say please write to next line need ---need to next line character manually like e.g fr.write("\n")
    
    fr.write(65);  //A
    fr.write(66);   //B
    fr.write("\n");   //New Line --Nextline
    char []arr= {'L','M','N','P'};
    fr.write(arr);
    fr.write("\n");
    fr.write("I am String Param");   //New Line
    fr.flush();
    fr.close();
    
    
    
    
    
}
}