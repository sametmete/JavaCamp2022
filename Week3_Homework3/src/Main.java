import java.util.ArrayList;
import java.util.List;

import Business.CategoryManager;
import Core.logging.DatabaseLogger;
import Core.logging.FileLogger;
import Core.logging.Logger;
import DataAccess.CategoryDao;
import DataAccess.HibernateCategoryDao;
import Entities.Category;

public class Main {

	public static void main(String[] args) throws Exception {
		
		List<Logger> loggers = new ArrayList<Logger>();
        loggers.add(new DatabaseLogger());
        loggers.add(new FileLogger());

        
		Category category2 = new Category(2, "Backend");
		Category category = new Category(1, "test");

		
		List<Category> categories = new ArrayList<>();
		
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(),loggers,categories);

		categoryManager.add(category2);
		categoryManager.add(category);
		

	}

}
