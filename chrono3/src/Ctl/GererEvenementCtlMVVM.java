package Ctl;

import java.util.ArrayList;
import java.util.List;

import org.zkoss.bind.annotation.GlobalCommand;
import org.zkoss.bind.annotation.NotifyChange;

import BO.EvenementSportif;

public class GererEvenementCtlMVVM {

	private List<EvenementSportif> events = new ArrayList<EvenementSportif>();

	public List<EvenementSportif> getEvents() {
		return events;
	}

	public void setEvents(List<EvenementSportif> events) {
		this.events = events;
	}
	
	@GlobalCommand
    @NotifyChange("events")
    public void addEvent() {
		EvenementSportif newEvent = new EvenementSportif();
		events.add(newEvent);
    }
	
}