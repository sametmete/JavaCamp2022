
public class SqlCustomerDal implements ICustomerDal {

	@Override
	public void add() {
		System.out.println("SQL Server eklendi.");
		
	}

	@Override
	public void update() {
		System.out.println("SQL Guncellendi.");
		
	}

}
