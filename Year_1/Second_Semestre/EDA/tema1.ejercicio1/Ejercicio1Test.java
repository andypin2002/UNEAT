package edai.tema1.ejercicio1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio1Test {
	@Test
	void testRemoveEs() {
		final String text = "En un lugar de la Mancha, de cuyo nombre no quiero acordarme";
		final String expected = "n un lugar d la Mancha, d cuyo nombr no quiro acordarm";
		final String result = Ejercicio1.removeEs(text);
		assertEquals(expected, result);
	}
}
