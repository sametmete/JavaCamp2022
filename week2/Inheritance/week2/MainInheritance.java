package week2;

public class MainInheritance {

	public static void main(String[] args) {
		Customer customer = new Customer();
		Employee employee = new Employee();
		
		CustomerMenager customerMenager = new CustomerMenager();
		EmployeeMenager employeeMenager = new EmployeeMenager();
		
		employeeMenager.List();
	}

}
