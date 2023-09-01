package stackImpl.QueueImpl.Using.LinkedList_Example;

public class ControllerQueue {
	
	public static void main(String[] args) {
		
		MyOwnQueue queue =new MyOwnQueue();
		
	    queue.push(new PersonOnATMLine("A",2000.00,"Hdfc"));
	    queue.push(new PersonOnATMLine("B",4000.00,"SBI"));
	    queue.push(new PersonOnATMLine("C",6000.00,"ICICI"));
	    queue.push(new PersonOnATMLine("D",8000.00,"YES BANK"));
	    queue.push(new PersonOnATMLine("E",10000.00,"CITI BANK"));
	    
	    System.out.println(queue.pull());
	    System.out.println(queue.pull());
	    System.out.println(queue.pull());
	    System.out.println(queue.pull());
	}

}
