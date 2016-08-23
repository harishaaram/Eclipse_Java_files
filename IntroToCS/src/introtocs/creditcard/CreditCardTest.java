package introtocs.creditcard;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CreditCardTest {
	
	private CreditCard card1;
	private CreditCard card2;
	

	@Before
	public void setUp() throws Exception {
		card1 = new CreditCard("harish");
		card2 = new CreditCard("malan",3000);
	}

	@Test
	public void testCreditCardString() {
		assertEquals(500,card1.getCreditLimit());
		assertEquals("harish", card1.getCardholder());
	}

	@Test
	public void testCreditCardStringInt() {
		assertEquals("malan", card2.getCardholder());
		assertEquals(3000, card2.getCreditLimit());
		assertEquals(0,card2.getBalance());
	}

	@Test
	public void testMakePurchase() {
		card1.makePurchase(45);

		assertEquals(45,card1.getBalance());
	}

	@Test
	public void testMakePaymennt() {
		card2.makePurchase(100);
		card2.makePaymennt(100);
		assertEquals(0, card2.getBalance());
	}

}
