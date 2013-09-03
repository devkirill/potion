package model.player;

import model.Identificable;
import model.table.Hand;

/**
 * Created with IntelliJ IDEA.
 * User: uj643
 * Date: 20.08.13
 * Time: 20:13
 */
public class Player implements Identificable {
    private Hand hand;
    private String id;
    private int score;

    public Player(String id) {
        this.id = id;
        this.hand = new Hand();
        this.score = 0;
    }

    public String getId() {
        return id;
    }

    public void changeScore(int change) {
        score += change;
    }

    public int getScore() {
        return score;
    }

    public Hand getHand() {
        return hand;
    }
}
