package model.card.concrete.elements;

import model.card.Element;

/**
 * Created with IntelliJ IDEA.
 * User: uj643
 * Date: 24.08.13
 * Time: 4:14
 */
public class AstralEnergy extends Element {
    public AstralEnergy() {
        super(getName());
    }

    public static String getName() {
        return "Astral Energy";
    }
}
