package custom.sorting;

import java.util.Comparator;
import java.util.TreeSet;

public class Controller {
public static void main(String[] args) {
	
	TreeSet<Student> tree=new TreeSet<>(new MyOrder());
	
	tree.add(new Student(10,"vgdfh"));
	tree.add(new Student(9,"vvgbv"));
	tree.add(new Student(12,"srsdgfh"));
	tree.add(new Student(19,"plppkfh"));
	
	for (Student student : tree) {
		System.out.println(student);
	}
}
}

class MyOrder implements Comparator<Student>{

	
	@Override
	public int compare(Student o1, Student o2) {
		
		return -o1.getRollNumber().compareTo(o2.getRollNumber());   //descending order
	}
	
}