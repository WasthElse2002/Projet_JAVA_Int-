import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BurgerTest {

	public final void SimpleBurger() {
		Burger myBigBurger = new Burger(Sauce.KETCHUP);

		myBigBurger.addSteak();
		myBigBurger.addSalad(Salad.LETUCE);

		assertEquals(myBigBurger.salad.getType(), Salad.LETUCE.getType());
		assertEquals(myBigBurger.sauce, Sauce.KETCHUP);

		assertTrue(myBigBurger.steak);
	}
}
