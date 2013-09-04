package model.card.concrete.elements;

import model.card.Element;

/**
 * Created with IntelliJ IDEA.
 * User: uj643
 * Date: 24.08.13
 * Time: 4:18
 */
public class SnakeEyes extends Element {
    public SnakeEyes() {
        super(getName());
    }

    public static String getName() {
        return "Snake Eyes";
    }
}
