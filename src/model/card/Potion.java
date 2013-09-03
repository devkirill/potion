package model.card;

/**
 * Created with IntelliJ IDEA.
 * User: uj643
 * Date: 20.08.13
 * Time: 20:17
 */
public class Potion extends Card {

    private Recipe recipe;

    public Potion(String id, Element element, Recipe recipe) {
        super(id, element);
        this.recipe = recipe;
    }

    public void select() {

    }

    public void use() {

    }

    public boolean check() {
        return false;
    }
}
