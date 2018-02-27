package com.company;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    static final Logger log = LoggerFactory.getLogger(Main.class.getName());



    public static void main(String[] args) {
        //BasicConfigurator.configure();
        final String message = "Hello logging!";


        try {
            log.info("Creating fraction 5/0...");
            Fraction f3 = new Fraction(5, 0);
        } catch (ArithmeticException e) {
            log.error(e.toString());
        }



        log.info("Creating fraction 1/3...");
        Fraction f1 = new Fraction(1, 3);
        log.info("Fraction 1/3 created.");
        log.info("Creating fraction 1/3...");
        Fraction f2 = new Fraction(2, 3);
        log.info("Fraction 2/3 created.");
        Fraction res = f1.plus(f2);
        log.info("1/3 + 2/3 = " + res.toString());
    }
}
