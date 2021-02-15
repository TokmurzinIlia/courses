package eu.senla.task.task5.Main;

import eu.senla.task.task5.container.*;
import eu.senla.task.task5.deck.Deck;
import eu.senla.task.task5.port.Port;
import eu.senla.task.task5.ship.Ship1;
import eu.senla.task.task5.ship.Ship2;
import eu.senla.task.task5.ship.Ship;


public class Main {
    public static void main(String[] args) {
        //создаем порт
        Port port = new Port();
//создаем контейнеры разной формы с разными высотами и разной плотностью
        Сontainer container1 = new ContainerBigHex("container1",58,1);
        Сontainer container2 = new ContainerBigCone("container2",25,2);
        Сontainer container3 = new ContainerLittleСone("container3",86,2);
        Сontainer container4 = new ContainerLittleHex("container4",12,1);
        Сontainer container5 = new ContainerBigCylinder("container5",65,2);
        Сontainer container6 = new СontainerLittleCylinder("container6",78,1);
        Сontainer container7 = new СontainerLittleCylinder("container7",91,2);
     //   container1.getContainerMass();
      //  container4.getContainerMass();

        //     System.out.println(String.format("%.0f", container1.getContainerMass()));
         //       System.out.println(String.format("%.0f",container4.getContainerMass()));

        //создаем палубы
        Deck deck = new Deck(1);
        Deck deck1 = new Deck(2);
        Deck deck2 = new Deck(3);
        Deck deck3 = new Deck(4);
        //кладем контейнеры на палубу
        deck1.put(container1);

        //убираем контейнер с палубы

        deck1.containerDestroyer(container1);

        deck1.put(container2);
        deck1.put(container7);
        deck1.put(container7);
        deck.put(container5);
        deck.put(container3);
        deck.put(container5);
        deck.put(container3);
        deck2.put(container6);
        deck2.put(container7);
        deck3.put(container4);
        deck3.put(container3);

        //создаем корабль

        Ship ship2 = new Ship1("Ship2");
        Ship ship1 = new Ship2("ship1");
        Ship ship3 = new Ship2("ship3");
        Ship ship4 = new Ship2("ship4");
        Ship ship5 = new Ship1("ship5");
        Ship ship6 = new Ship2("ship6");
        Ship ship7 = new Ship2("ship7");
        Ship ship8 = new Ship1("ship8");
        Ship ship9 = new Ship2("ship9");
        Ship ship10 = new Ship1("ship10");
        Ship ship11 = new Ship1("ship11");
        Ship ship12 = new Ship1("ship12");

        //ставим палубу в корабль

        ship2.put(deck2);
        ship3.put(deck);
        ship4.put(deck1);
        ship4.put(deck3);
        ship1.put(deck2);
        ship10.put(deck2);

//Контейнеры на палубе
        deck1.container();

        //System.out.println(String.format("%.0f",(container2.getContainerMass()+container7.getContainerMass()+container7.getContainerMass())));
        //System.out.println(String.format("%.0f",deck1.getDeckMass()));
        //System.out.println(String.format("%.0f",ship2.getShipMass()));


        //корабли заходят в порт

        port.put(ship1);
        port.put(ship2);
        port.put(ship3);
        port.put(ship4);
        port.put(ship5);
        port.put(ship6);
        port.put(ship7);
        port.put(ship8);
        port.put(ship9);

        //убираем корабль из порта

        port.shipDestroyer(ship9);
        port.put(ship10);
        port.put(ship11);
        port.put(ship12);
       // System.out.println(String.format("%.0f",deck1.getDeckMass()));
       // System.out.println(String.format("%.0f",ship2.getShipMass()));

 //Корабли в порту
        port.ship();
// масса кораблей в порту
        System.out.println("Масса кораблей в порту " + String.format("%.0f",port.getPortMass()) + " единиц.");

    }
}


