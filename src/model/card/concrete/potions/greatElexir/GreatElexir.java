package model.card.concrete.potions.greatElexir;

import model.card.Element;
import model.card.Potion;
import model.card.Recipe;

/**
 * Created with IntelliJ IDEA.
 * User: uj643
 * Date: 24.08.13
 * Time: 18:53
 */
public class GreatElexir extends Potion {
    public GreatElexir(String id, Element element, Recipe recipe) {
        super(id, element, recipe);
        addIngredient("Great Elexir");
    }
}
