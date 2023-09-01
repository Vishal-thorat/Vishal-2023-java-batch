package stackImpl.QueueImpl.Using.LinkedList_Example;

public class Controller {
	public static void main(String[] args) {
		
		MyOwnStack stack=new MyOwnStack();
		stack.push(new Book("Core Java" , " oracle corp",5500));
		stack.push(new Book("JEE" , " oracle corp",7500));
		stack.push(new Book("hibernate" , " web logic",7000));
		stack.push(new Book("spring boot" , " web logic",7000));
		
		Book b=stack.pull();;
		System.out.println(b);
		
		stack.pull();
		
		Book b1=stack.pull();;
		System.out.println(b1);
		stack.pull();
		
	}

}
