package utility.classes.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class CollectionsAndArrays {

	public static void main(String[] args) {
		
		ArrayList<String>al=new ArrayList<>();
		al.add("data1"); al.add("data2"); al.add("data3"); al.add("data4"); al.add("data5");
		
		//how to make aboVE ARRAYLIST OBJECT SECURE FROM MULTIPLE THREADS
		
		//OPTION ONE CONVERT ARRAY list into vecctor
	    //1]
         Vector<String>v=new Vector<>(al);
		
         //best option
         //2]
        //	use utility class static factory method
         List<String>list= Collections.synchronizedList(al);
         //ArrayList<String>list= (ArrayList<String>)Collections.synchronizedList(al);
         
         //******************************
         
         int [] data= {10,40,50,60,70,90,80,50,40,30,50};
         for (int i : data) {
			System.out.print(i + " ");
			}
         
         Arrays.sort(data);
         System.out.println();
         for (int i : data) {
 			System.out.print(i + " ");
 			}
	}
}
