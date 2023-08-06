package language.info;

class RR{
	int a;
	int b;
	public RR (int a,int b) {
		this.a=a;
		this.b=b;
	}
	RR(){}
	@Override
	public boolean equals(Object obj) {      //Object obj=new RR(10,20);
		
//		if(this.a == obj.a && this.b == obj.b) {   //error occured
//			return true;
		//}
		return false;
	}
	
}

public class HashtableRestriction {
public static void main(String[] args) {
	String s1=new String ("abc");
	String s2=new String ("abc");
	System.out.println(s1.equals(s2));  //true
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
	System.out.println(s1.hashCode() == s2.hashCode());
	
	System.out.println(">>>>>>>>>>><<<<<<<<<<<<<");
	
	
	RR r1=new RR(10,20);   //data same object same self refernence
	//System.out.println(r1);
    RR r2=new RR(10,20);	
	//System.out.println(r2);
	System.out.println(r1.equals(r2));  //true
	
	System.out.println(r1.hashCode());
	System.out.println(r2.hashCode());
	System.out.println(r1.hashCode() == r2.hashCode());
}
}
