package eu.senla.task.task5.container;

public class ContainerBigCylinder implements Сontainer, Const {

    private String name;

    private double heightCylinder;

    private int densityOneOrTwo;

    public ContainerBigCylinder() {

    }

    public ContainerBigCylinder(String name, double heightCylinder, int densityOneOrTwo) {

        this.name = name;

        this.heightCylinder = heightCylinder;

        this.densityOneOrTwo = densityOneOrTwo;
    }



    @Override
    public double getContainerVolume() {
        Double containerVolume = null;
        if (heightCylinder >= 10 && heightCylinder <= 100) {
            containerVolume = PI * (DIAMETR/2) * (DIAMETR/2) * heightCylinder;
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

