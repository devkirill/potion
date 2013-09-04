package model.card.concrete.elements;

import model.card.Element;

/**
 * Created with IntelliJ IDEA.
 * User: uj643
 * Date: 24.08.13
 * Time: 4:19
 */
public class CrystalAir extends Element {
    public CrystalAir() {
        super(getName());
    }

    public static String getName() {
        return "Crystal Air";
    }
}
