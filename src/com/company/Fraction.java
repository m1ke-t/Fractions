package com.company;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.company.GCD.gcd;

public class Fraction implements IFraction {
    static final Logger log = LoggerFactory.getLogger(Fraction.class.getName());


    private Integer numerator;  //числитель
    private Integer denominator;  //знаменатель

    private Fraction reduceFraction(Fraction f) {
        if ((f.numerator == 0) || (f.denominator == 0)) return new Fraction();
        Integer gcd;        //НОД
        gcd = gcd(f.denominator, f.numerator);
        return new Fraction(f.numerator / gcd, f.denominator / gcd);
    }

    @Override
    public Fraction plus(Fraction fraction) {
        this.numerator = this.numerator*fraction.denominator + fraction.numerator*this.denominator;
        this.denominator *= fraction.denominator;
        return reduceFraction(this);
    }

    public Fraction plus(Integer integer) {
       return plus(new Fraction(integer, 1));
    }

    @Override
    public Fraction minus(Fraction fraction) {
        this.numerator = this.numerator*fraction.denominator - fraction.numerator*this.denominator;
        this.denominator *= fraction.denominator;
        return reduceFraction(this);

    }
    public Fraction minus(Integer integer) {
        return minus(new Fraction(integer, 1));
    }

    @Override
    public Fraction multiply(Fraction fraction) {
        this.numerator *= fraction.numerator;
        this.denominator *= fraction.denominator;
        return reduceFraction(this);

    }
    public Fraction multiply(Integer integer) {
        return multiply(new Fraction(integer, 1));
    }

    @Override
    public Fraction divide(Fraction fraction) throws ArithmeticException{
        if (fraction.numerator == 0) {
            log.warn("Divider shouldn't be equals to zero");
            //System.out.println("Divider shouldn't be equals to zero");
            throw new ArithmeticException();
        }
        this.numerator *= fraction.denominator;
        this.denominator *= fraction.numerator;
        return reduceFraction(this);

    }
    public Fraction divide(Integer integer) {
        return divide(new Fraction(integer, 1));
    }



    public Fraction(Integer numerator, Integer denominator) throws ArithmeticException{
        if (denominator == 0) {
            log.warn("Divider shouldn't be equals to zero");
            //System.out.println("Divider shouldn't be equals to zero");
            throw new ArithmeticException();
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }
    private Fraction() {
        this.numerator = 0;
        this.denominator = 0;
    }

    public Integer getNumerator() {
        return numerator;
    }
    
    public Integer getDenominator() {
        return denominator;
    }

    @Override
    public String toString() {
        if (denominator == 1) return numerator.toString();
        if (denominator.equals(numerator)) return "1";
        if (numerator > denominator){
            if (numerator%denominator != 0)
            return numerator/denominator + "(" + numerator%denominator + "/" + denominator + ")";
            else return numerator/denominator + "";
        }
        return  numerator + "/" + denominator;
    }
}
