package array.program;

public class Controller {
	
	public static void main(String[] args) {
		
		Student s = new Student();
		s.name="Sky";
		s.rollnumber=21;
		
		
		                 Marks[] sub=new Marks[3];
		                 Marks m1 = new Marks();
		                 m1.subject ="maths";
		                 m1.score =90;
		                 
		            sub[0]=m1;
		                 
		                
		                 Marks m2 = new Marks();
		                 m2.subject ="physics";
		                 m2.score =35;
		                 
		            sub[1]=m2;
		                 
		            Marks m3 = new Marks();
	                 m3.subject ="chemistry";
	                 m3.score =45;
	                 
	            sub[2]=m3;
	     
	            s.mks = sub;
		//print data
	            
	            System.out.println(s.name);
	            System.out.println(s.rollnumber);
	            System.out.println("-----------------");
	            for (int i=0;i<s.mks.length;i++) {
	             System.out.println(s.mks[i].subject);
	             System.out.println(s.mks[i].score);
	             System.out.println("-----------------");
	            
	             
	            }
	            
//	            class ShowUp{
//	            	void printdata(student s)
//	            }
//	            
//	            //print data work
//	            ShowUp show =new ShowUp();
//	            show.printdata(s);
//	            
	}

}
