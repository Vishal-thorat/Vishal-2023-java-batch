package instanceof_operator;

public class User {

	public void caller(Object obj) {   //--------------generic method anyone can pass 
		if(obj instanceof String) {
		
		String s1=(String)obj;
		int l=s1.length();
		System.out.println(l);
	}
		if(obj instanceof MathsOpt) {      //instanceof using this risk can be calculated  --downcasting
			MathsOpt m= (MathsOpt)obj;
			int r=m.square(100);
			System.out.println(r);
			
		}
}
}