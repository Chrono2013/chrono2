package Ctl;

import java.util.ArrayList;

import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.GlobalCommand;
import org.zkoss.bind.annotation.NotifyChange;

import BO.Course;
import BO.EvenementSportif;

public class GererCourseCtlMVVM {

	private ArrayList<Course> courses = new ArrayList<Course>();
	private EvenementSportif selectedEvenementSportif = new EvenementSportif();
	private Course selectedCourse = new Course(selectedEvenementSportif);
	
	
	public Course getSelectedCourse() {
		return selectedCourse;
	}

	public void setSelectedCourse(Course selectedCourse) {
		this.selectedCourse = selectedCourse;
	}

	public EvenementSportif getSelectedEvenementSportif() {
		return selectedEvenementSportif;
	}

	@NotifyChange({"courses", "selectedCourse"})
	public void setSelectedEvenementSportif(EvenementSportif selectedEvenementSportif) {
		//System.out.println(selectedEvenementSportif.getNom());
		this.selectedEvenementSportif = selectedEvenementSportif;
		this.courses = selectedEvenementSportif.getCourses();
		selectedCourse =null;
		//System.out.println(courses.get(0).getNomCourse());
	}

	public  GererCourseCtlMVVM(){
		System.out.println("oo");
	}

	public ArrayList<Course> getCourses() {
		return courses;
	}

	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}
	
	@GlobalCommand
    @NotifyChange("courses")
    public void addCourse() {
		//EvenementSportif event = new EvenementSportif();
        courses.add(new Course(selectedEvenementSportif));
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
	/*
	 @Command
	 public void selectionEvenementSportif(){
	       
	 }
	*/
	
	
	
}


