package method.Overriding.examples;

import java.io.File;
import java.io.IOException;

class AAA{
	void m1() throws Exception {
		
	}
	}
class BBB extends AAA{
	@Override
	void m1() throws IOException {
		
		File f=new File("Notes.doc");
		f.createNewFile();
}
}
public class Quickoveridestart {

	
	public static void main(String[] args)throws Exception {
		AAA a =new AAA();
		a.m1();
	}
}
