package stream.api.collection.example;

import java.util.function.Function;
import java.util.function.Predicate;

//class A implements Predicate<Integer >{
//	@Override
//	public boolean test(Integer t) {
//		if(t%2==0) {
//			return true;
//		}
//		return false;
//	}
//}
public class Test {
public static void main(String[] args) {
	
	// Predicate<Integer>p=new A();
//	 Predicate<Integer>p=i->i%2 ==0;
//	 System.out.println(p.test(10));
//	 
//	 
//	 Function<Integer, Integer>f=i->i*i;
//	 System.out.println(f.apply(10));
	 
	Integer d=doCalculation(i->i*i,20);
	System.out.println(d);
	
//	Function<Integer,Integer>f=i->i*i;
}
	 static Integer doCalculation(Function<Integer,Integer>f,Integer num) {
		 return f.apply(num);
	 }
			 
	 
	 
}

