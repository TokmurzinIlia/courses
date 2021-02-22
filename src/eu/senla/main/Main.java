package eu.senla.main;

import eu.senla.factory.FactoryBody;
import eu.senla.factory.FactoryHead;
import eu.senla.pats.body.Body;
import eu.senla.pats.body.BodyForms;
import eu.senla.pats.head.Head;
import eu.senla.pats.head.HeadForms;
import eu.senla.robo.Robo;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        FactoryHead factoryHead = new FactoryHead();
        Head head = factoryHead.addHead();
        head.setHeadForms(HeadForms.Ball);
        head.setNumber("12");
        Head head1 = factoryHead.addHead();
        head1.setHeadForms(HeadForms.Cube);
        head1.setNumber("15");
        Head head2 = factoryHead.addHead();
        head2.setHeadForms(HeadForms.Ellipse);
        head2.setNumber("22");
        FactoryBody factoryBody = new FactoryBody();
        Body body = factoryBody.addBody();
        body.setbodyForms(BodyForms.Cone);
        body.setNumber("56");
        Body body1 = factoryBody.addBody();
        body1.setbodyForms(BodyForms.Cylinder);
        body1.setNumber("89");
        Body body2 = factoryBody.addBody();
        body2.setbodyForms(BodyForms.Hex);
        body2.setNumber("489");
        Robo robo = new Robo("Bill",body,head);
        Robo robo1 = new Robo();
        robo1.setName("Vasia");
        robo1.setBody(body1);
        robo1.setHead(head1);
        robo.setName("Sanek");
        Robo robo2= new Robo("Bill",body2,head2);
        Robo robo3= new Robo("Ilia",body,head1);
        Robo robo4= new Robo("Tolik",body,head2);
        Robo robo5= new Robo("Vitali",body1,head);
        Robo robo6= new Robo("Aleksey",body1,head2);
        Robo robo7= new Robo("Andry",body2,head);
        Robo robo8= new Robo("David",body2,head1);
        System.out.println(robo);
        System.out.println(robo1);
        System.out.println(robo2);
        System.out.println(robo3);
        System.out.println(robo4);
        System.out.println(robo5);
        System.out.println(robo6);
        System.out.println(robo7);
        System.out.println(robo8);

    }
}
