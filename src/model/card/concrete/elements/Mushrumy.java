package model.card.concrete.elements;

import model.card.Element;

/**
 * Created with IntelliJ IDEA.
 * User: uj643
 * Date: 24.08.13
 * Time: 4:43
 */
public class Mushrumy extends Element {
    public Mushrumy() {
        super(getName());
    }

    public static String getName() {
        return "Mushrumy";
    }
}
