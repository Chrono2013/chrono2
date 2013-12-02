package Ctl;

import java.util.ArrayList;

import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.GlobalCommand;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zul.ListModelList;

import BO.EvenementSportif;
import BO.Voiture;

public class GererVoitureCtlMVVM {
	private ArrayList<Voiture> voitures = new ArrayList<Voiture>();
	private EvenementSportif selectedEvenementSportif = new EvenementSportif();

	public EvenementSportif getSelectedEvenementSportif() {
		return selectedEvenementSportif;
	}

	@NotifyChange("voitures")
	public void setSelectedEvenementSportif(EvenementSportif selectedEvenementSportif) {
		this.selectedEvenementSportif = selectedEvenementSportif;
		this.voitures = selectedEvenementSportif.getVoitures();
	}
	
	@Command
	public void clearSelectionVoiture(@BindingParam("listModel")ListModelList model) {
		model.clearSelection();
	}

	public ArrayList<Voiture> getVoitures() {
		return voitures;
	}

	public void setCourses(ArrayList<Voiture> voitures) {
		this.voitures = voitures;
	}
	
	@GlobalCommand
    @NotifyChange("voitures")
    public void addVoiture() {
		voitures.add(new Voiture(this.selectedEvenementSportif));
    }
	
	
	@GlobalCommand
	@NotifyChange("voitures")
	public void setEvenementSessionSelectedp(@BindingParam("evenementp") EvenementSportif myEvenement,@BindingParam("listModel2")ListModelList model ){
		this.selectedEvenementSportif = myEvenement;
		this.voitures=myEvenement.getVoitures();
		model.clear();
	}
	
	@GlobalCommand
	@NotifyChange("voitures")
	public void setEvenementSelected(@BindingParam("evenementp") EvenementSportif myEvenement,@BindingParam("listModel2")ListModelList model ){
		this.selectedEvenementSportif = myEvenement;
		this.voitures=myEvenement.getVoitures();
		model.clear();
	}
	
	@Command
    @NotifyChange("voitures")
    public void deleteVoiture(@BindingParam("course") Voiture myVoiture) {
		voitures.remove(myVoiture);
	}

	
}
