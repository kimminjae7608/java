package smaple_W;

public class Refrigerator extends Product{
	private String size;

	public Refrigerator() {
		super();
	}

	public Refrigerator(String pnum, String title, int price, int count, String size) {
		super(pnum, title, price, count);
		this.size = size;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(size);
		return builder.toString();
	}
	
	
}
