package DataAccess;

import java.util.List;

import Entities.Instructor;

public interface InstructorDao {

	List<Instructor> getAllInstructor();
	void add(Instructor instructor);
}
