package BO;

import java.util.Date;
import java.util.ArrayList;

public class Voiture {
	private int id;
	private String couleur;
	private int nbTour;
	private long tpsEstimeTour;
	private boolean voitureActive;
	private double fuelUsed;
	private int nbTourFait;
	private int nbTourDepuisRelai;
	private int idRelai;
	private Date heureProchainPassage;
	private boolean isConcurrent;
	private String ecurie;
	public EvenementSportif evenementSportif;
	public ArrayList<Pilote> piloteDisponibles = new ArrayList<Pilote>();
	public ArrayList<SessionChronometrage> sessionChronometrages = new ArrayList<SessionChronometrage>();
}