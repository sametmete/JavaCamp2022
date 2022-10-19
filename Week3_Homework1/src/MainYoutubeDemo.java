
public class MainYoutubeDemo {

	public static void main(String[] args) {
		CreditManager creditManager = new CreditManager();
		creditManager.calculate();
		creditManager.save();

		Customer customer = new Customer();
		customer.id = 1;
		customer.firstName = "Samet";
		customer.lastName = "Mete";
		customer.city = "İStanbul";
		
		Company company = new Company();
		company.taxNumber="37348390";
		company.companyName="Arcelik";

		CustomerManager customerManager = new CustomerManager(customer, new MilitaryCreditManager());
		customerManager.giveCredit();
		customerManager.save();
		customerManager.delete();


	}

}
