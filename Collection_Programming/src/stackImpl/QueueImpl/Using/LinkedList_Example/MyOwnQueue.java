package stackImpl.QueueImpl.Using.LinkedList_Example;

import java.util.LinkedList;

public class MyOwnQueue {
	
	
private  LinkedList<PersonOnATMLine>queue;
	
	public MyOwnQueue() {   //object banaya
		this.queue=new LinkedList<>();
	}	
	
	void push(PersonOnATMLine person) {
		this.queue.addLast(person);
	}

	PersonOnATMLine pull() {
		return this.queue.removeFirst();
	}
	
}
