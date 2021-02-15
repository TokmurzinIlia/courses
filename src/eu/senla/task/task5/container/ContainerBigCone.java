package eu.senla.task.task5.container;

public class ContainerBigCone implements Сontainer, Const {

    private String name;

    private double heightCone;

    private int densityOneOrTwo;

     ContainerBigCone() {

    }

     public ContainerBigCone(String name, double heightCone, int densityOneOrTwo) {

        this.name = name;

        this.heightCone = heightCone;

         this.densityOneOrTwo = densityOneOrTwo;
    }

    @Override
    public double getContainerVolume() {
        Double containerVolume = null;
        if (heightCone >= 10 && heightCone <= 100) {
            containerVolume = ((PI * (DIAMETR/2) * (DIAMETR/2)) * heightCone)/3;
        }
        return containerVolume;
    }

    @Override
    public double getContainerMass() {
        double containerVolume = getContainerVolume();
      /*  if (densityOneOrTwo == 1) {
            density = DENSITY_WATER_ONE;
        }
        if (densityOneOrTwo == 2) {
            density = DENSITY_WATER_TWO;
        }
        if (densityOneOrTwo != 2 && densityOneOrTwo != 1) {
        System.out.println("Non-extent cargo ");}*/

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
