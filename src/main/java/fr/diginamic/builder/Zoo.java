package fr.diginamic.builder;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

	private String nom;

	private List<Zone> zone;

	Zoo(String nom) {
		this.nom = nom;
		zone = new ArrayList<>();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Zone> getZone() {
		return zone;
	}

	public void setZone(List<Zone> zone) {
		this.zone = zone;
	}

}
