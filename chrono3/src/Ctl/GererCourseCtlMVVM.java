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
<<<<<<< HEAD
        courses.add(new Course(new EvenementSportif()));
=======
		EvenementSportif event = new EvenementSportif();
        courses.add(new Course(event));
>>>>>>> branch 'master' of https://github.com/Chrono2013/chrono2.git
    }
	
	@Command
    @NotifyChange("courses")
    public void deleteCourse(@BindingParam("course") Course myCourse) {
		
		courses.remove(myCourse);
		/*	Messagebox.show("Voulez vous effacer la course ? (les temps seront effacés aussi)",
	    "Question", Messagebox.OK | Messagebox.CANCEL,
	    Messagebox.QUESTION,
	        new org.zkoss.zk.ui.event.EventListener(){
	            public void onEvent(Event e){
	                if(Messagebox.ON_OK.equals(e.getName())){
	                	courses.remove(myCourse);
	                	//
	                	System.out.println("111");
	                    //System.out.println("Course Delete : "+myCourse.getNomCourse());
	                }
	            }
	        }
	    );
}*/
	}
	
	
	
}


