package BO;

import java.util.ArrayList;

public class EvenementSportif {
	private String nom;
	private String nomCircuit;
	private int longueurCircuit;
	public ArrayList<Course> courses = new ArrayList<Course>();
	public ArrayList<Voiture> voitures = new ArrayList<Voiture>();
	
	public EvenementSportif(){
		setNom("");
		setNomCircuit("");
		setLongueurCircuit(0);
		courses = null;
		voitures = null;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getNomCircuit() {
		return nomCircuit;
	}

	public void setNomCircuit(String nomCircuit) {
		this.nomCircuit = nomCircuit;
	}

	public int getLongueurCircuit() {
		return longueurCircuit;
	}

	public void setLongueurCircuit(int longueurCircuit) {
		this.longueurCircuit = longueurCircuit;
	}
	
	public ArrayList<Course> getCourses(){
		return courses;
	}
	
	public void setCourses(ArrayList<Course> courses){
		this.courses = courses;
	}
	
	public ArrayList<Voiture> getVoitures(){
		return voitures;
	}
	
	public void setVoituress(ArrayList<Voiture> voitures){
		this.voitures = voitures;
	}

}