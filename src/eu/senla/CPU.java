package eu.senla;

import java.util.Objects;

public class CPU {

    String name;

    int frequency;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CPU cpu = (CPU) o;
        return frequency == cpu.frequency && Objects.equals(name, cpu.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, frequency);
    }

    @Override
    public String toString() {
        return "CPU{" +
                "name='" + name + '\'' +
                ", frequency=" + frequency +
                '}';
    }



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
