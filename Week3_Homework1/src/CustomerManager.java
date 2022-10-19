
public class CustomerManager {
	private Customer _customer;
	ICreditManager _creditManager;
	public CustomerManager(Customer customer,ICreditManager creditManager) {
		_customer = customer;
		_creditManager = creditManager;
	}
	public void save() {
		System.out.println("Musteri kaydedildi."+_customer.firstName);
	}
	
	public void delete() {
		System.out.println("Musteri silindi."+_customer.firstName);
	}
	
	public void giveCredit() {
		_creditManager.calculate();
		System.out.println("Kredi Verildi.");
	}

}
