package smaple_W;

public class Product {
	private String pnum, title;
	private int price, count;

	public Product() {
		super();
	}

	public Product(String pnum, String title, int price, int count) {
		super();
		this.pnum = pnum;
		this.title = title;
		this.price = price;
		this.count = count;
	}

	public String getPnum() {
		return pnum;
	}

	public void setPnum(String pnum) {
		this.pnum = pnum;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(pnum);
		builder.append("\t|");
		builder.append(title);
		builder.append("\t|");
		builder.append(price);
		builder.append("\t|");
		builder.append(count);
		builder.append("\t|");
		return builder.toString();
	}

}
