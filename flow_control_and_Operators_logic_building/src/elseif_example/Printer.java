package elseif_example;

public class Printer {

	public static  void print(ClassRoom cr) {
		System.out.println("<<<<<<<<<<<<<<<<");
		if(cr!=null) {
		System.out.println("recommended class =" +cr.getClassRoomm());
		System.out.println("age group ="+ cr.getLowerAge() +"<-your kid age>"+cr.getUpperAge());
		System.out.println("Annual fees="+cr.getFees());
		System.out.println("<<<<<<<<<<<<<<<<");
		}else {
			System.out.println("sorry boss your kid  age is not matched  ");
		}
	}
}
