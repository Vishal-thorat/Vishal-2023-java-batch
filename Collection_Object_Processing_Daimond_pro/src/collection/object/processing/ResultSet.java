package collection.object.processing;

import java.util.LinkedList;
import java.util.List;

public class ResultSet {

	public List<String>classA1;
	public List<String>classA;
	public List<String>classB;
	public List<String>classC;
	
	public ResultSet() {  //default constructor
		this.classA1=new LinkedList<>();
		this.classA=new LinkedList<>();
		this.classB=new LinkedList<>();
		this.classC=new LinkedList<>();
	}
}
