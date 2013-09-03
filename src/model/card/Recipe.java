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

    private Collection<Class<? extends Ingredient>> ingredients;

    public Recipe(Collection<Class<? extends Ingredient>> ingredients) {
        this.ingredients = ingredients;
    }

    public Recipe(Class<? extends Ingredient>[] ingredients) {
        this(Arrays.asList(ingredients));
    }

    public Collection<Class<? extends Ingredient>> getIngredients() {
        return ingredients;
    }

}
