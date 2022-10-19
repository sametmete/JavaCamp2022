
public class MainAbstract {

	public static void main(String[] args) {
		ClientManager clientManager = new ClientManager();
		clientManager.databaseManager = new MySqlDatabaseManager();
		clientManager.getClients();

	}

}
