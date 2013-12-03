package Ctl;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Button;
import org.zkoss.zul.Groupbox;
import org.zkoss.zul.Listbox;
import org.zkoss.zul.Progressmeter;



public class VoitureConcurrentCtlMVC extends GenericForwardComposer{
	

	
	@Wire
	Progressmeter pm;
	@Wire
	Listbox sessionBox;
	/*
	@Wire
	Button btnConcurent;
	@Wire
	Groupbox groupVoitureC1;
	@Wire
	Groupbox groupVoitureC2;
	@Wire
	Groupbox groupVoitureC3;
	@Wire
	Groupbox groupVoitureC4;
	*/
	
	 public void doAfterCompose(Component comp) throws Exception {
		    super.doAfterCompose(comp);
		    System.out.println("ljkljkljaaaaaaaa");
		    pm.setValue(10);
		//    sessionBox.
		  }
	/*
	 public void onTimer$timer(Event e){
		    //inboxGrid.setModel(new ListModelList(getUpdatedData()));
		 System.out.println("lkjkljklj");
		 pm.setValue(pm.getValue()+10);
	 }
	
	*/
	@Listen("onClick = #btnConcurent")
public void ajouteConcurrent(){
//gererWindow.setVisible(true);
	
 
   }
}
