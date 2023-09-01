package stack.example;

import java.util.Stack;

public class StackImpl {
 
	public static void main(String[] args) {
		
		Stack<String>stack=new Stack<>();
		
		stack.push("First");
		stack.push("Second");
		stack.push("Third");
		stack.push("Four");
		stack.push("Five");
		stack.push("Six");
		
		System.out.println(stack);   //[First, Second, Third, Four, Five, Six]
		
		String obj=stack.pop();
		System.out.println(obj);        //six
		
		System.out.println(stack);     //[First, Second, Third, Four, Five]
		
		String obj1=stack.peek();
		System.out.println(obj1);    //five
		System.out.println(stack);   // [First, Second, Third, Four, Five]
		
		int i=stack.search("Second");
		System.out.println(i);       //4 INDEX
		
		System.out.println(stack.search("Two"));   //-1
		
		
		System.out.println(stack.isEmpty());    //false
		
		
		
	}
}
