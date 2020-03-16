package com.quantitymeasurement;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QuantityMeasurementTest {

    QuantityMeasurement quantityMeasurement;
    double inch1,inch2,feet1,feet2,feet,inch,yard;

    @Before
    public void setUp() throws Exception {
        quantityMeasurement = new QuantityMeasurement();
    }

    @Test
    public void givenZeroFeet_WhenEqual_ShouldReturnEqual() {
        feet1 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.FEET, 0);
        feet2 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.FEET, 0);
        Assert.assertEquals(feet1,feet2,0.0);
    }

    @Test
    public void givenZeroFeet_WhenNotEqual_ShouldReturnFalse() {
        feet1 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.FEET, 0);
        feet2 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.FEET, 1);
        Assert.assertNotEquals(feet1,feet2,0.0);
    }

    @Test
    public void givenFeetNull_WhenEqual_ShouldReturnTrue() {
        boolean nullCheck = quantityMeasurement.equals(null);
        Assert.assertEquals(true,nullCheck);
    }

    @Test
    public void givenFeetObject_WhenEqual_ShouldReturnTrue() {
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement();
        Assert.assertEquals(quantityMeasurement,quantityMeasurement1);
    }

    @Test
    public void givenType_WhenEqual_ShouldReturnTrue() {
        boolean typeCheck= quantityMeasurement.equals(quantityMeasurement);
        Assert.assertEquals(true,typeCheck);
    }

    @Test
    public void givenFeet_WhenEqual_ShouldReturnTrue() {
        feet1 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.FEET, 2.2);
        feet2 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.FEET, 2.2);
        Assert.assertEquals(feet1,feet2,0.0);
    }

    @Test
    public void givenZeroInch_WhenEqual_ShouldReturnTrue() {
        inch1 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.INCH, 0);
        inch2 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.INCH, 0);
        Assert.assertEquals(inch1,inch2,0.0);
    }

    @Test
    public void givenZeroInch_WhenNotEqual_ShouldReturnFalse() {
        inch1 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.INCH, 0);
        inch2 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.INCH, 1);
        Assert.assertNotEquals(inch1,inch2,0.0);
    }

    @Test
    public void givenInchNull_WhenEqual_ShouldReturnTrue() {
        boolean nullCheck = quantityMeasurement.equals(null);
        Assert.assertEquals(true,nullCheck);
    }

    @Test
    public void givenInchObject_WhenEqual_ShouldReturnTrue() {
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement();
        Assert.assertEquals(this.quantityMeasurement,quantityMeasurement1);
    }

    @Test
    public void givenInchClass_WhenEqual_ShouldReturnTrue() {
        boolean typeCheck= quantityMeasurement.equals(quantityMeasurement);
        Assert.assertEquals(true,typeCheck);
    }

    @Test
    public void givenInch_WhenEqual_ShouldReturnTrue() {
        inch1 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.INCH,1.1);
        inch2 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.INCH, 1.1);
        Assert.assertEquals(inch1,inch2,0.0);
    }

    @Test
    public void givenFeetInch_WhenBothAreZero_ShouldReturnEqual() {
        inch = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.FEET,0.0);
        feet = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.INCH, 0.0);
        Assert.assertEquals(feet1,inch1,0.0);
    }

    @Test
    public void givenOneFeet_WhenNotEqualOneInch_ShouldReturnTrue() {
        inch = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.FEET,1);
        Assert.assertNotEquals(1,inch,0.0);
    }

    @Test
    public void givenOneInch_WhenNotEqualOneFeet_ShouldReturnTrue() {
        inch = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.INCH,1);
        feet = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.FEET, 1);
        Assert.assertNotEquals(feet,inch,0.0);
    }

    @Test
    public void givenOneFeet_WhenEqualTwelveInch_ShouldReturnTrue() {
        inch = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.FEET,1);
        Assert.assertEquals(12,inch,0.0);
    }

    @Test
    public void givenTwelveInch_WhenEqualOneFeet_ShouldReturnTrue() {
        inch = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.INCH,12);
        feet = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.FEET, 1);
        Assert.assertEquals(inch,feet,0.0);
    }

    @Test
    public void givenFeet_WhenEqualThreeFeet_ShouldReturnTrue() {
        feet = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.FEET,3);
         yard = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.YARD, 1);
        Assert.assertEquals(feet,yard,0.0);
    }

   @Test
    public void givenThreeFeet_WhenEqualOneYard_ShouldReturnTrue() {
        feet = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.FEET, 3);
        yard=quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.YARD,1);
        Assert.assertEquals(yard,feet,0.0);
    }

    @Test
    public void givenOneFeet_WhenNotEqualToOneYard_ShouldReturnTrue() {
        feet = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.FEET, 1);
        yard = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.YARD, 1);
        Assert.assertNotEquals(yard,feet,0.0);
    }

    @Test
    public void givenOneInch_WhenNotEqualOneYard_ShouldReturnTrue() {
        inch = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.INCH, 1);
        yard = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.YARD, 1);
        Assert.assertNotEquals(inch,yard,0.0);
    }

    @Test
    public void givenOneYard_WhenEqualThirtySixInch_ShouldReturnTrue() {
        yard = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.YARD, 1);
        inch = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.INCH, 36);
        Assert.assertEquals(inch,yard,0.0);
    }

    @Test
    public void givenThirtySixInch_WhenEqualOneYard_ShouldReturnTrue() {
        yard = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.YARD, 1);
        inch = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.INCH, 36);
        Assert.assertEquals(inch,yard,0.0);
    }

}
