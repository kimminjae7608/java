package interface_collection_practice;

public class Refrigerator extends Product{

	private int refInfo;
	
	
	public Refrigerator(int pNumber, String pName, int price, int pAmount,int refInfo) {
		super(pNumber, pName, price, pAmount);
		this.refInfo=refInfo;
		// TODO Auto-generated constructor stub
	}	
	
	public int getRefInfo() {
		return refInfo;
	}
	
	@Override
	public String toString() {
		return "Refrigerator [pNumber=" + getpNumber() + ", pName=" + getpName() + ", price=" + getPrice() + ", pAmount=" + getpAmount()
		+", refInfo=" + refInfo+"]";
	}
	
}
