package com.nitome.dto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PriceTest {

    @Test
    void testCurrencyString() {
        Price price = new Price(100.0, "INR");

        assertEquals("₹100", price.toString());
    }

    @Test
    void testCurrencyStringWithWringCcyCode() {
        Price price = new Price(100.0, "INRxxx");

        Assertions.assertThrows(IllegalArgumentException.class, () -> price.toString());
    }

    @Test
    void testPriceRange() {

        Price price1 = new Price(100.0, "INR");
        Price price2 = new Price(300.0, "INR");

        Range<Price> range1 = new Range<>(price1, price2);

        assertEquals("₹100 - ₹300", range1.toString());
    }

    @Test
    void testPriceRangeFromNothingToUpperLimit() {

        Price price2 = new Price(300.0, "INR");

        Range<Price> range1 = new Range<>(null, price2);

        assertEquals("upto ₹300", range1.toString());
    }
}
