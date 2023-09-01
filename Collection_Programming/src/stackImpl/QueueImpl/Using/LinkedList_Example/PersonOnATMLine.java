package stackImpl.QueueImpl.Using.LinkedList_Example;

public class PersonOnATMLine {
	private String name;
	private Double withDrawAmt;
	private String cardType;
	
	PersonOnATMLine(){}  //default constructor

	public PersonOnATMLine(String name, Double withDrawAmt, String cardType) {
		super();
		this.name = name;
		this.withDrawAmt = withDrawAmt;
		this.cardType = cardType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getWithDrawAmt() {
		return withDrawAmt;
	}

	public void setWithDrawAmt(Double withDrawAmt) {
		this.withDrawAmt = withDrawAmt;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	@Override
	public String toString() {
		return "PersonOnATMLine [name=" + name + ", withDrawAmt=" + withDrawAmt + ", cardType=" + cardType + "]";
	}
	
	

}
