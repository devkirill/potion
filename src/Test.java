import model.card.Card;
import model.card.concrete.elements.SnakeEyes;
import model.card.concrete.potions.greatElexir.EternalLove;
import model.card.concrete.potions.greatElexir.GreatElexir;

/**
 * Created with IntelliJ IDEA.
 * User: uj643
 * Date: 23.08.13
 * Time: 0:50
 */
public class Test {
    public static void main(String[] args) {
//        Card card1 = new ElexirOfLoyalty();
//        Card card2 = new LivePotion();
        Card card3 = new EternalLove(new SnakeEyes());
//        System.out.println(card1.getId());
//        System.out.println(card2.getId());
//        System.out.println(card3.getId());
        if (card3.containIngredient(GreatElexir.getName())) {
            System.out.println("ok");
        }
    }
}
