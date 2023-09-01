package functiona_interface_example.functions;

import java.util.function.Function;

/*
 * interface Function<String,Integer>{
 * Integer apply(String s);
 * }
 */
public class FunctionalInterfaceDemo {

	
	public static void main(String[] args) {
		
		Function<String,Integer>f=s->s.length();
			System.out.println(f.apply("Vishal"));
		    System.out.println(f.apply("Thorat"));
	}
		
}
