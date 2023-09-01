package lambda.expression.with.function_interface;

public class ThreadCreationWithTheHeplOfLambdaExp {
public static void main(String[] args) {
	
//	Runnable r =()->{System.out.println(Thread.currentThread().getName());};
//	Thread t=new Thread(r);
	

//	Thread t=new Thread(()->System.out.println(Thread.currentThread().getName()));
//	t.start();
	
	//one time used dont create ref variable
	new Thread(()->System.out.println(Thread.currentThread().getName())).start();
}
}
