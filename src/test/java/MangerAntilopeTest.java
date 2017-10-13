import java.util.ArrayList;

import org.junit.Test;

import static org.junit.Assert.*;

public class MangerAntilopeTest {

	@Test
	public final void testAntilopeMangee() {
		ArrayList<Animal> animaux = createMap();
		Lion lion = new Lion();
		
		double minDistance = 10000000.0;
		Animal antilopeMort = new Antilope();
		boolean antilopeMangee = false;
		
		while (!antilopeMangee) {
			for (int i = 0; i < animaux.size(); i++) {
				double d = distanceAntiloppe_Lion(lion, animaux.get(i));
				if (d < minDistance) {
					minDistance = d;
					antilopeMort = animaux.get(i);
				}
			}
			if (antilopeMort.getVitesse() < lion.getVitesse()) { //Si l'antilope la plus proche n'a pas une vitesse supérieure à celle du lion, elle est mangée.
				animaux.remove(antilopeMort);
				antilopeMangee = true;
			}
		}
		
		if (animaux.contains(antilopeMort))
			fail("Le test unitaire a échoué ! \n L'antiloppe n'est pas mort !");
	}
	
	//Cette fonction crée et retourne la map de 800x800
	private ArrayList<Animal> createMap() {
		// TODO Auto-generated method stub
		return null;
	}

	//Cette fonction retourne la distance entre un lion et une antilope
	public static double distanceAntiloppe_Lion (Lion lion, Animal antilope) {
		double distance = 0;
		
		return distance;
	}
}
