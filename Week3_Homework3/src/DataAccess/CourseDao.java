package DataAccess;

import java.util.List;

import Entities.Course;

public interface CourseDao {

	List<Course> getAllCourses();
	void add(Course course);
}
