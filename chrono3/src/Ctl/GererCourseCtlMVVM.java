package Ctl;

import java.util.ArrayList;

import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.GlobalCommand;
import org.zkoss.bind.annotation.NotifyChange;

import BO.Course;
import BO.EvenementSportif;

public class GererCourseCtlMVVM {
	
	public ArrayList<Course> courses = new ArrayList<Course>();

	public ArrayList<Course> getCourses() {
		return courses;
	}

	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}
	
	@GlobalCommand
    @NotifyChange("courses")
    public void addCourse() {
        courses.add(new Course(new EvenementSportif()));
    }
	
	@Command
    @NotifyChange("courses")
    public void deleteCourse(@BindingParam("course") Course myCourse) {
        courses.remove(myCourse);
        System.out.println("Course Delete : "+myCourse.getNomCourse());
    }

}
