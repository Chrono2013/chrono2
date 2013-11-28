package Ctl;

import java.util.*;

import org.zkoss.bind.annotation.GlobalCommand;
import org.zkoss.bind.annotation.NotifyChange;

import BO.EvenementSportif;

public class GererEvenementCtlMVVM {

	public ArrayList<EvenementSportif> events = new ArrayList<EvenementSportif>();

	public ArrayList<EvenementSportif> getEvents() {
		return events;
	}

	public void setEvents(ArrayList<EvenementSportif> events) {
		this.events = events;
	}
	
	 @GlobalCommand
	    @NotifyChange("events")
	    public void addEvent() {
	        events.add(new EvenementSportif());
	    }
	
	
	
}