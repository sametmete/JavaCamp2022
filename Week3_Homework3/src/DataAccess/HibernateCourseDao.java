package DataAccess;

import java.util.ArrayList;
import java.util.List;

import Entities.Course;

public class HibernateCourseDao implements CourseDao {

	List<Course> courses = new ArrayList<Course>();

	@Override
	public List<Course> getAllCourses() {
		System.out.println("Hibernate ile kurslar getirildi.");
		return courses;
	}

	@Override
	public void add(Course course) {
		System.out.println("Hibernate ile kurs eklendi.");

	}

}
