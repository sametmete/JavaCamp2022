package Entities;

public class Course {
	
	private int id;
	private String name;
	private double coursePrice;
	private int lessonTime;
	
	
	public Course(int id, String name, double coursePrice, int lessonTime) {
		super();
		this.id = id;
		this.name = name;
		this.coursePrice = coursePrice;
		this.lessonTime = lessonTime;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getCoursePrice() {
		return coursePrice;
	}


	public void setCoursePrice(double coursePrice) {
		this.coursePrice = coursePrice;
	}


	public int getLessonTime() {
		return lessonTime;
	}


	public void setLessonTime(int lessonTime) {
		this.lessonTime = lessonTime;
	}
	
	

}
