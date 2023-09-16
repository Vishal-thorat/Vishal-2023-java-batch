package while_loop;

public class Case6 {
   public static void main(String[] args) {
	
	   boolean b=true;
	   if(b)
//		   int i=10;   //should not be declarative
	   
	   
	   while(b)
		   System.out.println("hi");     //infinity hi
	   
	   while(b)
		   int i=100;  //blocking scope {}
		   
}
}
