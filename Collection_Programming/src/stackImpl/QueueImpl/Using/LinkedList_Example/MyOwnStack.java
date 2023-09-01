package stackImpl.QueueImpl.Using.LinkedList_Example;

import java.util.LinkedList;


public class MyOwnStack {
	
	private  LinkedList<Book>list;
	
	public MyOwnStack() {   //object banaya
		this.list=new LinkedList<>();
	}	
		//add element inside list >>push opteration
		
	public	void push(Book book) {
			this.list.addLast(book);
		}
	
	public Book pull() {
		return this.list.removeLast();
		
	}

}
