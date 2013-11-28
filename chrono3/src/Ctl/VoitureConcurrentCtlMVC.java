package Ctl;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Button;
import org.zkoss.zul.Groupbox;



public class VoitureConcurrentCtlMVC extends SelectorComposer<Component>{
	
	public final int nbConcurrentMax=4;
	public  int nbConcurrentActuel=0;
	
	
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
	
	
	public void doAfterCompose(Component comp) {
		 
		try {
		super.doAfterCompose(comp);
		} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		
  }
	
	
	@Listen("onClick = #btnConcurent")
public void ajouteConcurrent(){
//gererWindow.setVisible(true);
		System.out.println("conn");
		nbConcurrentActuel++;
		if(nbConcurrentActuel==nbConcurrentMax){
			btnConcurent.setVisible(false);
		}
		if(nbConcurrentActuel==1){
			groupVoitureC1.setVisible(true);
		}
		if(nbConcurrentActuel==2){
			groupVoitureC2.setVisible(true);
		}
		if(nbConcurrentActuel==3){
			groupVoitureC3.setVisible(true);
		}
		if(nbConcurrentActuel==4){
			groupVoitureC4.setVisible(true);
		}
		
 

 
   }
}
