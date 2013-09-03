package model.table;

import model.card.Card;
import model.card.Recipe;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created with IntelliJ IDEA.
 * User: uj643
 * Date: 20.08.13
 * Time: 17:02
 */
public class Table {

    private Collection<Card> cards;
    private Collection<Recipe> recipes;

    public Table() {
        this.cards = new ArrayList<Card>();
        this.recipes = new ArrayList<Recipe>();
    }

    public Collection<Card> getCards() {
        return cards;
    }

    public Collection<Recipe> getRecipes() {
        return recipes;
    }
}
