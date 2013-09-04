package model.card.concrete.potions.simpleElexir;

import model.card.Element;
import model.card.Potion;
import model.card.Recipe;
import model.card.concrete.elements.DragonTooth;
import model.card.concrete.elements.MandrakeRoot;

/**
 * Created with IntelliJ IDEA.
 * User: uj643
 * Date: 24.08.13
 * Time: 4:12
 */
public class ElexirOfLoyalty extends Potion {
    public ElexirOfLoyalty(Element element) {
        super(getName(), element,
                new Recipe(new String[]{DragonTooth.getName(), MandrakeRoot.getName()}));
    }

    public static String getName() {
        return "Elexir of Loyalty";
    }
}
