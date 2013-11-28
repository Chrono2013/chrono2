package Ctl;


import java.util.List;

import org.zkoss.bind.BindUtils;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.*;
import org.zkoss.zul.Combobox;
import org.zkoss.zul.Grid;
import org.zkoss.zul.Label;
import org.zkoss.zul.Timer;

import BO.EvenementSportif;

public class GererCtlMVC extends SelectorComposer<Component>{
	/**
	* 
	*/
	private static final long serialVersionUID = 1123933795452948122L;
	
	public void doAfterCompose(Component comp) {
		try {
			super.doAfterCompose(comp);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//wire variables and event listners
		      //do whatever you want (you could access wired variables here)
	 }
	
	@Wire
	Grid eventGrid;

	@Listen("onClick = #addEvent")
    public void addEvent(){
	//	eventGrid.
		// getEvents();
		BindUtils.postGlobalCommand(null, null, "addEvent", null);
    }


}