package model.card;

import model.Identificable;

import java.util.Collection;
import java.util.HashSet;

/**
 * Created with IntelliJ IDEA.
 * User: uj643
 * Date: 24.08.13
 * Time: 4:26
 */
public class Ingredient implements Identificable {
    private String id;
    private Collection<String> ingredients;

    public Ingredient(String id) {
        this.ingredients = new HashSet<String>();
        this.id = id;
        ingredients.add(id);
    }

    protected void addIngredient(String ingredient) {
        this.ingredients.add(ingredient);
    }

    public boolean containIngredient(String ingredient) {
        return ingredients.contains(ingredient);
    }

    public String getId() {
        return id;
    }
}
