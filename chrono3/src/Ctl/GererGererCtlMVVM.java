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

public class GererGererCtlMVVM {
	private ArrayList<Voiture> voitures = new ArrayList<Voiture>();
	private ArrayList<Course> courses = new ArrayList<Course>();
	private EvenementSportif selectedEvenementSportif = null;

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
	@NotifyChange({"voitures","courses","selectedEvenementSportif"})
	public void setEvenementSelectedp(@BindingParam("evenementp") EvenementSportif myEvenement ){
		this.selectedEvenementSportif = myEvenement;
		this.voitures=myEvenement.getVoitures();
		this.courses = myEvenement.getCourses();
	}
	
	
	@GlobalCommand
    @NotifyChange("voitures")
    public void addVoiture() {
		voitures.add(new Voiture(this.selectedEvenementSportif));
    }
	
	@GlobalCommand
    @NotifyChange("voitures")
    public void deleteVoiture(@BindingParam("voiture") Voiture myVoiture) {
		voitures.remove(myVoiture);
	}
			
	@GlobalCommand
    @NotifyChange("courses")
    public void addCourse() {
        courses.add(new Course(this.selectedEvenementSportif));
    }
	
	@GlobalCommand
    @NotifyChange("courses")
    public void deleteCourse(@BindingParam("course") Course myCourse) {
		courses.remove(myCourse);
	}
	
}
