package model.table;

import model.card.Card;

import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: uj643
 * Date: 20.08.13
 * Time: 17:02
 */

/**
 * Здесь содержаться карты которые находятся у игрока
 */
public class Hand {
    private Set<Card> cards;

    public Hand() {
        this.cards = new HashSet<Card>();
    }

    public void add(Card card) {
        cards.add(card);
    }

    public Iterable<Card> getCards() {
        return cards;
    }
}
