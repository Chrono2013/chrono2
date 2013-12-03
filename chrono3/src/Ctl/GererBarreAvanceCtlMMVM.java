package Ctl;

import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.GlobalCommand;
import org.zkoss.bind.annotation.NotifyChange;

import BO.SessionChronometrage;
import BO.Voiture;

public class GererBarreAvanceCtlMMVM {
	private Voiture voit;
	private int i =0;
	
	@NotifyChange("voit")
	 @GlobalCommand
		public void setTime(@BindingParam("session") SessionChronometrage session){
			
				System.out.println("lilililililil"+session.getVoiture().getId());
				
				voit =session.getVoiture();
				if(voit.getTpsEstimeTour()<100){
					voit.setTpsEstimeTour(voit.getTpsEstimeTour()+1);;
				}
			
		}
	
	
	
		
	public Voiture getVoit() {
		return voit;
	}




	public void setVoit(Voiture voit) {
		this.voit = voit;
	}

}
