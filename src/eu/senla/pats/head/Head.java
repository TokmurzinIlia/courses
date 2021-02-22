package eu.senla.pats.head;

import eu.senla.pats.Number;

public class Head implements Number {

    String number;

    HeadForms headForms;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public HeadForms getHeadForms() {
        return headForms;
    }

    public void setHeadForms(HeadForms headForms) {
        this.headForms = headForms;
    }

    @Override
    public String toString() {
        return "Head{" +
                "number='" + number + '\'' +
                ", headForms=" + headForms +
                '}';
    }
}
