package Ctl;

import java.util.ArrayList;
/*
import org.zkoss.bind.annotation.GlobalCommand;
import org.zkoss.bind.annotation.NotifyChange;
*/
import BO.Top;



public class GererTopCtlMVVM {
	public ArrayList<Top> tops = new ArrayList<Top>();

	public ArrayList<Top> getTops() {
		return tops;
	}

	public void setTops(ArrayList<Top> tops) {
		this.tops = tops;
	}
	/*
	 @GlobalCommand
	    @NotifyChange("events")
	    public void addEvent() {
	        events.add(new EvenementSportif());
	    }
	    */
}
