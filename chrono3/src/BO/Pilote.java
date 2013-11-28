package BO;

public class Pilote {
	private String nomPrenom;
	private String couleurCasque;
	public Voiture voiture;
	public Top top;
	
	
	public String getNomPrenom() {
		return nomPrenom;
	}
	public void setNomPrenom(String nomPrenom) {
		this.nomPrenom = nomPrenom;
	}
	public String getCouleurCasque() {
		return couleurCasque;
	}
	public void setCouleurCasque(String couleurCasque) {
		this.couleurCasque = couleurCasque;
	}
	public Voiture getVoiture() {
		return voiture;
	}
	public void setVoiture(Voiture voiture) {
		this.voiture = voiture;
	}
	public Top getTop() {
		return top;
	}
	public void setTop(Top top) {
		this.top = top;
	}
}