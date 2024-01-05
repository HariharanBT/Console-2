package demo;

public class Medicine {
	private String name;
	private int quantity;

	public Medicine(String name, int quantity) {
		this.name = name;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void addQuantity(int quantity) {
		this.quantity += quantity;
	}
}