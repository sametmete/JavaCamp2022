
public class CustomerManager {
	private BaseLogger logger;

	public CustomerManager(BaseLogger logger) {
		this.logger = logger;
	}
	public void add() {
		System.out.println("Musteri eklendi.");
		logger.Log("log mesaji");
	}

}
