package voter.card.service;
import my.custom.exception.InvalidAgeException;
public class CreateVoterCard {
	
	String CreateCard(Person person){
		String status="";
		if(person.getAge()<18) {
			
			throw new InvalidAgeException (person.getName()+"his age is "+person.getAge()+"which is less than 18");
			
		}else {
			status="Succesffully Registration Done";
		}
		return status;
	}
}
