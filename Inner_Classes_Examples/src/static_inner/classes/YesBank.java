package static_inner.classes;

public class YesBank {
	
	static class Account{
		private Double balance;
		
		
		public Double getMyBalance() {
			this.balance=23456.89;
			return this.balance;
		}
	}

}
