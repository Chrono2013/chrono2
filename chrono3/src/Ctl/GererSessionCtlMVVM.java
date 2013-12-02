package Ctl;

import java.util.ArrayList;

import org.zkoss.bind.BindUtils;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.NotifyChange;

import BO.Course;
import BO.SessionChronometrage;
import BO.Voiture;

public class GererSessionCtlMVVM {
	private ArrayList<SessionChronometrage> sessionChronometrages = new ArrayList<SessionChronometrage>();
	private Course course;
	private Voiture voiturePrincipale ;// = course.getVoiturePrincipale();
	private SessionChronometrage sessionChronometragePrincipale =new SessionChronometrage(course, voiturePrincipale);
	private Voiture voiture1;
	private Voiture voiture2;
	private Voiture voiture3;
	private Voiture voiture4;
	private boolean buttonDisabled=true;
	private String a="dddd";
	
	
	public boolean isButtonDisabled() {
		return buttonDisabled;
	}


	public void setButtonDisabled(boolean buttonDisabled) {
		this.buttonDisabled = buttonDisabled;
	}

	
	@NotifyChange("a")
	public void initSession2(){
		a="jkhjkhjkhjkh";
		System.out.println("ljl");
		 BindUtils.postNotifyChange(null,null,a,"value1");
	}
	
	
	//@Command
	@NotifyChange({"sessionChronometragePrincipale","voiturePrincipale","a"})
	public void initSession(){
		//sessionChronometragePrincipale =new SessionChronometrage(course, voiture);
		//voiturePrincipale = voiture;
		if(course != null){
			if(voiturePrincipale != null){
				buttonDisabled=false;
				setA("bbbbbbb");
				//System.out.println(buttonDisabled);
				//System.out.println("lalal");
				this.sessionChronometragePrincipale =null;
				for(SessionChronometrage sessionChrono : sessionChronometrages){
					if(sessionChrono.getCourse() == course &&  sessionChrono.getVoiture() == voiturePrincipale ){
						// une session existe afficher
						System.out.println("laaa");
						sessionChronometragePrincipale = sessionChrono;
						
					}
					/*
				if(sessionChronometragePrincipale == null){
					sessionChronometragePrincipale = new SessionChronometrage(course, voiturePrincipale);
				}
				*/
				}
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
	public void setCourse(Course course) {
		this.course = course;
	initSession();
	}
	public Voiture getVoiturePrincipale() {
		return voiturePrincipale;
	}
	public void setVoiturePrincipale(Voiture voiturePrincipale) {
		this.voiturePrincipale = voiturePrincipale;
	initSession2();
	initSession();
	}
	public Voiture getVoiture1() {
		return voiture1;
	}
	public void setVoiture1(Voiture voiture1) {
		this.voiture1 = voiture1;
	}
	public Voiture getVoiture2() {
		return voiture2;
	}
	public void setVoiture2(Voiture voiture2) {
		this.voiture2 = voiture2;
	}
	public Voiture getVoiture3() {
		return voiture3;
	}
	public void setVoiture3(Voiture voiture3) {
		this.voiture3 = voiture3;
	}
	public Voiture getVoiture4() {
		return voiture4;
	}
	public void setVoiture4(Voiture voiture4) {
		this.voiture4 = voiture4;
	}


	public String getA() {
		System.out.println("geta");
		return a;
	}


	public void setA(String a) {
		this.a = a;
	}

	
	
	
	
}
