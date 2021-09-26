package day11c;

public abstract class CreditCard {
	
	
	
	protected String owner;	
	protected int limit;	
	protected int payTotal;	
	
	public CreditCard(String owner) {
		this.owner=owner;
	}
	
	public abstract int upLimit(int plus);
	public abstract int pay(int money);
	
	public int getLimit() {
		return limit;
	}

	public String getOwner() {
		return owner;
	}
	
	public int getPayTotal() {
		return payTotal;
	}
	
	

	
}
