package eu.senla.robo;

import eu.senla.pats.body.Body;
import eu.senla.pats.head.Head;

public class Robo {
    private String name;
    private Body body;
    private Head head;

    public Robo() {

    }

    public Robo(String name, Body body, Head head) {
        this.name = name;
        this.body = body;
        this.head = head;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }



    @Override
    public String toString() {
        return "Robo{" +
                "name='" + name + '\'' +
                ", body=" + body +
                ", head=" + head +
                '}';
    }

}
