package treeset.example;

import java.util.TreeSet;

public class EmpController {
public static void main(String[] args) {
	
	TreeSet<Employee>t=new TreeSet<>();
	t.add(new Employee(10,"A"));
	t.add(new Employee(9,"C"));
	t.add(new Employee(3,"l"));
	t.add(new Employee(90,"m"));
	t.add(new Employee(12,"A"));
	t.add(new Employee(90,"c"));
	//System.out.println(t);
	
	for (Employee e : t) {
		System.out.println(e);
	}
}
}
