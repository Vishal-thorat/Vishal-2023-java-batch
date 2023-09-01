package collection.object.processing;

import java.util.List;

public class OperationOnArrayList {

	private Boolean isValidStudentObject(Student s) {
		if(s.getRollNumber()!=null && s.getPercentage()!=null && s.getName()!=null) {
			return true;
		}
		return false;
	}
	
	private void insertObjectAL(List<Student>list,Student s) {
		if(s.getRollNumber()!=null && s.getPercentage()!=null) {   //if(isValidStudentObject(s)) {
			list.add(s);
		}
	}
	
	void init(List<Student>list) {
		insertObjectAL(list, new Student(1,"A",75.98));
		insertObjectAL(list, new Student(2,"B",56.98));
		insertObjectAL(list, new Student(3,"C",79.98));
        insertObjectAL(list, new Student(4,"D",65.98));
		insertObjectAL(list, new Student(5,"E",78.98));
	    insertObjectAL(list, new Student(6,"F",56.98));
		insertObjectAL(list, new Student(7,"G",79.98));
		insertObjectAL(list, new Student(8,"H",55.98));
		insertObjectAL(list, new Student(9,"I",45.98));
		insertObjectAL(list, new Student(10,"J",77.98));
	}
	
	void printResult(ResultSet result) {
		System.out.println("A+ student list");
		System.out.println(result.classA1);
		
		System.out.println("A student list");
		System.out.println(result.classA);
		
		System.out.println("B student list");
		System.out.println(result.classB);
		
		System.out.println("C student list");
		System.out.println(result.classC);
		
		
	}
	
}
