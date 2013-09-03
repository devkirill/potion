package model.card;

/**
 * Created with IntelliJ IDEA.
 * User: uj643
 * Date: 20.08.13
 * Time: 17:02
 */
public abstract class Card extends Ingredient {
    private Element element;

    public Card(String id, Element element) {
        super(id);
        this.element = element;
    }

    public abstract void select();

    public abstract void use();

    public abstract boolean check();
}
