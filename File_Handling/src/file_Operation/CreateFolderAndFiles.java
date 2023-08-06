package file_Operation;

import java.io.File;
import java.io.IOException;

public class CreateFolderAndFiles {
	public static void main(String[] args)throws IOException {
		
		File f1=new File("MyDocuments");
		f1.mkdir();
		
		File f2=new File(f1,"My_resume.pdf");
				if(!f2.exists()){
					f2.createNewFile();
				}
				System.out.println("Done");
	}

}
