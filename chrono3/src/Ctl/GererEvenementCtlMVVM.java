package Ctl;

import java.util.ArrayList;

import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.GlobalCommand;
import org.zkoss.bind.annotation.NotifyChange;

import BO.Course;
import BO.EvenementSportif;
import BO.Voiture;

public class GererEvenementCtlMVVM {

	public ArrayList<EvenementSportif> events = new ArrayList<EvenementSportif>();
	public EvenementSportif selectedEvent;
	
	public GererEvenementCtlMVVM(){
		EvenementSportif ev = new EvenementSportif();
		ev.setNom("fff");
		EvenementSportif ev2 = new EvenementSportif();
		ev2.setNom("aaa");
		EvenementSportif ev3 = new EvenementSportif();
		ev3.setNom("aaa");
		Course course1= new Course(ev);
		course1.setNomCourse("course1");
		Course course2= new Course(ev);
		course2.setNomCourse("course2");
		Course course3= new Course(ev2);
		course3.setNomCourse("course3");
	
		Voiture voit1=new Voiture(ev);
		voit1.setId(5);
		ArrayList<Voiture> voitures = new ArrayList<Voiture>();
		voitures.add(voit1);
		
		ArrayList<Course> courses = new ArrayList<Course>();
		ArrayList<Course> courses2 = new ArrayList<Course>();
		courses.add(course1);
		courses.add(course2);
		courses2.add(course3);
		ev.setCourses(courses);
		ev.setVoituress(voitures);
		ev2.setCourses(courses2);
		events.add(ev);
		events.add(ev2);
		events.add(ev3);
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
	
	 @GlobalCommand
	    @NotifyChange("events")
	    public void deleteEvent(@BindingParam("event") EvenementSportif myEvent) {
	        events.remove(myEvent);
	        System.out.println("Event Delete : "+myEvent.getNom());
	    }
	
}