package model.card.concrete.potions.simpleElexir;

import model.card.Element;
import model.card.Potion;
import model.card.Recipe;
import model.card.concrete.elements.BloodStone;
import model.card.concrete.elements.MandrakeRoot;

/**
 * Created with IntelliJ IDEA.
 * User: uj643
 * Date: 24.08.13
 * Time: 4:12
 */
public class LivePotion extends Potion {
    public LivePotion(Element element) {
        super(getName(), element,
                new Recipe(new String[]{BloodStone.getName(), MandrakeRoot.getName()}));
    }

    public static String getName() {
        return "Live Potion";
    }
}
