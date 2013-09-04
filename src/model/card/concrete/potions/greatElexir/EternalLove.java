package model.card.concrete.potions.greatElexir;

import model.card.Element;
import model.card.Recipe;
import model.card.concrete.potions.simpleElexir.ElexirOfLoyalty;
import model.card.concrete.potions.simpleElexir.LivePotion;

/**
 * Created with IntelliJ IDEA.
 * User: uj643
 * Date: 24.08.13
 * Time: 4:47
 */
public class EternalLove extends GreatElexir {
    public EternalLove(Element element) {
        super(getName(), element,
                new Recipe(new String[]{LivePotion.getName(), ElexirOfLoyalty.getName()}));
    }

    public static String getName() {
        return "the Great Elixir of Eternal Love";
    }
}
