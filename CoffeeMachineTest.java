package CoffeeMachine.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import CoffeeMachine.src.CoffeeMachine;

public class CoffeeMachineTest {
CoffeeMachine a;
	@Before
	public void setUp() throws Exception {
		a = new CoffeeMachine(500,500,500,500);
	}

	@Test
	public void CheckResourcesTest() {
		assertTrue(a.checkResources("Espresso"));
		assertTrue(a.checkResources("Latte"));
		assertTrue(a.checkResources("Cappucino"));
	}
	@Test
	public void makeCoffeeTest1() {
		assertEquals("Espresso is done", a.makeCoffee("Espresso"));
	}
	@Test
	public void makeCoffeeTest2() {
		assertEquals("Espresso is done", a.makeCoffee("Espresso"));
		assertEquals("Cappucino is done",a.makeCoffee("Cappucino"));
	}
	@Test
	public void makeCoffeeTest3() {
		assertEquals("Espresso is done", a.makeCoffee("Espresso"));
		assertEquals("Insufficient resources",a.makeCoffee("Latte"));
	}


}
