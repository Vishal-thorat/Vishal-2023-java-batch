package instanceof_example;

public class EntryPoint {
public static void main(String[] args) {
	
	Switcher s=new Switcher();
//	s.m1();
	
	//CASE --how to call method who having object o is param
	
 CC c=new CC();
	s.m1(c);
	s.m1(new CC());
	
//	s.m1(new BB());
	 

	s.m1(new BB());
	s.m1(new AA());
	
	
	
	
	
	
}
}
