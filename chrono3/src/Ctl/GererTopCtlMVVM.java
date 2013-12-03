package Ctl;

import java.awt.Component;
import java.util.ArrayList;
import java.util.Arrays;

import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.GlobalCommand;
import org.zkoss.bind.annotation.NotifyChange;

import BO.Course;
import BO.EtatTop;
import BO.EvenementSportif;
import BO.SessionChronometrage;
/*
import org.zkoss.bind.annotation.GlobalCommand;
import org.zkoss.bind.annotation.NotifyChange;
*/
import BO.Top;
import BO.Voiture;



public class GererTopCtlMVVM {
	public ArrayList<Top> tops = new ArrayList<Top>();
	public ArrayList<EtatTop> etatTops =new ArrayList<EtatTop>(Arrays.asList(EtatTop.values()));
	public SessionChronometrage session=new SessionChronometrage(new Course(new EvenementSportif()), new Voiture(new EvenementSportif()));

	public Voiture voit;
	
	
	@NotifyChange("voit")
	 @GlobalCommand
		public void setTime(){
			
			//if(session= 1){
				System.out.println("lilililililil");
				
				voit =session.getVoiture();
			voit.setTpsEstimeTour(voit.getTpsEstimeTour()+10);;
			// BindUtils.postNotifyChange(null,null,sessionChronometrages.get(0).getVoiture().getTpsEstimeTour(),"value1");
			//}
		//	long tp = sessionChronometrages.get(1).getVoiture().getTpsEstimeTour();
			//tp
		}
	
	
	
		
	public Voiture getVoit() {
		return voit;
	}




	public void setVoit(Voiture voit) {
		this.voit = voit;
	}




	public ArrayList<Top> getTops() {
		return tops;
	}

	public void setTops(ArrayList<Top> tops) {
		this.tops = tops;
	}
	
	public ArrayList<EtatTop> getEtatTops() {
		return etatTops;
	}
	
	
	
	 @GlobalCommand
	    @NotifyChange("tops")
	    public void setTop(@BindingParam("session2") SessionChronometrage session2, @BindingParam("comp") Component compo) {
		 System.out.println(compo);
		 session2.getTops().add(new Top(session2));
	    }
	 
	 @GlobalCommand
	    @NotifyChange("tops")
	    public void deleteTop(@BindingParam("top") Top myTop) {
		 System.out.println("deleteTop");
			tops.remove(myTop);
		}
	   
	 @GlobalCommand
	    @NotifyChange({"session","tops"})
	    public void setSessionSelected(@BindingParam("session") SessionChronometrage session) {
		 this.session=session;
		 tops =session.getTops();
	}
	
}
