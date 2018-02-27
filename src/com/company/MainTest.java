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
    public void test6() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(10, 1);
        Fraction res = f1.plus(f2);

        assertEquals((Integer)21, res.getNumerator());
        assertEquals((Integer)2, res.getDenominator());

    }
    @Test(expected = ArithmeticException.class)
    public void test7() {
        Fraction f1 = new Fraction(0, 0);
        Fraction f2 = new Fraction(0, 0);
        Fraction res = f1.divide(f2);


    }
    @Test
    public void test8() {
        Fraction f1 = new Fraction(1, 1);
        Fraction f2 = new Fraction(1, 1);
        Fraction res = f1.plus(f2);

        assertEquals((Integer)2, res.getNumerator());
        assertEquals((Integer)1, res.getDenominator());
    }
    @Test
     public void test9() {
        Fraction f1 = new Fraction(2, 7);
        Fraction res = f1.plus(10);

        assertEquals((Integer)72, res.getNumerator());
        assertEquals((Integer)7, res.getDenominator());
    }

    @Test
    public void test10() {
        Fraction f1 = new Fraction(2, 7);
        Fraction res = f1.plus(0);

        assertEquals((Integer)2, res.getNumerator());
        assertEquals((Integer)7, res.getDenominator());
    }
    @Test
    public void test11() {
        Fraction f1 = new Fraction(2, 7);
        Fraction res = f1.minus(100);

        assertEquals((Integer)698, res.getNumerator());
        assertEquals((Integer)(-7), res.getDenominator());
    }
    @Test
    public void test12() {
        Fraction f1 = new Fraction(2, 7);
        Fraction res = f1.multiply(0);

        assertEquals((Integer)0, res.getNumerator());
        assertEquals((Integer)0, res.getDenominator());
    }
    @Test
    public void test13() {
        Fraction f1 = new Fraction(2, 7);
        Fraction res = f1.multiply(-5);

        assertEquals((Integer)(-10), res.getNumerator());
        assertEquals((Integer)7, res.getDenominator());
    }

    @Test
    public void test14() {
        Fraction f1 = new Fraction(2, 7);
        Fraction res = f1.divide(-7);

        assertEquals((Integer)(-2), res.getNumerator());
        assertEquals((Integer)(49), res.getDenominator());
    }


}
