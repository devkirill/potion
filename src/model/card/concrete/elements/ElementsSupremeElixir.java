package model.card.concrete.elements;

import model.card.Element;

/**
 * Created with IntelliJ IDEA.
 * User: uj643
 * Date: 05.09.13
 * Time: 13:24
 */
public class ElementsSupremeElixir extends Element {

    public ElementsSupremeElixir() {
        super(getName(), new String[] {
            AstralEnergy.getName(),
            QuintessenceWill.getName(),
            WavesEther.getName(),
        });
    }

    public static String getName() {
        return "Elements of the Supreme Elixir";
    }

}
