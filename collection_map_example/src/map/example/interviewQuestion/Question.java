package map.example.interviewQuestion;

import java.util.HashMap;

public class Question {

	public static void main(String[] args) {
		HashMap<Employee,Double>map=new HashMap<>();
		map.put(new Employee(1,"A"), 23158.56);
		map.put(new Employee(2,"B"), 52336.56);
		map.put(new Employee(1,"A"), 10000.56);
		
		System.out.println(map.size());  //3
		System.out.println(map.get(new Employee(1,"A")));  //null  //after overide equ and hashcode out wil get 2, 10000.56
	}
}
 
//Assignment    CRUD Operatiion
/*
 * HashMap<Integer,student>
 * add
 * update
 * get
 * delete 
 * printAll
 */

