package BO;

import java.util.ArrayList;

public class EvenementSportif {
	private String nom = "";
	private String nomCircuit = "";
	private int longueurCircuit = 0;
	public ArrayList<Course> courses = new ArrayList<Course>();
	public ArrayList<Voiture> voitures = new ArrayList<Voiture>();
	
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