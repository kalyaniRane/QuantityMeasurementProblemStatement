package com.quantitymeasurement;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QuantityMeasurementTest {

    QuantityMeasurement quantityMeasurement;
    double inch,inch1,inch2,feet,feet1,feet2,yard,yard1,yard2,centimeter,centimeter1,centimeter2;

    @Before
    public void setUp() throws Exception {
        quantityMeasurement = new QuantityMeasurement();
    }

// Test Cases for Feet to Inch Conversion

    @Test
    public void givenZeroFeet_WhenEqualZeroFeet_ShouldReturnEqual() {
        feet1 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.FEET, 0);
        feet2 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.FEET, 0);
        Assert.assertEquals(feet1,feet2,0.0);
    }

    @Test
    public void givenZeroFeet_WhenNotEqualToOneFeet_ShouldReturnFalse() {
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
    public void givenFeetReference_WhenEqual_ShouldReturnTrue() {
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

    //Test Case For Inch To Feet Conversion

    @Test
    public void givenZeroInch_WhenEqualToZeroInch_ShouldReturnTrue() {
        inch1 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.INCH, 0);
        inch2 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.INCH, 0);
        Assert.assertEquals(inch1,inch2,0.0);
    }

    @Test
    public void givenZeroInch_WhenNotEqualToOneInch_ShouldReturnFalse() {
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
    public void givenInchReference_WhenEqual_ShouldReturnTrue() {
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement();
        Assert.assertEquals(this.quantityMeasurement,quantityMeasurement1);
    }

    @Test
    public void givenInchType_WhenEqual_ShouldReturnTrue() {
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
    public void givenFeetAndInch_WhenBothAreZero_ShouldReturnEqual() {
        inch = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.FEET,0.0);
        feet = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.INCH, 0.0);
        Assert.assertEquals(feet1,inch1,0.0);
    }

    @Test
    public void givenOneFeet_WhenNotEqualOneInch_ShouldReturnTrue() {
        feet = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.FEET,1);
        inch = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.INCH,1);
        Assert.assertNotEquals(inch,feet,0.0);
    }

    @Test
    public void givenOneInch_WhenNotEqualOneFeet_ShouldReturnTrue() {
        inch = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.INCH,1);
        feet = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.FEET, 1);
        Assert.assertNotEquals(feet,inch,0.0);
    }

    @Test
    public void givenOneFeet_WhenEqualTwelveInch_ShouldReturnTrue() {
        feet = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.FEET,1);
        inch = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.INCH,12);
        Assert.assertEquals(inch,feet,0.0);
    }

    @Test
    public void givenTwelveInch_WhenEqualOneFeet_ShouldReturnTrue() {
        inch = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.INCH,12);
        feet = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.FEET, 1);
        Assert.assertEquals(inch,feet,0.0);
    }

    // Test Cases for Feet To Yard , Yard To Inch Conversion

    @Test
    public void givenZeroYard_WhenEqualZeroYard_ShouldReturnEqual() {
        yard1 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.YARD, 0);
        yard2 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.YARD, 0);
        Assert.assertEquals(yard1,yard2,0.0);
    }

    @Test
    public void givenZeroYard_WhenNotEqualZeroYard_ShouldReturnFalse() {
        yard1 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.YARD, 0);
        yard2 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.YARD, 1);
        Assert.assertNotEquals(yard1,yard2,0.0);
    }

    @Test
    public void givenYardNull_WhenEqual_ShouldReturnTrue() {
        boolean nullCheck = quantityMeasurement.equals(null);
        Assert.assertEquals(true,nullCheck);
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

    //Test Case For Inch To Centimeter Conversion

    @Test
    public void givenZeroCentimeter_WhenEqualToZeroCentimeter_ShouldReturnEqual() {
        centimeter1 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.CENTIMETER, 0);
        centimeter2 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.CENTIMETER, 0);
        Assert.assertEquals(centimeter1,centimeter2,0.0);
    }

    @Test
    public void givenZeroCentimeter_WhenNotEqualToOneCentimeter_ShouldReturnFalse() {
        centimeter1 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.CENTIMETER, 0);
        centimeter2 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.CENTIMETER, 1);
        Assert.assertNotEquals(centimeter1,centimeter2,0.0);
    }

    @Test
    public void givenCentimeterNull_WhenEqual_ShouldReturnTrue() {
        boolean nullCheck = quantityMeasurement.equals(null);
        Assert.assertEquals(true,nullCheck);
    }

    @Test
    public void givenTwoInch_WhenEqualFiveCentimeter_ShouldReturnTrue() {
        inch = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.INCH, 2);
        centimeter = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.CENTIMETER, 5);
        Assert.assertEquals(inch,centimeter,0.0);
    }

}
