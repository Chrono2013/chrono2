package BO;

import java.util.ArrayList;

public class EvenementSportif {
	private String nom;
	private String nomCircuit;
	private int longueurCircuit;
	public ArrayList<Course> courses = new ArrayList<Course>();
	public ArrayList<Voiture> voitures = new ArrayList<Voiture>();
	
	public EvenementSportif(String nom, String nomCircuit, int longueurCircuit, ArrayList<Course> courses, ArrayList<Voiture> voitures){
		this.nom = nom;
		this.nomCircuit = nomCircuit;
		this.longueurCircuit = longueurCircuit;
		this.courses = courses;
		this.voitures = voitures;
	}
	
	public String getNom(){
		return nom;
	}
	
	public String getNomCircuit(){
		return nomCircuit;
	}
	
	public int getLongueurCircuit(){
		return longueurCircuit;
	}
	
	public ArrayList<Course> getCourses(){
		return courses;
	}
	
	public ArrayList<Voiture> getVoitures(){
		return voitures;
	}
}