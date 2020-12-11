package fr.diginamic.builder;

import java.util.ArrayList;
import java.util.List;

public class Zone {

	private String nom;
	private int capacite;
	private List<Animal> animaux;

	public Zone(String nom, int capacite) {
		super();
		this.nom = nom;
		this.capacite = capacite;
		this.animaux = new ArrayList<>();
	}

	public int getCapacite() {
		return capacite;
	}

	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Animal> getListeAnimal() {
		return animaux;
	}

	public void setListeAnimal(List<Animal> listeAnimal) {
		this.animaux = listeAnimal;
	}

}
