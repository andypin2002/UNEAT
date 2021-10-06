package edai.tema1.ejercicio4;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonTest {
	private Person person;

	@BeforeEach
	void setUp() {
		final Calendar birthday = Calendar.getInstance();
		birthday.set(1982, 4, 15);
		person = new Person();
		person.setName("Javi");
		person.setLastName("San Juan");
		person.setBirthday(birthday);
	}

	@Test
	void testGetFullName() {
		final String expected = "Javi San Juan";
		final String result = person.getFullName();
		assertEquals(expected, result);
	}

	@Test
	void testGetAge() {
		Calendar date = Calendar.getInstance();
		date.set(2000, 1, 1);
		final int expected = 17;
		final int result = 	person.getAgeAtDate(date);
		assertEquals(expected, result);
	}

}
