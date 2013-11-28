package Ctl;

import java.util.ArrayList;

import BO.Course;

public class GererCourseCtlMVVM {
	
	public ArrayList<Course> courses = new ArrayList<Course>();

	public ArrayList<Course> getCourses() {
		return courses;
	}

	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}

}
