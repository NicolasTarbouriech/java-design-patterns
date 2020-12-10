package fr.diginamic.factory;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import fr.diginamic.factory.beans.EnceinteConnecte;
import fr.diginamic.factory.beans.EnumTypeObjetConnecte;
import fr.diginamic.factory.beans.TelephonePortable;

public class ObjetConnecteFactoryTest {

	@Autowired
	private IObjetConnecteFactory factory = new ObjetConnecteFactory();
	
	@Test
	public void testGetInstance() {

		ObjetConnecte conn = factory.getInstance(EnumTypeObjetConnecte.TelephonePortable, 10);
		assertEquals(TelephonePortable.class, conn.getClass());
	}

	@Test
	public void testGetInstance2() {
		ObjetConnecte conn = factory.getInstance(EnumTypeObjetConnecte.EnceinteConnecte, 20);
		assertEquals(EnceinteConnecte.class, conn.getClass());
	}
	
	
}
