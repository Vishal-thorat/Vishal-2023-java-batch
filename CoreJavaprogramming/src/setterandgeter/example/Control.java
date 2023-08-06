package setterandgeter.example;

public class Control {
	
	public static void main(String[] args) {
		
	
	Student s= new Student(12,"saurabh","hsc");
	s.setName("Ganesh");
   System.out.println(s.getName());
	
  
  Student s1=new Student();
  s1.setName("mayur");
  
  System.out.println(s1.getName());
  

}
}