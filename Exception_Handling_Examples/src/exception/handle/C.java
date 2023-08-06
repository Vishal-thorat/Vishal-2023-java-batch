package exception.handle;

import java.io.File;

public class C {

	
	public void doC() {
//		String str=null;                     //unchecked exception
//		System.out.println(str.length());
		
		File f=new File("resume.doc");
		try {
		f.createNewFile();
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("I am C class");
		
		
	}
}
