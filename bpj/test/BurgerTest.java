package bpj.test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import bpj.src.*;
import org.junit.Test;

public class BurgerTest {

	@Test
	public final void simpleBurger() {
		Burger myBigBurger = new Burger(Sauce.KETCHUP);

		myBigBurger.addSteak();
		myBigBurger.addSalad(Salad.LETUCE);

		assertEquals(myBigBurger.salad.getType(), Salad.LETUCE.getType());
		assertEquals(myBigBurger.sauce, Sauce.KETCHUP);

		assertTrue(myBigBurger.steak);
	}
}
