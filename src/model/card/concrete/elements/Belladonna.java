package model.card.concrete.elements;

import model.card.Element;

/**
 * Created with IntelliJ IDEA.
 * User: uj643
 * Date: 24.08.13
 * Time: 4:15
 */
public class Belladonna extends Element {
    public Belladonna() {
        super(getName());
    }

    public static String getName() {
        return "Belladonna";
    }
}
