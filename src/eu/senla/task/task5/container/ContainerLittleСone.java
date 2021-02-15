package eu.senla.task.task5.container;


public class ContainerLittleСone implements Сontainer, Const {

    String name;

    double heightCone;

    int densityOneOrTwo;

    public ContainerLittleСone() {

    }

    public ContainerLittleСone(String name, double heightCone, int densityOneOrTwo) {

        this.name = name;

        this.heightCone = heightCone;

        this.densityOneOrTwo = densityOneOrTwo;
    }

    @Override
    public double getContainerVolume() {
        Double containerVolume = null;
        if (heightCone >= 10 && heightCone <= 100) {
            containerVolume = ((PI * (DIAMETR_LITTLE/2) * (DIAMETR_LITTLE/2)) * heightCone)/3;
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
        return DIAMETR_LITTLE;
    }

    @Override
    public String getName() {
        return name;
    }
}
