package com.company;

import org.junit.Test;
import static org.junit.Assert.*;
import static com.company.GCD.gcd;

public class GCDTest {

    @Test
    public void test() {
        assertEquals(1, gcd(1, 2));
        assertEquals(-20, gcd(-100, 20));
        assertEquals(0, gcd(0, 0));
        assertEquals(-1, gcd(-1, -8));
    }
}
