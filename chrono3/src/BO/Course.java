package BO;

import java.util.Date;
import java.util.ArrayList;

public class Course {
	private String nomCourse;
	private Date hDebut;
	private Date hFin;
	private boolean departAuto;
	private int typeFin;
	private int nbTourMax;
	private Date dureeTotaleMaxPilote;
	private Date dureeConsMaxPilote;
	private String commentaire;
	public EvenementSportif evenementSportif;
	public TypeCourse typeCourse;
	public Voiture voiturePrincipale;
	public ArrayList<SessionChronometrage> sessionsChronometrages = new ArrayList<SessionChronometrage>();
}