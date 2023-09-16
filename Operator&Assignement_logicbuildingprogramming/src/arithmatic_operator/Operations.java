package arithmatic_operator;

public class Operations {
	public static void main(String[] args) {

		byte b=1;
		byte c=2;
		int  r=b+c;  //byte
		System.out.println(r);
		
		int a1=19;
		float b1=2; 
		float r1=a1/b1;     //max (int,int,float)  //9
		System.out.println(r1);  //9
		
		double d=80.90;
		float f=80.91F;
		double r2=d+f;  //max (int,double,float)  //
		
		char c5 ='A';
		float f2=2;   //upcasting
		float r9=c5/f2;
		System.out.println(r9);
		
		
		double c4=10+20.00;    //	int c4=10+20.00;
		System.out.println(c4);
		
		//------------------------
		
		char c1='A';
//ch=ch+1;  //max(int char int)   downcasting  ch++ // ch=(char)ch+1;
		c1=(char)(c1+1);
		System.out.println(c1);
		
		byte b2=10;
		b2=(byte)(b2+1);  //b++; //b2=b2+1; //no boss both are different we cant do
		System.out.println(b2); //11
		
		
		int a=10;
		int y=++a;
		System.out.println(a);
		System.out.println(y);
	}
}
