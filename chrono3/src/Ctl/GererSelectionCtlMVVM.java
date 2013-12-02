package Ctl;

import java.util.ArrayList;

import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.GlobalCommand;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zul.ListModelList;

import BO.Course;
import BO.EvenementSportif;
import BO.Voiture;

public class GererSelectionCtlMVVM {
	private ArrayList<Voiture> voitures = new ArrayList<Voiture>();
	private ArrayList<Course> courses = new ArrayList<Course>();
	private EvenementSportif selectedEvenementSportif = new EvenementSportif();

	public EvenementSportif getSelectedEvenementSportif() {
		return selectedEvenementSportif;
	}

	@NotifyChange("voitures")
	public void setSelectedEvenementSportif(EvenementSportif selectedEvenementSportif) {
		this.selectedEvenementSportif = selectedEvenementSportif;
		this.voitures = selectedEvenementSportif.getVoitures();
		this.courses = selectedEvenementSportif.getCourses();
	}

	public ArrayList<Voiture> getVoitures() {
		return voitures;
	}

	public void setVoiture(ArrayList<Voiture> voitures) {
		this.voitures = voitures;
	}
	
	public ArrayList<Course> getCourses() {
		return courses;
	}

	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}
	
	@Command
	@NotifyChange({"voitures","courses", "selectedEvenementSportif"})
	public void setEvenementSessionSelectedp(@BindingParam("evenementp") EvenementSportif myEvenement,@BindingParam("listModel2")ListModelList model2,@BindingParam("listModel")ListModelList model ){
		this.selectedEvenementSportif = myEvenement;
		this.voitures=myEvenement.getVoitures();
		this.courses = myEvenement.getCourses();
		model.clearSelection();
		model2.clearSelection();
	}
	

	@GlobalCommand
    @NotifyChange("voitures")
    public void addVoiture() {
    }
	
	@GlobalCommand
    @NotifyChange("voitures")
    public void deleteVoiture(@BindingParam("course") Voiture myVoiture) {
	}
	
	
	@GlobalCommand
    @NotifyChange("courses")
    public void addCourse() {
    }
	
	@GlobalCommand
    @NotifyChange("courses")
    public void deleteCourse(@BindingParam("course") Course myCourse) {
	}
	
}
