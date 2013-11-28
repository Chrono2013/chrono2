package Ctl;

import org.zkoss.bind.BindUtils;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;

public class GererCtlMVC extends SelectorComposer<Component>{
	
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;

	@Listen("onClick = #addEvent")
    public void addEvent() {
 
        BindUtils.postGlobalCommand(null, null, "addEvent", null);
    }
	
	@Listen("onClick = #addCourse")
    public void addCourse() {
 
        BindUtils.postGlobalCommand(null, null, "addCourse", null);
    }
	
 
}
