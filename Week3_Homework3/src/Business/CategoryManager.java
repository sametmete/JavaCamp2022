package Business;

import java.util.ArrayList;
import java.util.List;

import Core.logging.Logger;
import DataAccess.CategoryDao;
import Entities.Category;

public class CategoryManager {

	private List<Category> categories;
	private CategoryDao categoryDao;
	private List<Logger> loggers;

	public CategoryManager(CategoryDao categoryDao, List<Logger> loggers, List<Category> categories) {
		super();
		this.categoryDao = categoryDao;
		this.loggers = loggers;
		this.categories = categories;
	}

	public void add(Category category) throws Exception {
		for (Category c : categories) {
			if (category.getName().equals(category.getName())) {
				throw new Exception("Kategori ismi ayni olamaz.");
			}
		}

		categoryDao.add(category);
		categories.add(category);

		for (Logger logger : loggers) {
			logger.log(category.getName());
		}
	}

}
