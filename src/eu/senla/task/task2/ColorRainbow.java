package eu.senla.task.task2;

public class ColorRainbow {

    static final String Red = "красный";//1
    static final String Orange = "оранжевый";//2
    static final String Yellow = "желтый";//3
    static final String  Green = "зеленый";//4
    static final String Blue = "голубой";//5
    static final String Indigo  = "синий";//6
    static final String Violet = "фиолетовый";//7

    static final String Redly = "краснo-";
    static final String Orangly = "оранжево-";
    static final String Yellowly = "желто-";
    static final String Greenly = "зелено-";
    static final String Bluely = "голубо-";
    static final String Indigly  = "сине-";
    static final String Violetly = "фиолетово-";

    public static String getRed() {    return Red;    }

    public static String getOrange() {
        return Orange;
    }

    public static String getYellow() {
        return Yellow;
    }

    public static String getGreen() {
        return Green;
    }

    public static String getBlue() {
        return Blue;
    }

    public static String getIndigo() {
        return Indigo;
    }

    public static String getViolet() {
        return Violet;
    }

    public static String getRedly() {
        return Redly;
    }

    public static String getOrangly() {
        return Orangly;
    }

    public static String getYellowly() {
        return Yellowly;
    }

    public static String getGreenly() {
        return Greenly;
    }

    public static String getBluely() {
        return Bluely;
    }

    public static String getIndigly() {
        return Indigly;
    }

    public static String getVioletly() {
        return Violetly;
    }



    public static void colorOutput(int numberColor) {


        switch (numberColor) {
            case 1:
                System.out.println(getRed());
                break;
            case 2:
                System.out.println(getOrange());
                break;
            case 3:
                System.out.println(getYellow());
                break;
            case 4:
                System.out.println(getGreen());
                break;
            case 5:
                System.out.println(getBlue());
                break;
            case 6:
                System.out.println(getIndigo());
                break;
            case 7:
                System.out.println(getViolet());
                break;
            case 11:
                System.out.println(getRed());
                break;
            case 12:
            case 21:
                System.out.println(getRedly() + getOrange());
                break;
            case 13:
            case 31:
                System.out.println(getRedly() + getYellow());
                break;
            case 14:
            case 41:
                System.out.println(getRedly() + getGreen());
                break;
            case 15:
            case 51:
                System.out.println(getRedly() + getBlue());
                break;
            case 16:
            case 61:
                System.out.println(getRedly() + getIndigo());
                break;
            case 17:
            case 71:
                System.out.println(getRedly() + getViolet());
                break;
            case 22:
                System.out.println(getOrange());
                break;
            case 25:
            case 52:
                System.out.println(getOrangly() + getBlue());
                break;
            case 32:
            case 23:
                System.out.println(getYellowly() + getOrange());
                break;
            case 33:
                System.out.println(getYellow());
                break;
            case 35:
            case 53:
                System.out.println(getYellowly() + getBlue());
                break;
            case 36:
            case 63:
                System.out.println(getYellowly() + getIndigo());
                break;
            case 37:
            case 73:
                System.out.println(getYellowly() + getViolet());
                break;
            case 42:
            case 24:
                System.out.println(getGreenly() + getOrange());
                break;
            case 43:
            case 34:
                System.out.println(getGreenly() + getYellow());
                break;
            case 44:
                System.out.println(getGreen());
                break;
            case 45:
            case 54:
                System.out.println(getGreenly() + getBlue());
                break;
            case 46:
            case 64:
                System.out.println(getGreenly() + getIndigo());
                break;
            case 47:
            case 74:
                System.out.println(getGreenly() + getViolet());
                break;
            case 55:
                System.out.println(getBlue());
                break;
            case 62:
            case 26:
                System.out.println(getIndigly() + getOrange());
                break;
            case 65:
            case 56:
                System.out.println(getIndigly() + getBlue());
                break;
            case 66:
                System.out.println(getIndigo());
                break;
            case 72:
            case 27:
                System.out.println(getVioletly() + getOrange());
                break;
            case 75:
            case 57:
                System.out.println(getVioletly() + getBlue());
                break;
            case 76:
            case 67:
                System.out.println(getVioletly() + getIndigo());
                break;
            case 77:
                System.out.println(getViolet());
                break;

            default:
                System.out.println("the number is not correct");
                break;
        }
    }
}



