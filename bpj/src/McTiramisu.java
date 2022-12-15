import java.util.ArrayList;

public class McTiramisu {

    private ArrayList <Ingredients> ingredients;

    public void addIngredients(Ingredients ingredients) {
        this.ingredients.add(ingredients);
        for(int i = 0; i < this.ingredients.size(); i++) {
            System.out.print(this.ingredients.get(i));
        }
    }

    public String McTiramisu() {
        return "Mon tiramisu est composé de" + (this.ingredients);
    }
}
