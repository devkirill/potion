package model.table;

import model.card.Card;
import model.card.Element;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: uj643
 * Date: 05.09.13
 * Time: 15:02
 */
public class ElementsTable {

    private Map<Class<? extends Element>, Collection<Card>> elements;

    public ElementsTable() {
        this.elements = new HashMap<Class<? extends Element>, Collection<Card>>();
    }

    public void addCard(Card card) {
        Class<? extends Element> classElement = card.getElement().getClass();
        if (elements.get(classElement) == null)
            elements.put(classElement, new ArrayList<Card>());
        Collection<Card> stack = elements.get(classElement);
        if (stack.contains(card)) {
            System.out.println("Эта карта уже лежит на столе");
            return;
        }
        stack.add(card);
    }

    public void removeCard(Card card) {
        Class<? extends Element> classElement = card.getElement().getClass();
        if (elements.get(classElement) == null)
            elements.put(classElement, new ArrayList<Card>());
        Collection<Card> stack = elements.get(classElement);
        if (!stack.contains(card)) {
            System.out.println("Была попытка убрать карту со стола которой там нет");
            return;
        }
        stack.remove(card);
    }

}
