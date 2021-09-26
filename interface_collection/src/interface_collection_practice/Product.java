package interface_collection_practice;

public class Product{
	private int pNumber;
	private String pName;
	private int price;
	private int pAmount;
	
	public Product() {

	}
	
	
	
	public Product(int pNumber, String pName, int price, int pAmount) {
		this.pNumber = pNumber;
		this.pName = pName;
		this.price = price;
		this.pAmount = pAmount;
	}

	public int getpNumber() {
		return pNumber;
	}
	public String getpName() {
		return pName;
	}
	public int getPrice() {
		return price;
	}
	public int getpAmount() {
		return pAmount;
	}

	@Override
	public String toString() {
		return "Product [pNumber=" + pNumber + ", pName=" + pName + ", priceInfo=" + price + ", pAmount=" + pAmount
				+ "]";
	}

	

}
