package assignment_operator;

public class Test {
public static void main(String[] args) {
	//case 1 with primitive reference
	int a=10;
	Object o=new Object();
	
	//case2--chained assignemnt
	int b,c,d,e;
	b=c=d=e=20;   //chained assignemnt
	
//	int l=m=n=o=p=30;  chain assignment is not allow while declaration
	
	
	//case 3 --compund assignment   --take care of downcasting
	
	int y=10;
	y=y+20;   // y+=20;  compound assignment  y=(int)y+20;  typecasting
	System.out.println(y);
	
	
	byte z=10;  //down casting case
//	z=z+20;
	z +=20;    // z=(byte)z+20;   
	
	int m=10;
	m*=10;
	m-=25;
	m+=30;
	System.out.println(m);
	
}
}
