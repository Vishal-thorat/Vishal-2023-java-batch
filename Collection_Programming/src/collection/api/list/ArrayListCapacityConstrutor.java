package collection.api.list;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListCapacityConstrutor {
	public static void main(String[] args) {
		//default construtor 1
		ArrayList al=new ArrayList();   //size //capacity
		
		for(int i=1;i<=10;i++) {
			System.out.println(i);
			al.add(i);
		}
		System.out.println(al.size());
		//here capacity of arraylist is =10;
		
		//new capacity=current capacity 3/2 +1
		al.add(100);
		//here capacity of arraylist =16;    //perfomance down --increse go with sizein advanced
		
		//----------------------------------------------
		
		ArrayList<Integer> all=new ArrayList<>(100);
		
		/* 1] Arraylist
		 * insertion order is preserve 
		 * duplicate allow 
		 * diff type object is allow
		 * null object insertion is allow
		 * 
		 * Why arraylist  ---key>> most of the operation is search on index then we can go with arratList
		 * 
		 */
		
		LinkedList<Integer> list=new LinkedList<>();
		list.add(10);
		 //here we are making linkedlist ka arraylist we can do blindly search operation  -we know index
		ArrayList<Integer> al1=new ArrayList<>(list); //*************
		
		//key feature od arraylist 
		
		/* 1] Arraylist
		 * insertion order is preserve 
		 * duplicate object are allow 
		 * diff type(heterogenuos)(generic) object is allow
		 * null object insertion is allow (any time )
		 * 
		 * Why arraylist  ---key>> most of the operation is search on index then we can go with arratList
		 * 
		 * 
		 * Arraylist ---collection ,list 
		 * >>>RandomAccess(index and search faster),clonable,serializable (clonable (copy making),serializable(across network send ) ----all collection api implmentation class uses or implementation done by all)
		* marker interface( je pahije te deto --the functionality of marker interface runtime jvm include in corresponding class)
		* growable or resizable data structure         
		* 
		* All classes of collection api already override tostring
		 */
		
	}

}
