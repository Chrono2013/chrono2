package Ctl;




import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Borderlayout;
import org.zkoss.zul.Button;
import org.zkoss.zul.Combobox;
import org.zkoss.zul.East;
import org.zkoss.zul.Label;
import org.zkoss.zul.Timer;
import org.zkoss.zul.Window;

public class MenuCtlMVC  extends SelectorComposer<Component>{
/**
* 
*/
private static final long serialVersionUID = 1123933795452948122L;

@Wire
Button btnDepartCourse;



@Wire
Button topin;
@Wire
Timer timer;
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
 
 
@Listen("onClick = #btnDepartCourse")
   public void departCourse(){
btnDepartCourse.setLabel("Arreter Course");
   }
 
@Listen("onClick = #gerer")
public void afficheGerer(){
gererWindow.setVisible(!gererWindow.isVisible());
 

 
   }


}

