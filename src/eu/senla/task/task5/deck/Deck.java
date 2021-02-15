package eu.senla.task.task5.deck;


import eu.senla.task.task5.container.Сontainer;
import eu.senla.task.task5.container.Const;

public class Deck {

    private int summWidthContainer=0;

    private int number;

    //int maxNumberOfLittleContainerOnDeck;

    public Deck(int number){//(int maxNumberOfLittleContainerOnDeck) {
     //   this.maxNumberOfLittleContainerOnDeck = maxNumberOfLittleContainerOnDeck;
this.number = number;

    }
    private Сontainer decks[] = new Сontainer[Const.MAX_NUMBER_OF_LITTLE_CONTAINER_ON_DECK];
    // добавить контейнер на палубу
    public void put(Сontainer container) {
        summWidthContainer++;
        if(summWidthContainer > Const.MAX_NUMBER_OF_LITTLE_CONTAINER_ON_DECK* Const.DIAMETR_LITTLE){
            System.out.println("Deck filled. " + "Container " + container.getName() + " did not fit.");
            return;
        }
        for (int i = 0; i < decks.length; i++){
        if (decks[i] == null && summWidthContainer <= Const.MAX_NUMBER_OF_LITTLE_CONTAINER_ON_DECK* Const.DIAMETR_LITTLE){
            decks[i] = container;
            return;
        }

        }

    }




        public double getDeckMass() {
    //    boolean empty = empty();
        double getDeckMass = 0;
     /*   if (empty!=true)
        {
            System.out.println("Deck empty.");
        return 0;}*/

        for (int i = 0; i < decks.length; i++) {
          /*  if (empty!=true)
            {
                System.out.println("Deck empty.");
                break;}*/
        if(decks[i] != null)
            getDeckMass += decks[i].getContainerMass();
        }
        return getDeckMass;
    }




    public void container() {
        System.out.println();
        System.out.print("Container in deck. Names: ");
        for (Сontainer container : decks) {
            if (container != null)
                System.out.print(container.getName() + ". ");
        }
        System.out.println();
    }


/*

    @Override
        public boolean equals (Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Deck deck = (Deck) o;
            return Arrays.equals(decks, deck.decks);
        }

        @Override
        public int hashCode () {
            return Arrays.hashCode(decks);
        }

*/


  public void containerDestroyer(Сontainer container){


  for (int i = 0; i < decks.length; i++) {
        if (container==decks[i]) {
            decks[i] = null;
            summWidthContainer = summWidthContainer - container.getDIAMETR();
        }
     }
}
    public int getNumber() {
        return number;
    }

}


/*
        if (putlock == decks.length - 1 || summWidthContainer >= maxNumberOfLittleContainerOnDeck * DIAMETR_LITTLE) {
            System.out.println("Deck filled. " + "Container " + container.getName() + " did not fit.");

            return;
        }
        putlock++;
        decks[putlock] = container;
        summWidthContainer += container.getDIAMETR();

    }*/

 /*   private boolean empty(){
        boolean empty = true;
        for (Сontainer container : decks) {
            if (container != null){
                empty = false;
                break;
            }
        }
    return empty;}*/