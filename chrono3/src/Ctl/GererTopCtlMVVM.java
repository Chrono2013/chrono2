package Ctl;

import java.util.ArrayList;

import org.zkoss.bind.annotation.GlobalCommand;
import org.zkoss.bind.annotation.NotifyChange;

import BO.Course;
import BO.EvenementSportif;
import BO.SessionChronometrage;
/*
import org.zkoss.bind.annotation.GlobalCommand;
import org.zkoss.bind.annotation.NotifyChange;
*/
import BO.Top;
import BO.Voiture;



public class GererTopCtlMVVM {
	public ArrayList<Top> tops = new ArrayList<Top>();

	public  GererTopCtlMVVM(){
		this.tops.add(new Top(new SessionChronometrage(new Course(new EvenementSportif()), new Voiture(new EvenementSportif()))));
	}
	
	public ArrayList<Top> getTops() {
		return tops;
	}

	public void setTops(ArrayList<Top> tops) {
		this.tops = tops;
	}
	//addTop
	
	 @GlobalCommand
	    @NotifyChange("tops")
	    public void addTop() {
		 System.out.println("sdffsd");
	        tops.add(new Top(new SessionChronometrage(new Course(new EvenementSportif()), new Voiture(new EvenementSportif()))));
	    }
	
	/*
	 @GlobalCommand
	    @NotifyChange("events")
	    public void addEvent() {
	        events.add(new EvenementSportif());
	    }
	    */
}