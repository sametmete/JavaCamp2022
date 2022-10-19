
public class MainInterfaces {

	public static void main(String[] args) {
		CustomerService customerService = new CustomerService(new SqlCustomerDal());
		customerService.add();
	}

}
