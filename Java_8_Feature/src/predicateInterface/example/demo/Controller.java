package predicateInterface.example.demo;

import java.util.function.Predicate;

/*  No need to write this interface itis readymade inside java.util.function this is package
 * interface Predicate<Type>{
 * boolean test(Type t);
 * }
 */

public class Controller {

	public static void main(String[] args) {
		
		Predicate<Student>p=s->s.getPercentage()>=60;
		
		Student s=new Student("Rahul",65.00);
		Student s1=new Student("ganesh",37.00);
		
		System.out.println(p.test(s));
		System.out.println(p.test(s1));
		
	}
}
