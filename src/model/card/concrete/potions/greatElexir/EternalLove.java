package model.card.concrete.potions.greatElexir;

import model.card.Element;
import model.card.Recipe;
import model.card.concrete.potions.ElexirOfLoyalty;
import model.card.concrete.potions.LivePotion;

/**
 * Created with IntelliJ IDEA.
 * User: uj643
 * Date: 24.08.13
 * Time: 4:47
 */
public class EternalLove extends GreatElexir {
    public EternalLove(Element element) {
        super("the Great Elixir of Eternal Love", element,
                new Recipe(new Class[]{LivePotion.class, ElexirOfLoyalty.class}));
    }
}
