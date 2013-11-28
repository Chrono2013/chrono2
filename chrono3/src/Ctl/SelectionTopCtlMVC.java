package Ctl;

import org.zkoss.bind.BindUtils;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;

import BO.Course;
import BO.EvenementSportif;
import BO.SessionChronometrage;
import BO.Voiture;

public class SelectionTopCtlMVC extends SelectorComposer<Component>{
	
	public EvenementSportif evenementSportifSelected;
	public Course courseSelected;
	public Voiture voitureSelected;
	public SessionChronometrage sessionChronometrage;
	//public Voiture voitureSelected;
	
	
	
	public void doAfterCompose(Component comp) {
	     
		try {
		super.doAfterCompose(comp);
		} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		System.out.println("lkjklj");
		//wire variables and event listners
		      //do whatever you want (you could access wired variables here)
		  }

	
	@Listen("onSelect = #cmbEvenementSuivi")
	public void selectionSessionChronometrage(){
	//	evenementSportifSelected=  
	}
	
	@Listen("onClick = #top")
	public void top(){
		System.out.println("fsdfsd");
		 BindUtils.postGlobalCommand(null, null, "addTop", null);
   }

}
