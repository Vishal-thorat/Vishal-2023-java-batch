package method.inner.classses;

import java.util.HashMap;
import java.util.Map;

public class MathsOperation {
	
	static int k=10;
	int j=20;
 
	Map<Integer, Integer>getSquareList(Integer from,Integer to){
		
		System.out.println(k);
		System.out.println(j);
		
	class Logic{
		Integer getSquare(Integer num) {
			return num*num;
		}
	}
	
	Map<Integer, Integer>map=new HashMap<>();
	
	Logic logic =new Logic();
	for(Integer i=from;i<=to;i++){
		map.put(i, logic.getSquare(i));
//		Integer key =i;
//		Integer value=i*i;
//      map.put(key,value);
	}
	
	return map;
	}	
}
