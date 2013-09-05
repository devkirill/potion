package model.table;

import model.player.Player;

import java.util.Collection;

/**
 * Created with IntelliJ IDEA.
 * User: uj643
 * Date: 20.08.13
 * Time: 17:02
 */
public class Table {

    private Collection<Player> players;
    private ElementsTable elementsTable;

    public Table(Collection<Player> players) {
        this.players = players;
        this.elementsTable = new ElementsTable();
    }

    public Iterable<Player> getPlayers() {
        return players;
    }
}
