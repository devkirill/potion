package model.card.concrete.potions;

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
        super("Live Potion", element,
                new Recipe(new Class[]{BloodStone.class, MandrakeRoot.class}));
    }
}
