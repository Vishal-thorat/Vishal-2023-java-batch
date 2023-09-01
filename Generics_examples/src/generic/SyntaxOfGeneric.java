package generic;

import java.util.ArrayList;

public class SyntaxOfGeneric {
	public static void main(String[] args) {
		
		ArrayList al=new ArrayList<String>();
		al.add(100);
		al.add("abc");
		
		
		ArrayList al1=new ArrayList<String>();
		al1.add(100);
		al1.add("abc");
		
		ArrayList<String>al2=new ArrayList();
		al2.add("abc");
		
		ArrayList<String>al3=new ArrayList<String>();
		al3.add("abc");
		
	}

}
