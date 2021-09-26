package interface_collection_practice;

public class IProductMgrC1 implements IProductMgr{
	
	private Product[] p= new Product[50];
	private int size=0;
	public void add(Product p) {
		this.p[size++] = p;
	}

	@Override
	public Product searchNum(int pNumber) {
		for(int i=0;i<size;i++)
			if(p[i].getpNumber()==pNumber)
				return p[i];
		return null;
	}

	@Override
	public Product searchName(String pName) {
		for(int i=0;i<size;i++)
			if(p[i].getpName().equals(pName))
				return p[i];
		return null;
	}

	@Override
	public Product[] searchAll() {
		Product result[] = new Product[size];
		System.arraycopy(p, 0, result, 0, size);
		return result;
	}
	
	
	public Product[] searchTV() {
		int cnt = 0;
		for (int i = 0; i < size; i++) {
			if (p[i] instanceof TV) {
				cnt++;
			}
		}
		Product result[] = new Product[cnt];
		int a = 0;
		for (int i = 0; i < size; i++) {
			if (p[i] instanceof TV) {
				result[a++] = p[i];
			}
		}

		return result;
	}
	
	
	public Product[] searchRef() {
		int cnt = 0;
		for (int i = 0; i < size; i++) {
			if (p[i] instanceof Refrigerator) {
				cnt++;
			}
		}
		Product result[] = new Product[cnt];
		int a = 0;
		for (int i = 0; i < size; i++) {
			if (p[i] instanceof Refrigerator) {
				result[a++] = p[i];
			}
		}

		return result;
	}
	
	public void deleteNum(int pNum) {
		for (int i = 0; i < size-1; i++) {
			if (p[i].getpNumber()==(pNum)) {
				p[i] = p[i+1];
				size--;
			}
		}
	}
	
	public int priceAll() {
		int sum =0;
		for (int i = 0; i < size; i++) {
			int a = p[i].getPrice();
			int b = p[i].getpAmount();
			sum += (a * b);
		}
		return sum;
	}
	
	
}
