package wrapperclasses.example;

public class WrapperClassWithEqualityOperator {

	public static void main(String[] args) {
		Integer k=new Integer(127);
		Integer k1=new Integer(127);
		System.out.println(k==k1);    //false
		
		Integer i=127;
		Integer j=127;
		Integer n=Integer.valueOf(127); 
		
		System.out.println(i==j);  //True
		System.out.println(j==n);  //True
		System.out.println(i==n);  //True
		
		Integer g=128;
		Integer h=128;
		System.out.println(g==h); //false
		
		
		System.out.println("<<<<<<<<");   //Buffer concept is not for this float and double
		Float f=new Float(100.10f);
		Float f1=100.00f;
		Float f2=100.00f;
		System.out.println(f1==f2);
		
		
		Character c=new Character('A');
		Character c1='A';         //valueof
		Character c2=Character.valueOf('A');
		System.out.println("<<<<<<<<"); 
		System.out.println(c=c1);   //false
        System.out.println(c1==c2);  //True
        System.out.println(c==c2);     //False
        
        
        
        Integer i4=new Integer(10);
        Integer i5=i4;
        System.out.println(i4==i5);  //true
        
        Integer i6=10;
        Integer i7=10;
        System.out.println(i6==i7);  //true
        
        Integer i8=1000;
        Integer i9=1000;
        System.out.println(i8==i9); //False Because of range exxceed
        
        
        System.out.println("<<<<--------------<<<<"); 
        Boolean b=new Boolean(false);
        Boolean b1=new Boolean("vishal");
        
        System.out.println(b==b1);           //false
        System.out.println(b.equals(b1));    //True
        
        Boolean s1=true;
        Boolean s2=true;
        System.out.println(s1==s2);   //True
        
        
        
        
        
        
        
        
		
	}
}
