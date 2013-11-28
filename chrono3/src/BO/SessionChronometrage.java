package BO;

import java.util.ArrayList;

public class SessionChronometrage {
	private boolean isFinished;
	private Course course;
	private Voiture voiture;
	private ArrayList<Top> tops = new ArrayList<Top>();
	
	public SessionChronometrage(Course course, Voiture voiture){
		this.voiture =voiture;
		this.course=course;
	}
	
	private boolean isFinished() {
		return isFinished;
	}
	public void setFinished(boolean isFinished) {
		this.isFinished = isFinished;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public Voiture getVoiture() {
		return voiture;
	}
	public void setVoiture(Voiture voiture) {
		this.voiture = voiture;
	}
	public ArrayList<Top> getTops() {
		return tops;
	}
	public void setTops(ArrayList<Top> tops) {
		this.tops = tops;
	}

}