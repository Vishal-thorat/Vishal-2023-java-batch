package array_vs_Collection_Api;

import java.util.ArrayList;

public class ArrayVsCollection {
public static void main(String[] args) {
	Student [] array=new Student[4];
	array[0]=new Student();
	array[1]=new Student();
	array[2]=new Student();
	array[3]=new Student();
	
	
	ArrayList collection =new ArrayList();
	collection.add(new Student());
	collection.add(new Student());
	collection.add(new Student());
	collection.add(new Student());
	collection.add(new Student());
	collection.add(new Student());
	collection.add(new Student());
}
}


class Student{
	
}