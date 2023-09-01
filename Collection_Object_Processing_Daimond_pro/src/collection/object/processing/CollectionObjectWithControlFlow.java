package collection.object.processing;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionObjectWithControlFlow {
	public static void main(String[] args) {

		List<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		al.add(70);
		al.add(80);
		al.add(45);
		al.add(100);
		// first way to print AL object
		System.out.println(al); // al.tostring

		// 2] for loop
		// String have length() && array have .length property
//		for (int i = 0; i < al.size(); i++) {
//			System.out.println(al.get(i));
//		}
		
		//3] while loop
		
//		int j=0;
//		while(j<al.size()) {
//			System.out.println(al.get(j));
//			j++;
//		}
		
		//4] for each
		
//		for(Integer i :al) {
//			System.out.println(i);
//		}
		
		//assignment
		//create new one more list & add inside that list only even number from above list
		
		List<Integer>evenNo=new ArrayList<>();
		for(Integer i:al){
			if(i%2 ==0) {
				evenNo.add(i);
			}
		}
		System.out.println(evenNo);
		
		

	}
}
