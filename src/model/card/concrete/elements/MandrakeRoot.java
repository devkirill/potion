package model.card.concrete.elements;

import model.card.Element;

/**
 * Created with IntelliJ IDEA.
 * User: uj643
 * Date: 24.08.13
 * Time: 4:37
 */
public class MandrakeRoot extends Element {
    public MandrakeRoot() {
        super(getName());
    }

    public static String getName() {
        return "Mandrake Root";
    }
}
