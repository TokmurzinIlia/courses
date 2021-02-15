package eu.senla.task.task5.ship;

import eu.senla.task.task5.deck.Deck;
import eu.senla.task.task5.container.Const;

import java.util.Arrays;

import java.util.Objects;

public class Ship1 implements Ship {

    private int quantityDeck;

    private String name;

    private Deck[] ship1 = new Deck[Const.MAX_DECK_SHIP1];

    //Deck deck;

    public Ship1(String name) {
        this.name = name;
    }
   /* public Ship1(String name, Deck deck) {
        this.name = name;

        this.deck = deck;
    }*/

    public void put(Deck deck) {
        ++quantityDeck;
        if(quantityDeck > ship1.length){
            System.out.println("Ship filled. " + "Deck " + deck.getNumber() + " did not fit.");
            return;
        }
        for (int i = 0; i < ship1.length; i++){
            if (ship1[i] == null && quantityDeck <= Const.MAX_DECK_SHIP1) {
                ship1[i] = deck;
                return;
            }

        }

    }

    public double getShipMass() {

        double getShipMass = 0;
        for (int i = 0; i < ship1.length; i++) {
            if(ship1[i] != null)
            getShipMass += ship1[i].getDeckMass();
        }
        return getShipMass;
    }

    @Override
    public int getDeckQuantity() {
        return Const.MAX_DECK_SHIP1;
    }

    public void container() {
        System.out.println();
        System.out.print("Deck in ship. Numer: ");
        for (Deck deck : ship1) {
            if (deck != null)
                System.out.print(deck.getNumber() + ". ");
        }
    }

    public void deckDestroyer(Deck deck){


        for (int i = 0; i < ship1.length; i++) {
            if (deck==ship1[i]) {
                //пробовал через equals, удаляет все однопалубные кораблики
                ship1[i] = null;
            }
        }
    }

    @Override
    public String getShipName() {
        return name;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ship1 ship11 = (Ship1) o;
        return quantityDeck == ship11.quantityDeck && Arrays.equals(ship1, ship11.ship1);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(quantityDeck);
        result = 31 * result + Arrays.hashCode(ship1);
        return result;
    }
}


