package Ctl;

import java.util.ArrayList;

import org.zkoss.bind.BindUtils;
import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.GlobalCommand;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zul.ListModelList;

import BO.Course;
import BO.EvenementSportif;
import BO.SessionChronometrage;
import BO.Voiture;

public class GererSessionCtlMVVM {
	private ArrayList<SessionChronometrage> sessionChronometrages = new ArrayList<SessionChronometrage>();
	
	private Course course;
	private Voiture voiturePrincipale ;// = course.getVoiturePrincipale();
	private SessionChronometrage sessionChronometragePrincipale =new SessionChronometrage(course, voiturePrincipale);
	private boolean finisOrNotCreated=true ;
	private boolean courseEnCour=false ;
	
private int pickedIndex;
	



	
	public int getPickedIndex() {
	return pickedIndex;
}

public void setPickedIndex(int pickedIndex) {
	this.pickedIndex = pickedIndex;
}

	public boolean isFinisOrNotCreated() {
		System.out.println("kljklj");
		return finisOrNotCreated;
	}

	public void setFinisOrNotCreated(boolean isFinisOrNotCreated) {
		this.finisOrNotCreated = isFinisOrNotCreated;
	}

	@GlobalCommand
	@NotifyChange("sessionChronometrages")
	public void addSession(@BindingParam("voiture") Voiture voiture){
		sessionChronometrages.add(new SessionChronometrage(course, voiture));
	}
	
	public GererSessionCtlMVVM(){
	//	sessionChronometragePrincipale =new SessionChronometrage(course, voiturePrincipale);
	//	sessionChronometrages.add(sessionChronometragePrincipale);
	}

	public ArrayList<SessionChronometrage> getSessionChronometrages() {
		return sessionChronometrages;
	}


	public void setSessionChronometrages(
			ArrayList<SessionChronometrage> sessionChronometrages) {
		this.sessionChronometrages = sessionChronometrages;
	}
	

	@GlobalCommand
	@NotifyChange({"sessionChronometragePrincipale","sessionChronometrages","finisOrNotCreated"})
	public void startSession(){
		if(!courseEnCour){
			System.out.println("ll");
			courseEnCour=true;
			sessionChronometragePrincipale=new SessionChronometrage(course, voiturePrincipale);
			sessionChronometrages.add(sessionChronometragePrincipale);
		}else{
			System.out.println("22");
			courseEnCour=false;
			finisOrNotCreated=true;
			sessionChronometragePrincipale.setFinished(true);
		}
		
		
		
	} 
	
	//@Command
	//@NotifyChange({"sessionChronometragePrincipale","voiturePrincipale"})
	@NotifyChange({"sessionChronometrages","finisOrNotCreated"})
	public void initSession(){
		//sessionChronometragePrincipale =new SessionChronometrage(course, voiture);
		//voiturePrincipale = voiture;
		if(course != null){
			if(voiturePrincipale != null){

				this.sessionChronometragePrincipale =null;
				for(SessionChronometrage sessionChrono : sessionChronometrages){
					if(sessionChrono.getCourse() == course &&  sessionChrono.getVoiture() == voiturePrincipale ){
						// une session existe afficher
						System.out.println("laaa");
						sessionChronometragePrincipale = sessionChrono;
						finisOrNotCreated = sessionChronometragePrincipale.isFinished();
						System.out.println("ici"+finisOrNotCreated);
					}
					/*
				if(sessionChronometragePrincipale == null){
					sessionChronometragePrincipale = new SessionChronometrage(course, voiturePrincipale);
				}
				*/
				}
				if(this.sessionChronometragePrincipale == null){
					finisOrNotCreated = false;
					System.out.println("ici"+finisOrNotCreated);
					
				}
				//sessionChronometrages.add(new SessionChronometrage(course, voiturePrincipale));
			}
		}
	}
	
	
	public ArrayList<SessionChronometrage> getSessionChronometrage() {
		return sessionChronometrages;
	}
	public void setSessionChronometrage(
			ArrayList<SessionChronometrage> sessionChronometrage) {
		this.sessionChronometrages = sessionChronometrage;
	}
	public SessionChronometrage getSessionChronometragePrincipale() {
		return sessionChronometragePrincipale;
	}
	public void setSessionChronometragePrincipale(
			SessionChronometrage sessionChronometragePrincipale) {
		this.sessionChronometragePrincipale = sessionChronometragePrincipale;
	}
	public Course getCourse() {
		return course;
	}
	//@NotifyChange("sessionChronometrages")
	
	@NotifyChange({"sessionChronometrages","sessionChronometragePrincipale","voiturePrincipale","finisOrNotCreated"})
	public void setCourse(Course course) {
		this.course = course;
		initSession();
	}
	public Voiture getVoiturePrincipale() {
		return voiturePrincipale;
	}
	
	@NotifyChange({"sessionChronometrages","sessionChronometragePrincipale","voiturePrincipale","finisOrNotCreated"})
	public void setVoiturePrincipale(Voiture voiturePrincipale) {
		this.voiturePrincipale = voiturePrincipale;
		initSession();

	}
	
}
