package model.card.concrete.elements;

import model.card.Element;

/**
 * Created with IntelliJ IDEA.
 * User: uj643
 * Date: 24.08.13
 * Time: 4:17
 */
public class WavesEther extends Element {
    public WavesEther() {
        super(getName());
    }

    public static String getName() {
        return "Waves of Ether";
    }
}
