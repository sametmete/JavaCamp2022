package DataAccess;

import java.util.ArrayList;
import java.util.List;

import Entities.Category;

public class JdbcCategoryDao implements CategoryDao {

	List<Category>categories= new ArrayList<Category>();
	@Override
	public List<Category> getAllCategory() {
		System.out.println("Jdbc ile kategoriler getirildi.");
		return categories;
	}

	@Override
	public void add(Category category) {
		System.out.println("Jdbc ile kategori eklendi.");
		
	}

}
