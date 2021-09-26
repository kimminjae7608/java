package interface_collection_practice;

public class TV extends Product{
	
	private String tvInfo;
	private int inch;
	
	public TV() {
		
	}
	
	public TV(int pNumber, String pName, int price, int pAmount, String tvInfo, int inch) {
		super(pNumber, pName, price, pAmount);
		this.tvInfo=tvInfo;
		this.inch =inch;
		// TODO Auto-generated constructor stub
	}
	
	public int getInch() {
		return inch;
	}
	
	public String getTvInfo(){
		return tvInfo;
	}
	
	@Override
	public String toString() {
		return "TV [pNumber=" + getpNumber() + ", pName=" + getpName() + ", price=" + getPrice() + ", pAmount=" + getpAmount()
		+", tvInfo=" + tvInfo+", inch="+ inch+ "]";
	}
}
