package ATM.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ATM.src.ATM;

public class ATMTest {
	ATM a;
	@Before
	public void setUp() throws Exception {
		a = new ATM(0,true,true);
	}

	@Test
	public void enterCardTest() {
		a.validCard=false;
		assertFalse(a.enterCard());
	}
	@Test
	public void enterPasswordTest() {
		assertTrue(a.enterCard());
		assertTrue(a.enterPassword());
	}

	@Test
	public void DepositTest() {
		assertTrue(a.enterCard());
		assertTrue(a.enterPassword());
		assertTrue(a.deposit(1000));
		assertEquals(1000,a.balance,0);
	}
	@Test
	public void withdrawTest() {
		assertTrue(a.enterCard());
		assertTrue(a.enterPassword());
		assertTrue(a.deposit(1000));
		assertTrue(a.withdraw(500));
		assertEquals(500,a.balance,0);
	}
	

}
