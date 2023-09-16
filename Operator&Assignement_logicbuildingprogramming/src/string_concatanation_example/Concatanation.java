package string_concatanation_example;

public class Concatanation {
public static void main(String[] args) {
	
	String s1="Hello";
	String s2="good Morning";
	String r=s1+s2;
	System.out.println(r);
	//----------------------------------------
	
	String r1="hello" +" good morning";
	System.out.println(r1);
	//------------------------------------------------------------------
	
	String r2="ans="+23;
	System.out.println(r2);
	//----------------------------------------
	
	String name="Vishal";
	int age=23;
	
	System.out.println("Student name="+name);
	System.out.println("Student age="+age);
	//---------------------------------------------------------
	 //left to right
	String str=10+20+"10"+10+"20"+90+20+90;
	System.out.println(str);
	
	System.out.println(6+6+6+6);
	System.out.println("6"+6+6+6);
	System.out.println(6+6+"6"+6+6);
	
	int a=10;
	int b=20;
	String c="30";
	String r11=a+b+c;
	System.out.println(r11);
	
	System.out.println("" + 10 +true+10.23+'A');       //all in string as it is
	
	System.out.println(true+"10");
}
}
