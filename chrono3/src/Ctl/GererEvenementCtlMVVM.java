package Ctl;

import java.util.ArrayList;

import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.GlobalCommand;
import org.zkoss.bind.annotation.NotifyChange;

import BO.Course;
import BO.EvenementSportif;

public class GererEvenementCtlMVVM {

	public ArrayList<EvenementSportif> events = new ArrayList<EvenementSportif>();
	public EvenementSportif selectedEvent;
	
	public GererEvenementCtlMVVM(){
		EvenementSportif ev = new EvenementSportif();
		ev.setNom("fff");
		EvenementSportif ev2 = new EvenementSportif();
		ev2.setNom("aaa");
		Course course1= new Course(ev);
		course1.setNomCourse("course1");
		Course course2= new Course(ev);
		course2.setNomCourse("course2");
		ArrayList<Course> courses = new ArrayList<Course>();
		courses.add(course1);
		courses.add(course2);
		ev.setCourses(courses);
		events.add(ev);
		events.add(ev2);
	}

	public ArrayList<EvenementSportif> getEvents() {
		return events;
	}

	public void setEvents(ArrayList<EvenementSportif> events) {
		this.events = events;
	}
	
	 public void setSelectedEvent(EvenementSportif selected) {
	        this.selectedEvent = selected;
	    }
	 
	 public EvenementSportif getSelectedEvent() {
	        return selectedEvent;
	    }
	
	 @GlobalCommand
	    @NotifyChange("events")
	    public void addEvent() {
	        events.add(new EvenementSportif());
	    }
	
	 @Command
	    @NotifyChange("events")
	    public void deleteEvent(@BindingParam("event") EvenementSportif myEvent) {
	        events.remove(myEvent);
	        System.out.println("Event Delete : "+myEvent.getNom());
	    }
	
}