package model.card.concrete.potions;

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
        super("Elexir of Loyalty", element,
                new Recipe(new Class[]{DragonTooth.class, MandrakeRoot.class}));
    }
}
