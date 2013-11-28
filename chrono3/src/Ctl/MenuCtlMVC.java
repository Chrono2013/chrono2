package Ctl;




import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;

import org.zkoss.zul.Window;

public class MenuCtlMVC extends SelectorComposer<Component>{

	
	@Wire
Window gererWindow;
	
	
	public void doAfterCompose(Component comp) {
		 
		try {
		super.doAfterCompose(comp);
		} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		gererWindow.setVisible(false);
  }
 
	@Listen("onClick = #gerer")
public void afficheGerer(){
gererWindow.setVisible(true);
 

 
   }
 
}
