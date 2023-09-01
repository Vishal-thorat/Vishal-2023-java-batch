package set_impl_classes;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetImplClasses {
	
	public static void main(String[] args) {
		
		//HashSet<Integer> hashset=new HashSet<>();
		
		LinkedHashSet<Integer> hashset=new LinkedHashSet<>();
		
		hashset.add(10);  //true
		hashset.add(10);   //false
		
		hashset.add(null);  //true
		hashset.add(null);   //false
		
		hashset.add(90);
		hashset.add(91);
		hashset.add(92);
		
		System.out.println(hashset);
		
	}

}
