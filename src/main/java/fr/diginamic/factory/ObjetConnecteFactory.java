package fr.diginamic.factory;

import fr.diginamic.factory.beans.EnceinteConnecte;
import fr.diginamic.factory.beans.EnumTypeObjetConnecte;
import fr.diginamic.factory.beans.Tablette;
import fr.diginamic.factory.beans.TelephonePortable;

public class ObjetConnecteFactory implements IObjetConnecteFactory {

	
	@Override
	public ObjetConnecte getInstance(EnumTypeObjetConnecte type, int limitVolts) {
		
		if (type==null) {
			return null;
		}
		
		ObjetConnecte objetConnecte = null;
		
		
		switch (type) {
		
		case EnceinteConnecte:
			objetConnecte = new EnceinteConnecte(limitVolts);
			break;
		case Tablette:
			objetConnecte = new Tablette(limitVolts);
			break;
		case TelephonePortable:
			objetConnecte = new TelephonePortable(limitVolts);
			break;
		default:
			break;
		}
		
		return objetConnecte;
	}
}
