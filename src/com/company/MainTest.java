package com.company;


import org.junit.Test;


import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void test() {
        Fraction f1 = new Fraction(1, 3);
        Fraction f2 = new Fraction(1, 3);
        Fraction res = f1.plus(f2);
        assertNotNull(res);
        assertEquals((Integer)2, res.getNumerator());
        assertEquals((Integer)3, res.getDenominator());

    }


    @Test(expected = ArithmeticException.class)
    public void test2() {
        new Fraction(2, 0);
    }
    @Test(expected = ArithmeticException.class)
    public void test3() {
        Fraction f1 = new Fraction(2, 1);
        Fraction f2 = new Fraction(0, 5);
        Fraction res = f1.divide(f2);

    }
    @Test
    public void test4() {
        Fraction f1 = new Fraction(5, 50);
        Fraction f2 = new Fraction(100, 1000);
        Fraction res = f1.multiply(f2);
        assertNotNull(res);
        assertEquals((Integer)1, res.getNumerator());
        assertEquals((Integer)100, res.getDenominator());

    }
    @Test
    public void test5() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 2);
        Fraction res = f1.minus(f2);

        assertEquals((Integer)0, res.getNumerator());
        assertEquals((Integer)0, res.getDenominator());

    }
}
