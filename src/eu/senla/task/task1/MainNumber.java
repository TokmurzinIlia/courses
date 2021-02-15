package eu.senla.task.task1;


public class MainNumber {
    static byte a1;
    static short b1;
    static int c1;
    static long d1;
    static float e1;
    static double f1;
    static char g1;
    static  boolean h1;

    static  Byte I1;
    static  Short J1;
    static  Integer K1;
    static  Long L1;
    static Float M1;
    static Double N1;
    static Character O1;
    static Boolean P1;

    static String myString1;


    public static void main(String[] args) {

        Number number = new Number();
        number.setA((byte)88);
        number.setB((short)150);
        number.setC(123456789);
        number.setD((long) 2354568798789L);
        number.setE(123.56f);
        number.setF(123456.789456);
        number.setG((char) 4562);
        number.setH(true);

        number.setI((byte) 12);
        number.setJ((short)129);
        number.setK(123456);
        number.setL(123456789L);
        number.setM(4658.456f);
        number.setN(135689.889);
        number.setO((char) 45641);
        number.setP(false);
        number.setMyString("bull");
        short s = number.getA();
        byte y = (byte) number.getB();
        System.out.println(y);// выдает - 106, не правильно


        a1 = 25;
        b1 = 1235;
        c1 = 123456;
        d1 = 123456789456L;
        e1 = 12.45f;
        f1 = 123456.123456;
        g1 = 12356;
        h1 = false;

        I1 = 123;
        J1 = 1234;
        K1 = 123456;
        L1 = 123456789456L;
        M1 = 12345.456f;
        N1 = 123456789.123456789;
        O1 = 12345;
        P1 = true;
        myString1 = "Hi-Hi";




        byte a2 = 127;
        short b2 = 32767;
        int c2 = 2147483647;
        long d2 = 9223372036854775807L;
        float e2 = 2.333f;
        double f2 = 235554568.2566;
        char g2 = 6556;
        boolean h2 = true;
        String myString2 = "Hello World";

        // Преобразования
        String str1 = "12.25";
        double per = Double.parseDouble(str1);
        double per1 = Double.valueOf(str1);
        Integer inter = 1235;
//Byte by = inter; - 1235 > 127, не влазит.
        int inter1 = inter;
        int inter2 = 456789;
        Integer inter3 = inter2;
        double u = 23.123456;
        String str2 = Double.toString(u);
        int inter4 = 1235;
        double u1 = Double.valueOf(inter4);
        int inter5 = number.getC();
        char ch = number.getO();
        System.out.println(str1);
        System.out.println(per);
        System.out.println(inter);
        System.out.println(inter1);
        System.out.println(inter2);
        System.out.println(inter3);
        System.out.println(u);
        System.out.println(str2);
        System.out.println(inter4);
        System.out.println(u1);
        System.out.println(inter5);
        System.out.println(ch);
        System.out.println(number.getA());
        System.out.println(number.getB());
        System.out.println(number.getC());
        System.out.println(number.getD());
        System.out.println(number.getE());
        System.out.println(number.getF());
        System.out.println(number.getG());
        System.out.println(number.getH());
        System.out.println(number.getI());
        System.out.println(number.getJ());
        System.out.println(number.getK());
        System.out.println(number.getL());
        System.out.println(number.getM());
        System.out.println(number.getN());
        System.out.println(number.getO());
        System.out.println(number.getP());
        System.out.println(number.getMyString());
        System.out.println(a1);
        System.out.println(b1);
        System.out.println(c1);
        System.out.println(d1);
        System.out.println(e1);
        System.out.println(f1);
        System.out.println(g1);
        System.out.println(h1);
        System.out.println(I1);
        System.out.println(J1);
        System.out.println(K1);
        System.out.println(L1);
        System.out.println(M1);
        System.out.println(N1);
        System.out.println(O1);
        System.out.println(P1);
        System.out.println(myString1);
        System.out.println(a2);
        System.out.println(b2);
        System.out.println(c2);
        System.out.println(d2);
        System.out.println(e2);
        System.out.println(f2);
        System.out.println(g2);
        System.out.println(h2);
        System.out.println(myString2);



        System.out.println(per1+per);
    }
}

