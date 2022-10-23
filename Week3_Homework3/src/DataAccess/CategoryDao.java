package DataAccess;

import java.util.List;

import Entities.Category;

public interface CategoryDao {
	
	List<Category> getAllCategory();
	void add(Category category);
}
