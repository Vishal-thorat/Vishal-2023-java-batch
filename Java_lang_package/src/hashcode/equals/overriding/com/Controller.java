package hashcode.equals.overriding.com;

public class Controller {
	
	public static void main(String[] args) {
		Student s=new Student();
		s.setRollNumber(23);
		s.setName("Mr bean");
		
		Student s1=new Student();
		s1.setRollNumber(23);s1.setName("Mr bean");
		
		System.out.println(s.equals(s1));   //parent class consist analysis  //no error   //going to hashtable
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s.hashCode() ==s1.hashCode()); //True
		
		System.out.println(s==s1);  //false
	}

}
