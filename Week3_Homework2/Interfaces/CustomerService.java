
public class CustomerService {
	private ICustomerDal customerDal;
	
	public CustomerService(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}
	
	public void add() {
		customerDal.add();
	}
}
