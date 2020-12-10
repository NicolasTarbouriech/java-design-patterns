package fr.diginamic.factory;

import fr.diginamic.factory.beans.EnumTypeObjetConnecte;

public interface IObjetConnecteFactory {

	ObjetConnecte getInstance(EnumTypeObjetConnecte type, int limitVolts);

}