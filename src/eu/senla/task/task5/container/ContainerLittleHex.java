package eu.senla.task.task5.container;

public class ContainerLittleHex implements Сontainer, Const {

    double heightHex;

    String name;

    int densityOneOrTwo;

    public ContainerLittleHex(String name, double heightHex, int densityOneOrTwo ) {

        this.name = name;

        this.heightHex = heightHex;

        this.densityOneOrTwo = densityOneOrTwo;
    }
    public ContainerLittleHex() {

    }


    @Override
    public double getContainerVolume() {
        Double containerVolume = null;
        if (heightHex >= 10 && heightHex <= 100) {
            containerVolume = DIAMETR_LITTLE * DIAMETR_LITTLE * heightHex;
        }
        return containerVolume;
    }

    @Override
    public double getContainerMass() {

        double containerVolume = getContainerVolume();

        int density = 0;

        switch (densityOneOrTwo) {
            case 1:
                density = DENSITY_WATER_ONE;
                break;
            case 2:
                density = DENSITY_WATER_TWO;
                break;

            default:
                System.out.println("Non-extent cargo ");
                break;
        }

        double containerMass = density * containerVolume;

        return containerMass;
    }

    @Override
    public int getDIAMETR() {
        return DIAMETR;
    }

    @Override
    public String getName() {
        return name;
    }
}
