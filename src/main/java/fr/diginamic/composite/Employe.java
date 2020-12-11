package fr.diginamic.composite;


public class Employe implements IElement {

	private double salaire;
	
	private String nom;
	
	private String prenom;

	public Employe( String nom, String prenom, double salaire) {
		super();
		this.salaire = salaire;
		this.nom = nom;
		this.prenom = prenom;
	}

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Override
	public double calculerSalaire() {
		return this.salaire;
	}
	
	
}
