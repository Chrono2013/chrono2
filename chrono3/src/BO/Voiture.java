package BO;

import java.util.Date;
import java.util.ArrayList;

public class Voiture {
	private int id;
	
	private String couleur="";
	private int nbTour=0;
	private long tpsEstimeTour=0;
	private boolean voitureActive=true;
	private double fuelUsed=0.0;
	private int nbTourFait=0;
	private int nbTourDepuisRelai=0;
	private int idRelai=0;
	private Date heureProchainPassage=new Date();
	private boolean isConcurrent=false;;
	private String ecurie="";
	private EvenementSportif evenementSportif;
	private ArrayList<Pilote> piloteDisponibles = new ArrayList<Pilote>();
	private ArrayList<SessionChronometrage> sessionChronometrages = new ArrayList<SessionChronometrage>();
	
	
	
	public Voiture(EvenementSportif evenementSportif){
		this.evenementSportif = evenementSportif;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public int getNbTour() {
		return nbTour;
	}
	public void setNbTour(int nbTour) {
		this.nbTour = nbTour;
	}
	public long getTpsEstimeTour() {
		return tpsEstimeTour;
	}
	public void setTpsEstimeTour(long tpsEstimeTour) {
		this.tpsEstimeTour = tpsEstimeTour;
	}
	public boolean isVoitureActive() {
		return voitureActive;
	}
	public void setVoitureActive(boolean voitureActive) {
		this.voitureActive = voitureActive;
	}
	public double getFuelUsed() {
		return fuelUsed;
	}
	public void setFuelUsed(double fuelUsed) {
		this.fuelUsed = fuelUsed;
	}
	public int getNbTourFait() {
		return nbTourFait;
	}
	public void setNbTourFait(int nbTourFait) {
		this.nbTourFait = nbTourFait;
	}
	public int getNbTourDepuisRelai() {
		return nbTourDepuisRelai;
	}
	public void setNbTourDepuisRelai(int nbTourDepuisRelai) {
		this.nbTourDepuisRelai = nbTourDepuisRelai;
	}
	public int getIdRelai() {
		return idRelai;
	}
	public void setIdRelai(int idRelai) {
		this.idRelai = idRelai;
	}
	public Date getHeureProchainPassage() {
		return heureProchainPassage;
	}
	public void setHeureProchainPassage(Date heureProchainPassage) {
		this.heureProchainPassage = heureProchainPassage;
	}
	public boolean isConcurrent() {
		return isConcurrent;
	}
	public void setConcurrent(boolean isConcurrent) {
		this.isConcurrent = isConcurrent;
	}
	public String getEcurie() {
		return ecurie;
	}
	public void setEcurie(String ecurie) {
		this.ecurie = ecurie;
	}
	public EvenementSportif getEvenementSportif() {
		return evenementSportif;
	}
	public void setEvenementSportif(EvenementSportif evenementSportif) {
		this.evenementSportif = evenementSportif;
	}
	public ArrayList<Pilote> getPiloteDisponibles() {
		return piloteDisponibles;
	}
	public void setPiloteDisponibles(ArrayList<Pilote> piloteDisponibles) {
		this.piloteDisponibles = piloteDisponibles;
	}
	public ArrayList<SessionChronometrage> getSessionChronometrages() {
		return sessionChronometrages;
	}
	public void setSessionChronometrages(ArrayList<SessionChronometrage> sessionChronometrages) {
		this.sessionChronometrages = sessionChronometrages;
	}
}