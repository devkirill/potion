package model.card.concrete.elements;

import model.card.Element;

/**
 * Created with IntelliJ IDEA.
 * User: uj643
 * Date: 02.09.13
 * Time: 18:40
 */
public class Maghemite extends Element {
    public Maghemite() {
        super(getName()); // TODO: реализовать магему
    }

    public static String getName() {
        return "Maghemite";
    }
}
