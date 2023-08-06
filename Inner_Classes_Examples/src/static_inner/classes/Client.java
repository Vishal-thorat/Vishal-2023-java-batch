package static_inner.classes;

public class Client {
	public static void main(String[] args) {
		
		YesBank.Account acc=new YesBank.Account();
		Double bal=acc.getMyBalance();
		System.out.println(bal);
	}

}
