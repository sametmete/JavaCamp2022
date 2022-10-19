
public class PolimorphismMain {

	public static void main(String[] args) {
		/*
		BaseLogger[] loggers = new BaseLogger[] { new DatabaseLogger(), new FileLogger(), new EmailLogger() };

		for (BaseLogger logger : loggers) {
			logger.Log("Log mesaji");
		}
		*/
		
		CustomerManager customerManager = new CustomerManager(new EmailLogger());
		customerManager.add();

	}

}
