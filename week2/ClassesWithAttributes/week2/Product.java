package week2;

public class Product {

	public Product(int id, String name, String description, double price, int stockAmount) {
		System.out.println("Yapici blok calisti.");
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.stockAmount = stockAmount;
	}
	public Product() {
		
	}

	int id;
	private String name;
	private String description;
	int stockAmount;
	double price;
	String code;

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	String getDescription() {
		return description;
	}

	void setDescription(String description) {
		this.description = description;
	}

	String getCode() {
		return this.name.substring(0, 1) + id;
	}

}
