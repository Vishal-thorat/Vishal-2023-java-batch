package sorting.comparable.example;

import java.util.TreeSet;

public class SortStudentObjects {
 public static void main(String[] args) {
	
	 TreeSet<Student>tree=new TreeSet<>();
	 tree.add(new Student(12,"Vishal","Thorat"));
	 tree.add(new Student(15,"Suraj","Bansal"));
	 tree.add(new Student(12,"Amit","Kumar"));
	 tree.add(new Student(12,"Anand","kumar"));
	 tree.add(new Student(127,"Vishal","Thorat"));
	 tree.add(new Student(16,"Suraj","Bansal"));
	//System.out.println(tree);
	 
	 for (Student student : tree) {
		System.out.println(student);
	} 
}
}