package BO;

import java.util.Date;

public class Top {
//	private int numeroVoiture;
	private int nbCourseConsPilote=0;
	private int nbTourTotalEffect=0;
	private String tempsCourant;
	private String heurePassage;
	private Date heureMs;
	private String commentaire;
	private SessionChronometrage sessionChronometrage;
	private Pilote piloteActuel;
	private EtatTop etatTop;
	
	public Top(SessionChronometrage sessionChronometrage){
		this.sessionChronometrage=sessionChronometrage;
	}
	/*
	public int getNumeroVoiture() {
		return numeroVoiture;
		 
	}
	public void setNumeroVoiture(int numeroVoiture) {
		this.numeroVoiture = numeroVoiture;
	}
	*/
	public int getNbCourseConsPilote() {
		return nbCourseConsPilote;
	}
	public void setNbCourseConsPilote(int nbCourseConsPilote) {
		this.nbCourseConsPilote = nbCourseConsPilote;
	}
	public int getNbTourTotalEffect() {
		return nbTourTotalEffect;
	}
	public void setNbTourTotalEffect(int nbTourTotalEffect) {
		this.nbTourTotalEffect = nbTourTotalEffect;
	}
	public String getTempsCourant() {
		return tempsCourant;
	}
	public void setTempsCourant(String tempsCourant) {
		this.tempsCourant = tempsCourant;
	}
	public String getHeurePassage() {
		return heurePassage;
	}
	public void setHeurePassage(String heurePassage) {
		this.heurePassage = heurePassage;
	}
	public Date getHeureMs() {
		return heureMs;
	}
	public void setHeureMs(Date heureMs) {
		this.heureMs = heureMs;
	}
	public String getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	public SessionChronometrage getSessionChronometrage() {
		return sessionChronometrage;
	}
	public void setSessionChronometrage(SessionChronometrage sessionChronometrage) {
		this.sessionChronometrage = sessionChronometrage;
	}
	public Pilote getPiloteActuel() {
		return piloteActuel;
	}
	public void setPiloteActuel(Pilote piloteActuel) {
		this.piloteActuel = piloteActuel;
	}
	
	
	public EtatTop getEtatTop() {
		return etatTop;
	}
	public void setEtatTop(EtatTop etatTop) {
		this.etatTop = etatTop;
	}
	
}