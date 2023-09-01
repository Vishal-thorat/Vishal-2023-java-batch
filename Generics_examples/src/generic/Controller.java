package generic;

class saving{}
class GoldLoanAcc{}
class HomeLoanAcc{};



public class Controller {
 public static void main(String[] args) {
	
	 Account<saving> acc1=new Account<>(new saving());
	 acc1.showDataType();
	 
	 Account<GoldLoanAcc> acc2=new Account<>(new GoldLoanAcc());
	 acc2.showDataType();
	 
	 Account<HomeLoanAcc> acc3=new Account<>(new HomeLoanAcc());
	 acc3.showDataType();
	 
}
}
