package BO;

import java.util.Date;
import java.util.ArrayList;

public class Course {

	private String nomCourse="";
	private Date hDebut=new Date();
	private Date hFin= new Date();
	private boolean departAuto=false;
	private int typeFin=0 ;
	private int nbTourMax=0;
	private Date dureeTotaleMaxPilote=new Date();
	private Date dureeConsMaxPilote=new Date();
	private String commentaire="";
	public EvenementSportif evenementSportif;
	public TypeCourse typeCourse =TypeCourse.normal;
	public Voiture voiturePrincipale =new Voiture();
	public ArrayList<SessionChronometrage> sessionsChronometrages = new ArrayList<SessionChronometrage>();
	
	public Course(EvenementSportif evenementSportif){
		
		
		
		this.evenementSportif = evenementSportif;
	
		
	}
	
	public String getNomCourse() {
		return nomCourse;
	}
	public void setNomCourse(String nomCourse) {
		this.nomCourse = nomCourse;
	}
	public Date gethDebut() {
		return hDebut;
	}
	public void sethDebut(Date hDebut) {
		this.hDebut = hDebut;
	}
	public Date gethFin() {
		return hFin;
	}
	public void sethFin(Date hFin) {
		this.hFin = hFin;
	}
	public boolean isDepartAuto() {
		return departAuto;
	}
	public void setDepartAuto(boolean departAuto) {
		this.departAuto = departAuto;
	}
	public int getTypeFin() {
		return typeFin;
	}
	public void setTypeFin(int typeFin) {
		this.typeFin = typeFin;
	}
	public int getNbTourMax() {
		return nbTourMax;
	}
	public void setNbTourMax(int nbTourMax) {
		this.nbTourMax = nbTourMax;
	}
	public Date getDureeTotaleMaxPilote() {
		return dureeTotaleMaxPilote;
	}
	public void setDureeTotaleMaxPilote(Date dureeTotaleMaxPilote) {
		this.dureeTotaleMaxPilote = dureeTotaleMaxPilote;
	}
	public Date getDureeConsMaxPilote() {
		return dureeConsMaxPilote;
	}
	public void setDureeConsMaxPilote(Date dureeConsMaxPilote) {
		this.dureeConsMaxPilote = dureeConsMaxPilote;
	}
	public String getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	public EvenementSportif getEvenementSportif() {
		return evenementSportif;
	}
	public void setEvenementSportif(EvenementSportif evenementSportif) {
		this.evenementSportif = evenementSportif;
	}
	public TypeCourse getTypeCourse() {
		return typeCourse;
	}
	public void setTypeCourse(TypeCourse typeCourse) {
		this.typeCourse = typeCourse;
	}
	public Voiture getVoiturePrincipale() {
		return voiturePrincipale;
	}
	public void setVoiturePrincipale(Voiture voiturePrincipale) {
		this.voiturePrincipale = voiturePrincipale;
	}
	public ArrayList<SessionChronometrage> getSessionsChronometrages() {
		return sessionsChronometrages;
	}
	public void setSessionsChronometrages(
			ArrayList<SessionChronometrage> sessionsChronometrages) {
		this.sessionsChronometrages = sessionsChronometrages;
	}
	
	
}