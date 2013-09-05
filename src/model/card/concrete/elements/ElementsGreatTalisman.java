package model.card.concrete.elements;

import model.card.Element;

/**
 * Created with IntelliJ IDEA.
 * User: uj643
 * Date: 05.09.13
 * Time: 13:24
 */
public class ElementsGreatTalisman extends Element {

    public ElementsGreatTalisman() {
        super(getName(), new String[] {
            PhoenixFeather.getName(),
            EnergyThought.getName(),
            DragonTooth.getName(),
        });
    }

    public static String getName() {
        return "Elements for a Great Talisman";
    }

}
