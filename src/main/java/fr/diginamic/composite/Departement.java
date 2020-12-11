package fr.diginamic.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Departement implements IElement {

	private String nom;

	private List<IElement> elements = new ArrayList<>();

	public Departement(String nom) {
		super();
		this.nom = nom;

	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<IElement> getEntites() {
		return elements;
	}

	public void setEntites(List<IElement> entites) {
		this.elements = entites;
	}

	@Override
	public double calculerSalaire() {
		double totalSalaire = 0.0;
		for (IElement element : elements) {
			totalSalaire += element.calculerSalaire();
		}
		return totalSalaire;

	}

	public Departement add(IElement element) {
		elements.add(element);
		return this;
	}

	public Departement add(IElement... elements) {
		this.elements.addAll(Arrays.asList(elements));
		return this;
	}
}
