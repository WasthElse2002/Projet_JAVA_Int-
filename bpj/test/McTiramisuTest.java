package bpj.test;

import bpj.src.Ingredients;
import bpj.src.McTiramisu;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class McTiramisuTest {

    
    @Test
	public final void testMcTiramisu() {
		McTiramisu monTiramisu = new McTiramisu();

		monTiramisu.addIngredients(Ingredients.BISCUITS);
		monTiramisu.addIngredients(Ingredients.CAFE);

		assertEquals(monTiramisu.getMcTiramisu(), "Mon tiramisu est composé de" + monTiramisu.getIngredients());
	}

	@Test
	public final void testAddIngredients() {
		McTiramisu monTiramisu = new McTiramisu();
		assertNotNull(monTiramisu.getIngredients());
	}
}
