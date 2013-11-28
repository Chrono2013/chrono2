package Ctl;

import java.util.*;

import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.GlobalCommand;
import org.zkoss.bind.annotation.NotifyChange;

import BO.EvenementSportif;

public class GererEvenementCtlMVVM {

	public ArrayList<EvenementSportif> events = new ArrayList<EvenementSportif>();
	public EvenementSportif selectedEvent;

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