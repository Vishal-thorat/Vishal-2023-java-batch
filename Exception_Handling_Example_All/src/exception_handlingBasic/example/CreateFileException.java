package exception_handlingBasic.example;

import java.io.File;
import java.io.IOException;
public class CreateFileException {
	public static void main(String[] args) {          //Unhandled exception type IOException ---throws IOException
		File f=new File("IPL.pdf");
	try {
		f.createNewFile();       
		}catch(Exception e) {
			System.out.println(e);
		}
		                                               
		 
	}

}
