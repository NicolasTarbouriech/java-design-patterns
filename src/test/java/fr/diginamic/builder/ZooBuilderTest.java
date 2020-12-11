package fr.diginamic.builder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class ZooBuilderTest {

	@Test
	public void testAppendZone() {
		ZooBuilder zb = new ZooBuilder("Le Parc Sauvage");
		Zoo zoo = zb.appendZone("Savane", 2).get();
		
		assertEquals("Le Parc Sauvage", zoo.getNom());
		assertEquals(1, zoo.getZone().size());
		assertEquals("Savane", zoo.getZone().get(0).getNom());
	}
	
	@Test
	public void testAppendAnimal() {
		ZooBuilder zb = new ZooBuilder("Le Parc Sauvage");
		
		try {
			Zoo zoo = zb.appendZone("Savane", 2).appendZone("Aquarium", 1)
					    .appendAnimal("Savane", new Lion("Leo"))
					    .appendAnimal("Aquarium", new Dauphin("Flipper")).get();
			
			assertEquals(2, zoo.getZone().size());
			assertEquals("Savane", zoo.getZone().get(0).getNom());
			assertEquals("Aquarium", zoo.getZone().get(1).getNom());
			assertEquals(1, zoo.getZone().get(0).getListeAnimal().size());
			assertEquals(1, zoo.getZone().get(1).getListeAnimal().size());
		} catch (ZoneException e) {
			fail();
		}
	}

	@Test
	public void testAppendAnimalAvecException() {
		ZooBuilder zb = new ZooBuilder("Le Parc Sauvage");
		
		String message = null;
		try {
			Zoo zoo = zb.appendZone("Savane", 2).appendZone("Aquarium", 1)
					    .appendAnimal("Savane", new Lion("Leo")).appendAnimal("Aquarium", new Dauphin("Kiki"))
					    .appendAnimal("Aquarium", new Dauphin("Flipper")).get();
		} catch (ZoneException e) {
			message = e.getMessage();
		}
		assertEquals("La zone Aquarium est pleine.", message);
	}
}
