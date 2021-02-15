package eu.senla.task.task5.ship;

import eu.senla.task.task5.deck.Deck;

public interface Ship {

    double getShipMass();

    int getDeckQuantity();

    String getShipName();

    void put(Deck deck);


}
