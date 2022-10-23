package DataAccess;

import java.util.ArrayList;
import java.util.List;

import Entities.Category;

public class HibernateCategoryDao implements CategoryDao {
	
	List<Category>categories = new ArrayList<Category>();

	@Override
	public List<Category> getAllCategory() {
		System.out.println("Hibernate ile kategoriler getirildi.");
		return categories;
	}

	@Override
	public void add(Category category) {
		System.out.println("Hibernate ile kategori eklendi.");
		
	}

}
