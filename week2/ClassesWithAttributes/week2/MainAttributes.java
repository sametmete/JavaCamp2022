package week2;

public class MainAttributes {

	public static void main(String[] args) {
		Product product = new Product(1,"Laptop","Asus laptop",21000,4);

		product.id = 1;
		product.setName("Ethernet kablo");
		product.setDescription("cat7");
		product.price = 99.90;
		product.stockAmount = 43;
		
		ProductMenager productMenager = new ProductMenager();
		
		productMenager.Add(product);
		
		System.out.println(product.getCode());

	}

}
