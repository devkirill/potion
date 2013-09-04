package model.card.concrete.elements;

import model.card.Element;

/**
 * Created with IntelliJ IDEA.
 * User: uj643
 * Date: 24.08.13
 * Time: 4:48
 */
public class FieryLight extends Element {
    public FieryLight() {
        super(getName());
    }

    public static String getName() {
        return "Fiery Light";
    }
}
