package package1;

public class Student {

	public String name;  //if removed public then error get in package 2
	//protected ,private
	public Student() {
		this.name="Ganesh";
	}
	void m1() {
		System.out.println(this.name);
	}
}
