package eu.senla.pats.body;

import eu.senla.pats.Number;

public class Body implements Number {

    String number;

    BodyForms bodyForms;


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public BodyForms getBodyForms() {
        return bodyForms;
    }

    public void setbodyForms(BodyForms bodyForms) {

        this.bodyForms = bodyForms;

    }
    @Override
    public String toString() {
        return "Body{" +
                "number='" + number + '\'' +
                ", bodyForms=" + bodyForms +
                '}';
    }
}