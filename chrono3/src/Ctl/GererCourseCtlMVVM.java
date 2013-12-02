package Ctl;

import java.util.ArrayList;

import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.GlobalCommand;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zul.ListModelList;

import BO.Course;
import BO.EvenementSportif;

public class GererCourseCtlMVVM {

	private ArrayList<Course> courses = new ArrayList<Course>();
	private EvenementSportif selectedEvenementSportif = new EvenementSportif();
	/*
	private Course selectedCourse = new Course(selectedEvenementSportif);
	
	
	public Course getSelectedCourse() {
		return selectedCourse;
	}

	public void setSelectedCourse(Course selectedCourse) {
		this.selectedCourse = selectedCourse;
	}
*/
	public EvenementSportif getSelectedEvenementSportif() {
		return selectedEvenementSportif;
	}

	@NotifyChange("courses")
	public void setSelectedEvenementSportif(EvenementSportif selectedEvenementSportif) {
		this.selectedEvenementSportif = selectedEvenementSportif;
		this.courses = selectedEvenementSportif.getCourses();
	}
	
	@GlobalCommand
	public void clearSelectionCourse(@BindingParam("listModel")ListModelList model) {
		model.clearSelection();
	}
	/*
	public  GererCourseCtlMVVM(){
		System.out.println("oo");
	}
*/
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
		if(selectedEvenementSportif.getCourses() == null){
			System.out.println("fifi");
		}
        courses.add(new Course(this.selectedEvenementSportif));
    }
	
	
	@GlobalCommand
	@NotifyChange("courses")
	public void setEvenementSessionSelectedp(@BindingParam("evenementp") EvenementSportif myEvenement, @BindingParam("listModel")ListModelList model){	
		this.selectedEvenementSportif = myEvenement;
		this.courses = myEvenement.getCourses();
		model.clearSelection();
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


