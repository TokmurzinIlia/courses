package eu.senla;

import org.junit.jupiter.api.Test;

import java.util.Objects;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class TestsColorRainbow {
//    @BeforeEach
//            public static void printResult(){
//        System.out.println("Тест пройден");
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestsColorRainbow that = (TestsColorRainbow) o;
        return Objects.equals(r, that.r);
    }

    @Override
    public int hashCode() {
        return Objects.hash(r);
    }

    ColorRainbow r = new ColorRainbow();
    @Test
    public void oneReturnRed() {
        assertNotNull(r.getRed());
       // assertNull(r.getRed());
        assertEquals("красный", r.colorOutput(1));
        assertEquals("красный", r.colorOutput(11));
        assertEquals("красный", r.getRed());

    }

    @Test
    public void twoReturnOrange() {
        assertNotNull(r.getOrange());
       // assertNull(r.getRed());
        assertEquals("оранжевый", r.colorOutput(2));
        assertEquals("оранжевый", r.colorOutput(22));
        assertEquals("оранжевый", r.getOrange());

    }
    @Test
    public void threReturnYellow() {
        assertNotNull(r.getYellow());
        // assertNull(r.getRed());
        assertEquals("желтый", r.colorOutput(3));
        assertEquals("желтый", r.colorOutput(33));
        assertEquals("желтый", r.getYellow());

    }
    @Test
    public void fourReturnGreen() {
        assertNotNull(r.getGreen());
        // assertNull(r.getRed());
        assertEquals("зеленый", r.colorOutput(4));
        assertEquals("зеленый", r.colorOutput(44));
        assertEquals("зеленый", r.getGreen());

    }
    @Test
    public void FifeReturnBlue() {
        assertNotNull(r.getBlue());
        // assertNull(r.getRed());
        assertEquals("голубой", r.colorOutput(5));
        assertEquals("голубой", r.colorOutput(55));
        assertEquals("голубой", r.getBlue());

    }
    @Test
    public void sixReturnIndigo() {
        assertNotNull(r.getIndigo());
        // assertNull(r.getRed());
        assertEquals("синий", r.colorOutput(6));
        assertEquals("синий", r.colorOutput(66));
        assertEquals("синий", r.getIndigo());
    }

    @Test
    public void sevenReturnViolet() {
        assertNotNull(r.getViolet());
        // assertNull(r.getRed());
        assertEquals("фиолетовый", r.colorOutput(7));
        assertEquals("фиолетовый", r.colorOutput(77));
        assertEquals("фиолетовый", r.getViolet());
    }

    @Test
    public void prefixRedlyTest() {
        assertNotNull(r.getRedly());
        // assertNull(r.getRed());
        assertEquals("краснo", r.getRedly());
    }

    @Test
    public void prefixOranglyTest() {
        assertNotNull(r.getOrangly());
        // assertNull(r.getRed());
        assertEquals("оранжево-", r.getOrangly());
    }

    @Test
    public void prefixYellowlyTest() {
        assertNotNull(r.getYellowly());
        // assertNull(r.getRed());
        assertEquals("желто-", r.getYellowly());
    }

    @Test
    public void prefixGreenlyTest() {
        assertNotNull(r.getGreenly());
        // assertNull(r.getRed());
        assertEquals("зелено-", r.getGreenly());
    }

    @Test
    public void prefixBluelyTest() {
        assertNotNull(r.getBluely());
        // assertNull(r.getRed());
        assertEquals("голубо-", r.getBluely());
    }

    @Test
    public void prefixIndiglyTest() {
        assertNotNull(r.getIndigly());
        // assertNull(r.getRed());
        assertEquals("сине-", r.getIndigly());
    }

    @Test
    public void prefixVioletlyTest() {
        assertNotNull(r.getVioletly());
        // assertNull(r.getRed());
        assertEquals("фиолетово-", r.getVioletly());
    }

    @Test
    public void test1221ReturnRedlyOrange() {
        assertNotNull(r.getRedly() + r.getOrange());
        // assertNull(r.getRed());
       assertThat(r.colorOutput(21), r.colorOutput(21).equals(r.getRedly() + r.getOrange()));
       assertThat(r.colorOutput(12), r.colorOutput(12).equals(r.getRedly() + r.getOrange()));
        //assertEquals(new StringBuilder("красно-"+"оранжевый"), r.colorOutput(21));
      //  assertEquals("красно-оранжевый", r.getRedly() + r.getOrange());
    }


    }
