package eu.senla;

public class CPU<CPU> {

    String name;

    @Override
    public String toString() {
        return "CPU{" +
                "name='" + name + '\'' +
                ", frequency=" + frequency +
                '}';
    }

    int frequency;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public CPU(String name, int frequency) {
        this.name = name;
        this.frequency = frequency;
    }

}
