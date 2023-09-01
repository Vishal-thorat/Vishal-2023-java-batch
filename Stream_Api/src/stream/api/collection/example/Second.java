package stream.api.collection.example;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Second {
   public static void main(String[] args) {
	 
	   List<Integer>list =Arrays.asList(10,20,30,40,50,60,70,80,90);
	   
	   Iterator<Integer>itr=list.iterator();
	   while(itr.hasNext()) {
		   Integer i=itr.next();
		   if(i%2==0) {
			   System.out.println(i);
		   }
	   }
	   
	   
	//   list.stream().filter(i->i%2==0).forEach(System.out :: println);
	   
	   list.stream().filter(i->i%2==0).forEach(i->System.out.println(i));
}
}
