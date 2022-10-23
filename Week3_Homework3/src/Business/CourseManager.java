package Business;

import Core.logging.Logger;
import DataAccess.CourseDao;
import Entities.Course;

public class CourseManager {

	private CourseDao courseDao;
	private Logger[] loggers;
	
	
	public CourseManager(CourseDao courseDao, Logger logger) {
		super();
		this.courseDao = courseDao;
		this.loggers = loggers;
	}
	
	public void add(Course course) throws Exception {
		if(course.getCoursePrice()<0) {
			throw new Exception("Kursun fiyati sifirdan kucuk olamaz");
		}
		courseDao.add(course);
		
		for(Logger logger : loggers) {
			logger.log(course.getName());
		}
	}
	
	
}
