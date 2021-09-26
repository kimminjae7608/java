package smaple_W;

public class TV extends Product{
	private String inch, displayType;

	public TV() {
		super();
	}

	public TV(String pnum, String title, int price, int count, String inch, String displayType) {
		super(pnum, title, price, count);
		this.inch = inch;
		this.displayType = displayType;
	}

	public String getInch() {
		return inch;
	}

	public void setInch(String inch) {
		this.inch = inch;
	}

	public String getDisplayType() {
		return displayType;
	}

	public void setDisplayType(String displayType) {
		this.displayType = displayType;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(inch + "\t| ");
		builder.append(displayType);
		return builder.toString();
	}

	
}
