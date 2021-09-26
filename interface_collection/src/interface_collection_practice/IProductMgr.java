package interface_collection_practice;

public interface IProductMgr {
	
	public Product searchNum(int pNumber);
	public Product searchName(String pName);
	public Product[] searchAll();
	public void deleteNum(int pNum);
	public int priceAll();
	
	
	
	
	

}
