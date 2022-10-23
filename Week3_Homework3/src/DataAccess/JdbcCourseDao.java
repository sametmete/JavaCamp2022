package DataAccess;

import java.util.ArrayList;
import java.util.List;

import Entities.Course;

public class JdbcCourseDao implements CourseDao {

	List<Course>courses = new ArrayList<Course>();
	@Override
	public List<Course> getAllCourses() {
		System.out.println("Jdbc ile kurslar getirildi.");
		return courses;
	}

	@Override
	public void add(Course course) {
		System.out.println("Jdbc ile kurs eklendi.");
		
	}

}
