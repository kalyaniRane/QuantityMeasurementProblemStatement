package com.quantitymeasurement;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QuantityMeasurementTest {

    FeetMeasurement feetMeasurement;
    InchMeasurement inchMeasurement;

    @Before
    public void setUp() throws Exception {
        feetMeasurement = new FeetMeasurement();
        inchMeasurement = new InchMeasurement();
    }

    @Test
    public void givenZeroFeet_WhenEqual_ShouldReturnTrue() {
        double feet1 = feetMeasurement.getFeet(0);
        double feet2 = feetMeasurement.getFeet(0);
        Assert.assertEquals(feet1,feet2,0.0);
    }

    @Test
    public void givenZeroFeet_WhenNotEqual_ShouldReturnFalse() {
        double feet1 = feetMeasurement.getFeet(0);
        double feet2 = feetMeasurement.getFeet(1);
        Assert.assertNotEquals(feet1,feet2,0.0);
    }

    @Test
    public void givenFeetNull_WhenEqual_ShouldReturnTrue() {
        boolean nullCheck = feetMeasurement.equals(null);
        Assert.assertEquals(true,nullCheck);
    }

    @Test
    public void givenFeetObject_WhenEqual_ShouldReturnTrue() {
        FeetMeasurement feetMeasurement1 = new FeetMeasurement();
        Assert.assertEquals(feetMeasurement,feetMeasurement1);
    }

    @Test
    public void givenType_WhenEqual_ShouldReturnTrue() {
        boolean typeCheck= feetMeasurement.equals(feetMeasurement);
        Assert.assertEquals(true,typeCheck);
    }

    @Test
    public void givenFeet_WhenEqual_ShouldReturnTrue() {
        double value1 = feetMeasurement.getFeet(2.2);
        double value2 = feetMeasurement.getFeet(2.2);
        Assert.assertEquals(value1,value2,0.0);
    }

    @Test
    public void givenZeroInch_WhenEqual_ShouldReturnTrue() {
        double value1 = inchMeasurement.getInch(0);
        double value2 = inchMeasurement.getInch(0);
        Assert.assertEquals(value1,value2,0.0);
    }

    @Test
    public void givenZeroInch_WhenNotEqual_ShouldReturnFalse() {
        double value1 = inchMeasurement.getInch(0);
        double value2 = inchMeasurement.getInch(1);
        Assert.assertNotEquals(value1,value2,0.0);
    }

    @Test
    public void givenInchNull_WhenEqual_ShouldReturnTrue() {
        boolean nullCheck = inchMeasurement.equals(null);
        Assert.assertEquals(true,nullCheck);
    }

    @Test
    public void givenInchObject_WhenEqual_ShouldReturnTrue() {
        InchMeasurement inchMeasurement1 = new InchMeasurement();
        Assert.assertEquals(inchMeasurement,inchMeasurement1);
    }

    @Test
    public void givenInchClass_WhenEqual_ShouldReturnTrue() {
        boolean typeCheck= inchMeasurement.equals(inchMeasurement);
        Assert.assertEquals(true,typeCheck);
    }

    @Test
    public void givenInch_WhenEqual_ShouldReturnTrue() {
        double value1 = inchMeasurement.getInch(1.1);
        double value2 = inchMeasurement.getInch(1.1);
        Assert.assertEquals(value1,value2,0.0);
    }

}
