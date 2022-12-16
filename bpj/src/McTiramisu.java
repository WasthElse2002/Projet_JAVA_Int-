package bpj.src;
import java.util.ArrayList;

public class McTiramisu {

    private ArrayList <Ingredients> ingredients;

    public McTiramisu() {
        this.ingredients = new ArrayList <Ingredients>();
    }
    
    public void addIngredients(Ingredients ingredients) {
        this.ingredients.add(ingredients);
        for(int i = 0; i < this.ingredients.size(); i++) {
            System.out.print(this.ingredients.get(i));
        }
    }

    public ArrayList<Ingredients> getIngredients() {
        return this.ingredients;
    }

    public String getMcTiramisu() {
        return "Mon tiramisu est composé de" + (this.ingredients);
    }
}
