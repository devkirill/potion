package model.card.concrete.elements;

import model.card.Element;

/**
 * Created with IntelliJ IDEA.
 * User: uj643
 * Date: 02.09.13
 * Time: 18:40
 */
public class PhoenixFeather extends Element {
    public PhoenixFeather() {
        super(getName());
    }

    public static String getName() {
        return "Phoenix Feather";
    }
}
