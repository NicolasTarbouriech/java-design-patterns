package fr.diginamic.builder;

import java.util.Optional;

public class ZooBuilder {

	private Zoo zoo;

	public ZooBuilder(String nom) {
		this.zoo = new Zoo(nom);
	}

	public ZooBuilder appendZone(String nomZone, int capacite) {

		Zone zone = new Zone(nomZone, capacite);
		zoo.getZone().add(zone);
		return this;
	}

	public ZooBuilder appendAnimal(String nomZone, Animal animal) throws ZoneException {

		// Etape 1: retrouver la zone dans la liste de zones du zoo
		Optional<Zone> opt = zoo.getZone().stream().filter(z -> z.getNom().equals(nomZone)).findFirst();

		if (opt.isPresent()) {
			Zone z = opt.get();
			if (z.getListeAnimal().size() < z.getCapacite()) {
				z.getListeAnimal().add(animal);
			} else {
				throw new ZoneException("La zone " + nomZone + " est pleine.");
			}
		} else {
			throw new ZoneException("La zone " + nomZone + " n'existe pas");
		}

		return this;
	}

	public Zoo get() {
		return this.zoo;
	}

}
