
public class ProduceManager {
	ProductValidator productValidator = new ProductValidator();
	public void add(Produce produce) {
		if(productValidator.isValid(produce)) {
			System.out.println("Urun eklendi.");
		}else {
			System.out.println("Urun bilgileri gecersiz.");
		}
	}
}
