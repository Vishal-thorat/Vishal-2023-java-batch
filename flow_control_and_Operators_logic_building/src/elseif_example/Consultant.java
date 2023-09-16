package elseif_example;

public class Consultant {

	public ClassRoom advice(int ageInMonths) {
		ClassRoom classRoom =null;
		
		if(24<=ageInMonths  && ageInMonths<36) {
			classRoom =new ClassRoom("Play Group", 24, 36, 40000.00);
		}
		else if(36<=ageInMonths  && ageInMonths<48) {
			classRoom =new ClassRoom("Nurcey Group", 36, 48, 50000.00);
		}

		else if(48<=ageInMonths  && ageInMonths<60) {
			classRoom =new ClassRoom("LKG Group", 48, 60, 50000.00);
		}

		else if(60<=ageInMonths  && ageInMonths<72) {
			classRoom =new ClassRoom("UKG Group", 60, 72, 60000.00);
		}

		
		return classRoom;
	}
}
