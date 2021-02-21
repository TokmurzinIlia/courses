package eu.senla;

import eu.senla.Head.FactoryBody;
import eu.senla.Head.FactoryHead;
import eu.senla.pats.body.Body;
import eu.senla.pats.head.Head;
import eu.senla.pats.head.HeadForms;

public class Main {

    public static void main(String[] args) {
        FactoryHead factoryHead = new FactoryHead();
        Head head = factoryHead.addHead();
        head.setHeadForms(HeadForms.Ball);
        head.setNumber("12");
        FactoryBody factoryBody = new FactoryBody();
        Body body = factoryBody.addBody();
        System.out.println(head.getHeadForms() + head.getNumber());
    }
}
