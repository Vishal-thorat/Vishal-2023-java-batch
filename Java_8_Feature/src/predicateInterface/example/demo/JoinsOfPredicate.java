package predicateInterface.example.demo;

import java.util.function.Predicate;

/*
 * joins of predicate
 * and()
 * or()
 * negate()
 */

public class JoinsOfPredicate {

	public static void main(String[] args) {
		
//		Predicate<Integer>p1=i->i%5==0 &&i%2==0;
//		System.out.println(p1.test(10));  //true
//		System.out.println(p1.test(25)); //false
		
		
		Predicate<Integer>p1=i->i%5==0;
		Predicate<Integer> p2=i->i%2==0;
		
		Predicate<Integer>p=p1.and(p2);    ///and do -- return p1.test(10) && p2.test(10);
		
		System.out.println(p.test(10));   //true
		System.out.println(p.test(25));   //false
		
		Predicate<Integer>p5=p1.or(p2); 
		System.out.println(p5.test(10)); //using or
	}
}
