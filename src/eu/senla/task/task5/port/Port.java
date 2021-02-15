package eu.senla.task.task5.port;

import eu.senla.task.task5.ship.Ship;
import eu.senla.task.task5.container.Const;

import java.util.Arrays;

public class Port {


    private int quantityShips;

    public Port()//int quantityShips) {
      //  this.quantityShips = quantityShips;
    {
    }

    private Ship place[] = new Ship[Const.QUANTITY_SHIPS_IN_PORT];

    // добавить корабль в порт
    public void put(Ship ship) {
        ++quantityShips;
        if(quantityShips > place.length){
            System.out.println("Ship filled. " + "Ship " + ship.getShipName() + " did not fit.");
            return;
        }
        for (int i = 0; i < place.length; i++){
            if (place[i] == null) {
                place[i] = ship;
                return;
            }

        }
    }

    // убрать корабль из порта
    public void shipDestroyer(Ship ship) {

        for (int i = 0; i < place.length; i++) {
            if (ship==place[i]) {
                place[i] = null;
                quantityShips = quantityShips -1;
            }
        }
    }

    public void ship() {
        System.out.print("Ships in port. Names: ");
        for (Ship ship : place) {
            if (ship != null)
                System.out.print(ship.getShipName() + ". ");
        }
        System.out.println();
    }
    public double getPortMass() {

        double getPortMass = 0;

        for (int i = 0; i < place.length-1; i++) {
            if(place[i] != null)
            getPortMass += place[i].getShipMass();
        }
        return getPortMass;
    }





    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Port port = (Port) o;
        return Arrays.equals(place, port.place);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(place);
    }
   /* public double getContainerkMass(){
        double getDeckMass = 0;

     /*
        for (int i = 0; i < place.length; i++) {
            Deck[] getDec = place[i].getShips();
            for ( i = 0; i < getDec.length; i++) {
                getDeckMass = getDec[i];
            }
        }
        return getDeckMass;
    }*/
}



