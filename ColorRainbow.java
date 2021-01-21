package Task2;

import java.util.Scanner;

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

    public static String getRed() {
        return Red;
    }

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

    public static void colorOutput() {
        int a = 2;
        while (a != 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a digit from 1 to 7 or a number consisting of digit from 1 to 7, exit 0:");
            a = scanner.nextInt();
            // красный 1
            // оранжевый 2
            // желтый 3
            // зеленый 4
            // голубой 5
            // синий 6
            // фиолетовый 7

                switch (a) {
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
                        System.out.println(getRedly() + getOrange());
                        break;
                    case 13:
                        System.out.println(getRedly() + getYellow());
                        break;
                    case 14:
                        System.out.println(getRedly() + getGreen());
                        break;
                    case 15:
                        System.out.println(getRedly() + getBlue());
                        break;
                    case 16:
                        System.out.println(getRedly() + getIndigo());
                        break;
                    case 17:
                        System.out.println(getRedly() + getViolet());
                        break;
                    case 21:
                        System.out.println(getOrangly() + getRed());
                        break;
                    case 22:
                        System.out.println(getOrange());
                        break;
                    case 23:
                        System.out.println(getOrangly() + getYellow());
                        break;
                    case 24:
                        System.out.println(getOrangly() + getGreen());
                        break;
                    case 25:
                        System.out.println(getOrangly() + getBlue());
                        break;
                    case 26:
                        System.out.println(getOrangly() + getIndigo());
                        break;
                    case 27:
                        System.out.println(getOrangly() + getViolet());
                        break;
                    case 31:
                        System.out.println(getYellowly() + getRed());
                        break;
                    case 32:
                        System.out.println(getYellowly() + getOrange());
                        break;
                    case 33:
                        System.out.println(getYellow());
                        break;
                    case 34:
                        System.out.println(getYellowly() + getGreen());
                        break;
                    case 35:
                        System.out.println(getYellowly() + getBlue());
                        break;
                    case 36:
                        System.out.println(getYellowly() + getIndigo());
                        break;
                    case 37:
                        System.out.println(getYellowly() + getViolet());
                        break;
                    case 41:
                        System.out.println(getGreenly() + getRed());
                        break;
                    case 42:
                        System.out.println(getGreenly() + getOrange());
                        break;
                    case 43:
                        System.out.println(getGreenly() + getYellow());
                        break;
                    case 44:
                        System.out.println(getGreen());
                        break;
                    case 45:
                        System.out.println(getGreenly() + getBlue());
                        break;
                    case 46:
                        System.out.println(getGreenly() + getIndigo());
                        break;
                    case 47:
                        System.out.println(getGreenly() + getViolet());
                        break;
                    case 51:
                        System.out.println(getBluely() + getRed());
                        break;
                    case 52:
                        System.out.println(getBluely() + getOrange());
                        break;
                    case 53:
                        System.out.println(getBluely() + getYellow());
                        break;
                    case 54:
                        System.out.println(getBluely() + getGreen());
                        break;
                    case 55:
                        System.out.println(getBlue());
                        break;
                    case 56:
                        System.out.println(getBluely() + getIndigo());
                        break;
                    case 57:
                        System.out.println(getBluely() + getViolet());
                        break;
                    case 61:
                        System.out.println(getIndigly() + getRed());
                        break;
                    case 62:
                        System.out.println(getIndigly() + getOrange());
                        break;
                    case 63:
                        System.out.println(getIndigly() + getYellow());
                        break;
                    case 64:
                        System.out.println(getIndigly() + getGreen());
                        break;
                    case 65:
                        System.out.println(getIndigly() + getBlue());
                        break;
                    case 66:
                        System.out.println(getIndigo());
                        break;
                    case 67:
                        System.out.println(getIndigly() + getViolet());
                        break;
                    case 71:
                        System.out.println(getVioletly() + getRed());
                        break;
                    case 72:
                        System.out.println(getVioletly() + getOrange());
                        break;
                    case 73:
                        System.out.println(getVioletly() + getYellow());
                        break;
                    case 74:
                        System.out.println(getVioletly() + getGreen());
                        break;
                    case 75:
                        System.out.println(getVioletly() + getBlue());
                        break;
                    case 76:
                        System.out.println(getVioletly() + getIndigo());
                        break;
                    case 77:
                        System.out.println(getViolet());
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("the number is not correct");
                        break;
                }
        }
    }

}
