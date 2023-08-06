package throw_keywords;

public class VotingProcess {
	
	void doVote(int age) {
		if(age<18) {
			try {
			NumberFormatException e=new NumberFormatException("age is less than 18");
			
			throw e;
			}       //unchecked exception  using throw keyword Manually throw exception object
			catch(Exception e) {
				System.out.println(e);
			}
		}else {
			System.out.println("you can vote");
		}
	}

	public static void main(String[] args) {
		VotingProcess v=new VotingProcess();
		v.doVote(19);
		v.doVote(12);
	}

}
