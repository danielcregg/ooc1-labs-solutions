package ie.gmit.javalabs.labexams;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DogTest {

	
	Dog dog1 = new Dog("Rex",10,"Pug");

	@Test
	final void longConstructor_getLong_MatchesValuePassedToConstructor() {
	    Dog dog2 = new Dog("Spot",20,"Dalmatian");
	    
	    assertEquals("Spot", dog2.getName());
	    assertEquals(20, dog2.getWeight());
	    assertEquals("Dalmatian", dog2.getBreed());
	}
	
	@Test
	final void testGetName() {
		assertEquals("Rex", dog1.getName());
	}

	@Test
	final void testSetName() {
		dog1.setName("Bingo");
		assertEquals("Bingo", dog1.getName());
	}

	@Test
	final void testGetWeight() {
		assertEquals(10, dog1.getWeight());
	}

	@Test
	final void testSetWeight() {
		dog1.setWeight(15.5f);
		assertEquals(15.5f, dog1.getWeight());
	}

	@Test
	final void testGetBreed() {
		assertEquals("Pug", dog1.getBreed());
	}

	@Test
	final void testSetBreed() {
		dog1.setBreed("Bulldog");
		assertEquals("Bulldog", dog1.getBreed());
	}

	@Test
	final void testEat() {
		dog1.setWeight(10.5f);
		dog1.eat(11f);
		assertEquals(21.5f, dog1.getWeight());
	}
}
