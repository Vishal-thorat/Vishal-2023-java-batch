package voter.card.service;

public class Controller {
	
	public static void main(String[] args) {
		
		Person p=new Person();
		p.setName("Saurabh Wagh");
		p.setAdharCardNumber(89563221458789l);
		p.setAddress("c 505,BA VERMONT ,baif road wagholi,412207");
		p.setAge(25);
		
		
		CreateVoterCard c=new CreateVoterCard();
		String status =c.CreateCard(p);
		System.out.println(status);
	}

}
