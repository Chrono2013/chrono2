package Ctl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

import org.zkoss.bind.BindUtils;
import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.GlobalCommand;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zul.ListModelList;

import BO.Course;
import BO.EtatTop;
import BO.EvenementSportif;
import BO.Pilote;
import BO.TypeCourse;
import BO.Voiture;

public class GererGererCtlMVVM {
	private ArrayList<Voiture> voitures = new ArrayList<Voiture>();
	private ArrayList<Course> courses = new ArrayList<Course>();
	private ArrayList<Pilote> pilotes = new ArrayList<Pilote>(); 
	
	public ArrayList<TypeCourse> typeCourse =new ArrayList<TypeCourse>(Arrays.asList(TypeCourse.values()));
	
	private EvenementSportif selectedEvenementSportif = null;
	private Voiture selectedVoiture = null;

	public Voiture getSelectedVoiture() {
		return selectedVoiture;
	}

	public void setSelectedVoiture(Voiture selectedVoiture) {
		this.selectedVoiture = selectedVoiture;
	}

	public ArrayList<TypeCourse> getTypeCourse() {
		return typeCourse;
	}

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
	@NotifyChange({"voitures","courses","pilotes","selectedVoiture","selectedEvenementSportif"})
	public void setEvenementSelectedp(@BindingParam("evenementp") EvenementSportif myEvenement ){
		this.selectedEvenementSportif = myEvenement;
		this.voitures=myEvenement.getVoitures();
		this.courses = myEvenement.getCourses();
		this.selectedVoiture = null;
	}
	
	@Command
	@NotifyChange({"voitures","courses","selectedVoiture","pilotes"})
	public void setVoitureSelectedV(@BindingParam("voiturev") Voiture myVoiture ){
		this.selectedVoiture = myVoiture;
		this.pilotes = myVoiture.getPiloteDisponibles();
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
	
	@GlobalCommand
    @NotifyChange({"pilotes","selectedVoiture"})
    public void deletePilote(@BindingParam("pilote") Pilote myPilote) {
		selectedVoiture.getPiloteDisponibles().remove(myPilote);
	}
	
	@GlobalCommand
    @NotifyChange({"pilotes","selectedVoiture"})
    public void addPilote() {
		Pilote p = new Pilote();
		p.setVoiture(selectedVoiture);
		selectedVoiture.getPiloteDisponibles().add(p);
    }

	public ArrayList<Pilote> getPilotes() {
		return pilotes;
	}

	public void setPilotes(ArrayList<Pilote> pilotes) {
		this.pilotes = pilotes;
	}
	
}
