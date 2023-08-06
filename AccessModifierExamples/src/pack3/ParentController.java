package pack3;

import java.sql.Date;

//import pack1.Controller;
//import pack2.Controller;

public class ParentController {

	public static void main(String[] args) {
		
	
	
		pack1.Controller c1=new pack1.Controller();
	c1.main();
	
	pack2.Controller c2=new pack2.Controller();
	c2.main1();
	
	
	long l=5454456551849l;
	Date d1=new Date(l);
	
	java.util.Date d2=new java.util.Date();
	d2.getYear();
	
	
	
} 
}