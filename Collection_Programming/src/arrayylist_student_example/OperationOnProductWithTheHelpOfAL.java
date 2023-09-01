package arrayylist_student_example;

import java.util.ArrayList;
import java.util.Iterator;

public class OperationOnProductWithTheHelpOfAL {
  
	public static void main(String[] args) {
		//size 4 =>>valid index 0-3
		ArrayList<Product> al=new ArrayList<Product>();  //only product object store
//		Product p=new Product(1,"TV","Electronic ");
//		al.add(p);
		//replace ment
		al.add(new Product(1,"TV","Electronic "));
		al.add(new Product(2,"phone","Electronic "));
		al.add(new Product(3,"mango","Food "));
		al.add(new Product(4,"notebbok","study material "));
		
		System.out.println(al);    //there to string override to print data of arraylist(AL)
		
		//I am using for loop  --2 ways
		
		for (int i=0;i<al.size();i++) {
		Product p=	al.get(i);
		System.out.println(p); 
		}
		
		
		//using while loop (we dont know end point  of AL)
		
		int j=0;
		while(j<al.size()) {
			Product p=	al.get(j);
			System.out.println(p); 
			j++;
		}
		
		//forEach  //work in generic type condition (data type fix)
		for (Product p :al){
			System.out.println(p);   //heterogenous  int ,employee ,product that case it will not work
		}
		
		//curson iterator ,listiterator enumeration -trevels object
		
		Iterator<Product>itr=al.iterator();
		while(itr.hasNext()) {
			Product p=	itr.next();
			System.out.println(p);
		}
		
		
}
}