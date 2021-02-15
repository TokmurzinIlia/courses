package eu.senla.task.task5.ship;

import eu.senla.task.task5.deck.Deck;
import eu.senla.task.task5.container.Const;

import java.util.Arrays;
import java.util.Objects;

public class Ship2 implements Ship {

    private int quantityDeck;

    //Deck deck;

   // Deck deck1;

    private String name;

    private Deck[] ship2 = new Deck[Const.MAX_DECK_SHIP2];

    public Ship2(String name) {

        this.name = name;
    }

 /*   public Ship2(String name, Deck deck, Deck deck1) {

        this.name = name;

        this.deck = deck;

        this.deck1 = deck1;
    }*/

    public void put(Deck deck) {
        ++quantityDeck;
        if(quantityDeck > ship2.length){
            System.out.println("Ship filled. " + "Container " + deck.getNumber() + " did not fit.");
            return;
        }
        for (int i = 0; i < ship2.length; i++){
            if (ship2[i] == null && quantityDeck <= Const.MAX_DECK_SHIP2) {
                ship2[i] = deck;
                return;
            }

        }

    }

    public double getShipMass() {

        double getShipMass = 0;
        for (int i = 0; i < ship2.length; i++) {
            if(ship2[i] != null)
            getShipMass += ship2[i].getDeckMass();
        }
        return getShipMass;
    }

    @Override
    public int getDeckQuantity() {
        return Const.MAX_DECK_SHIP2;
    }

    public void container() {
        System.out.println();
        System.out.print("Deck in ship. Numer: ");
        for (Deck deck : ship2) {
            if (deck != null)
                System.out.print(deck.getNumber() + ". ");
        }
    }

    public void deckDestroyer(Deck deck){


        for (int i = 0; i < ship2.length; i++) {
            if (deck == ship2[i]) {
                //пробовал через equals, удаляет все двухпалубные кораблики
                ship2[i] = null;
            }
        }
    }

    @Override
    public String getShipName() {
        return name;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ship2 ship21 = (Ship2) o;
        return quantityDeck == ship21.quantityDeck && Arrays.equals(ship2, ship21.ship2);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(quantityDeck);
        result = 31 * result + Arrays.hashCode(ship2);
        return result;
    }
}
