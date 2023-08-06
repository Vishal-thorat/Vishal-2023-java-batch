package constructor.examples;

public class Entrypoint {

	public static void main(String[] args) {
		Student s = new Student(11,"vishal","DY");
		System.out.println(s.collegeName);
		Student s1 = new Student();
		System.out.println(s1.name);
	}
}
