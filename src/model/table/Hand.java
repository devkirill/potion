package model.table;

/**
 * Created with IntelliJ IDEA.
 * User: Kirill Devyatkin
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
}
