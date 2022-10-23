package DataAccess;

import java.util.ArrayList;
import java.util.List;

import Entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {

	List<Instructor> instructors = new ArrayList<Instructor>();

	@Override
	public List<Instructor> getAllInstructor() {
		System.out.println("Jdbc ile eğitmenler getirildi.");
		return instructors;
	}

	@Override
	public void add(Instructor instructor) {
		System.out.println("Jdbc ile eğitmen eklendi.");

	}

}
