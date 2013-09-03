package model.card;

import java.util.Collection;

/**
 * Created with IntelliJ IDEA.
 * User: uj643
 * Date: 20.08.13
 * Time: 20:17
 */
public class Element extends Ingredient {

    public Element(String id, Collection<String> elements) {
        super(id);
        for (String element : elements) {
            addIngredient(element);
        }
    }

    public Element(String element) {
        super(element);
    }

}
