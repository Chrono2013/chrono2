package Ctl;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Combobox;
import org.zkoss.zul.Label;
import org.zkoss.zul.Timer;
import org.zkoss.zul.Window;

public class MainCtlMVC extends SelectorComposer<Component>{
/**
* 
*/
private static final long serialVersionUID = 1123933795452948122L;
@Wire
Combobox  cmbEvenementSuivi;
@Wire
Combobox  cmbVoiture;
@Wire
Combobox  cmbCourseSuivie;
@Wire
Label lblTemps;
@Wire
Timer timer;
@Wire
Window win ;

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





}
