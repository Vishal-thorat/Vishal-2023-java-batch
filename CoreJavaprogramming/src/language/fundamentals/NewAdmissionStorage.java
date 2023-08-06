package language.fundamentals;

public class NewAdmissionStorage {
	
	public static void main(String[] args) {
		
//		NewAdmission[] ad = new NewAdmission[4];
		
		NewAdmission a1 = new NewAdmission();
		a1.FullName="Saurabh ";
		a1.mailId="sgh@gmail.com";
		a1.CellNumber=7845212356l;
		
		

		NewAdmission a2 = new NewAdmission();
		a2.FullName="prathamesh ";
		a2.mailId="prath@gmail.com";
		a2.CellNumber=98998912356l;
		
		NewAdmission []  ad= {a1,a2};
		
		for(int i=0;i<ad.length;i++)
		{
			
		
		System.out.println(ad[i].FullName);
		System.out.println(ad[i].mailId);
		System.out.println(ad[i].CellNumber);
		
		System.out.println("-----------");
	}
}
}
