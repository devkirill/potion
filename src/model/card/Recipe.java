package model.card;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created with IntelliJ IDEA.
 * User: uj643
 * Date: 24.08.13
 * Time: 3:00
 */
public class Recipe {

    private Collection<String> ingredients;

    public Recipe(Collection<String> ingredients) {
        this.ingredients = ingredients;
    }

    public Recipe(String[] ingredients) {
        this(Arrays.asList(ingredients));
    }

    public Collection<String> getIngredients() {
        return ingredients;
    }

}
