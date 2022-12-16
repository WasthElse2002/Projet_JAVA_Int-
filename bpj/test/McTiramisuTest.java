package bpj.test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import bpj.src.*;

public class McTiramisuTest {

    
    @Test
	public final void testMcTiramisu() {
		McTiramisu monTiramisu = new McTiramisu();

		monTiramisu.addIngredients(Ingredients.CHOCOLAT);
		monTiramisu.addIngredients(Ingredients.CAFE);

		assertEquals(monTiramisu.getMcTiramisu(), "Mon tiramisu est composé de" + (monTiramisu.ingredients));

	}

	public final void testAddIngredients() {

		McTiramisu monTiramisu = new McTiramisu();
		assertNotNull(monTiramisu.ingredients);

	}
}
