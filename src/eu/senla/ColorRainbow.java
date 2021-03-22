package eu.senla;

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


    static String colorOutput = null;
    public String colorOutput(int numberColor) {

        switch (numberColor) {
            case 1:
                colorOutput = getRed();
                break;
            case 2:
                colorOutput = getOrange();
                break;
            case 3:
                colorOutput = getYellow();
                break;
            case 4:
                colorOutput = getGreen();
                break;
            case 5:
                colorOutput = getBlue();
                break;
            case 6:
                colorOutput = getIndigo();
                break;
            case 7:
                colorOutput = getViolet();
                break;
            case 11:
                colorOutput = getRed();
                break;
            case 12:
            case 21:
                colorOutput = (getRedly() + getOrange());
                break;
            case 13:
            case 31:
                colorOutput = (getRedly() + getYellow());
                break;
            case 14:
            case 41:
                colorOutput = (getRedly() + getGreen());
                break;
            case 15:
            case 51:
                colorOutput = (getRedly() + getBlue());
                break;
            case 16:
            case 61:
                colorOutput = (getRedly() + getIndigo());
                break;
            case 17:
            case 71:
                colorOutput = (getRedly() + getViolet());
                break;
            case 22:
                colorOutput = (getOrange());
                break;
            case 25:
            case 52:
                colorOutput =(getOrangly() + getBlue());
                break;
            case 32:
            case 23:
                colorOutput = (getYellowly() + getOrange());
                break;
            case 33:
                colorOutput = (getYellow());
                break;
            case 35:
            case 53:
                colorOutput = (getYellowly() + getBlue());
                break;
            case 36:
            case 63:
                colorOutput = (getYellowly() + getIndigo());
                break;
            case 37:
            case 73:
                colorOutput = (getYellowly() + getViolet());
                break;
            case 42:
            case 24:
                colorOutput = (getGreenly() + getOrange());
                break;
            case 43:
            case 34:
                colorOutput = (getGreenly() + getYellow());
                break;
            case 44:
                colorOutput = (getGreen());
                break;
            case 45:
            case 54:
                colorOutput = (getGreenly() + getBlue());
                break;
            case 46:
            case 64:
                colorOutput = (getGreenly() + getIndigo());
                break;
            case 47:
            case 74:
                colorOutput = (getGreenly() + getViolet());
                break;
            case 55:
                colorOutput = (getBlue());
                break;
            case 62:
            case 26:
                colorOutput = (getIndigly() + getOrange());
                break;
            case 65:
            case 56:
                colorOutput = (getIndigly() + getBlue());
                break;
            case 66:
                colorOutput = (getIndigo());
                break;
            case 72:
            case 27:
                colorOutput = (getVioletly() + getOrange());
                break;
            case 75:
            case 57:
                colorOutput = (getVioletly() + getBlue());
                break;
            case 76:
            case 67:
                colorOutput = (getVioletly() + getIndigo());
                break;
            case 77:
                colorOutput = (getViolet());
                break;

            default:
                colorOutput ="the number is not correct";
                break;
        }
  return colorOutput;
    }
    public static void print(){
        System.out.println(colorOutput);
    }
}



