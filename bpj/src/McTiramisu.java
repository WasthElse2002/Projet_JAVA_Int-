import java.util.ArrayList;

public class McTiramisu {

    private ArrayList <Ingredients> ingredients;

    public void addIngredients(Ingredients ingredients) {
        this.ingredients.add(ingredients);
    }

    for(int i = 0; i < ingredients.size(); i++) {
        System.out.print(ingredients.get(i));
    }
    public McTiramisu() {
    }
}
