package com.quantitymeasurement;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QuantityMeasurementTest {

    QuantityMeasurement quantityMeasurement;
    double length1, length2, volume1, volume2, weight1, weight2, temperature1, temperature2,result;

    @Before
    public void setUp() {
        quantityMeasurement = new QuantityMeasurement();
    }

    // Test Cases for Feet to Inch Conversion
    @Test
    public void givenZeroFeet_WhenEqualZeroFeet_ShouldReturnEqual() {
        length1 = quantityMeasurement.unitConversion(UnitType.FEET, 0);
        length2 = quantityMeasurement.unitConversion(UnitType.FEET, 0);
        Assert.assertEquals(length1,length2,0.0);
    }

    @Test
    public void givenZeroFeet_WhenNotEqualToOneFeet_ShouldReturnFalse() {
        length1 = quantityMeasurement.unitConversion(UnitType.FEET, 0);
        length2 = quantityMeasurement.unitConversion(UnitType.FEET, 1);
        Assert.assertNotEquals(length1,length2,0.0);
    }

    @Test
    public void givenFeetNull_WhenEqual_ShouldReturnTrue() {
        boolean nullCheck = quantityMeasurement.equals(null);
        Assert.assertEquals(false,nullCheck);
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
        length1 = quantityMeasurement.unitConversion(UnitType.FEET, 2.2);
        length2 = quantityMeasurement.unitConversion(UnitType.FEET, 2.2);
        Assert.assertEquals(length1,length2,0.0);
    }

    //Test Case For Inch To Feet Conversion
    @Test
    public void givenZeroInch_WhenEqualToZeroInch_ShouldReturnTrue() {
        length1 = quantityMeasurement.unitConversion(UnitType.INCH, 0);
        length2 = quantityMeasurement.unitConversion(UnitType.INCH, 0);
        Assert.assertEquals(length1, length2,0.0);
    }

    @Test
    public void givenZeroInch_WhenNotEqualToOneInch_ShouldReturnFalse() {
        length1 = quantityMeasurement.unitConversion(UnitType.INCH, 0);
        length2 = quantityMeasurement.unitConversion(UnitType.INCH, 1);
        Assert.assertNotEquals(length1, length2,0.0);
    }

    @Test
    public void givenInchNull_WhenEqual_ShouldReturnTrue() {
        boolean nullCheck = quantityMeasurement.equals(null);
        Assert.assertEquals(false,nullCheck);
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
        length1 = quantityMeasurement.unitConversion(UnitType.INCH,1.1);
        length2 = quantityMeasurement.unitConversion(UnitType.INCH, 1.1);
        Assert.assertEquals(length1, length2,0.0);
    }

    @Test
    public void givenFeetAndInch_WhenBothAreZero_ShouldReturnEqual() {
        length1 = quantityMeasurement.unitConversion(UnitType.FEET,0.0);
        length2 = quantityMeasurement.unitConversion(UnitType.INCH, 0.0);
        Assert.assertEquals(length1, length2,0.0);
    }

    @Test
    public void givenOneFeet_WhenNotEqualOneInch_ShouldReturnTrue() {
        length1 = quantityMeasurement.unitConversion(UnitType.FEET,1);
        length2 = quantityMeasurement.unitConversion(UnitType.INCH,1);
        Assert.assertNotEquals(length1,length2,0.0);
    }

    @Test
    public void givenOneInch_WhenNotEqualOneFeet_ShouldReturnTrue() {
        length1 = quantityMeasurement.unitConversion(UnitType.INCH,1);
        length2 = quantityMeasurement.unitConversion(UnitType.FEET, 1);
        Assert.assertNotEquals(length1,length2,0.0);
    }

    @Test
    public void givenOneFeet_WhenEqualTwelveInch_ShouldReturnTrue() {
        length1 = quantityMeasurement.unitConversion(UnitType.FEET,1);
        length2 = quantityMeasurement.unitConversion(UnitType.INCH,12);
        Assert.assertEquals(length1,length2,0.0);
    }

    @Test
    public void givenTwelveInch_WhenEqualOneFeet_ShouldReturnTrue() {
        length1 = quantityMeasurement.unitConversion(UnitType.INCH,12);
        length2 = quantityMeasurement.unitConversion(UnitType.FEET, 1);
        Assert.assertEquals(length1,length2,0.0);
    }

    // Test Cases for Feet To Yard , Yard To Inch Conversion
    @Test
    public void givenZeroYard_WhenEqualZeroYard_ShouldReturnEqual() {
        length1 = quantityMeasurement.unitConversion(UnitType.YARD, 0);
        length2 = quantityMeasurement.unitConversion(UnitType.YARD, 0);
        Assert.assertEquals(length1,length2,0.0);
    }

    @Test
    public void givenZeroYard_WhenNotEqualZeroYard_ShouldReturnFalse() {
        length1 = quantityMeasurement.unitConversion(UnitType.YARD, 0);
        length2 = quantityMeasurement.unitConversion(UnitType.YARD, 1);
        Assert.assertNotEquals(length1,length2,0.0);
    }

    @Test
    public void givenYardNull_WhenEqual_ShouldReturnTrue() {
        boolean nullCheck = quantityMeasurement.equals(null);
        Assert.assertEquals(false,nullCheck);
    }

    @Test
    public void givenFeet_WhenEqualThreeFeet_ShouldReturnTrue() {
        length1 = quantityMeasurement.unitConversion(UnitType.FEET,3);
        length2 = quantityMeasurement.unitConversion(UnitType.YARD, 1);
        Assert.assertEquals(length1,length2,0.0);
    }

   @Test
    public void givenThreeFeet_WhenEqualOneYard_ShouldReturnTrue() {
        length1 = quantityMeasurement.unitConversion(UnitType.FEET, 3);
        length2 = quantityMeasurement.unitConversion(UnitType.YARD,1);
        Assert.assertEquals(length1,length2,0.0);
    }

    @Test
    public void givenOneFeet_WhenNotEqualToOneYard_ShouldReturnTrue() {
        length1 = quantityMeasurement.unitConversion(UnitType.FEET, 1);
        length2 = quantityMeasurement.unitConversion(UnitType.YARD, 1);
        Assert.assertNotEquals(length1,length2,0.0);
    }

    @Test
    public void givenOneInch_WhenNotEqualOneYard_ShouldReturnTrue() {
        length1 = quantityMeasurement.unitConversion(UnitType.INCH, 1);
        length2 = quantityMeasurement.unitConversion(UnitType.YARD, 1);
        Assert.assertNotEquals(length1,length2,0.0);
    }

    @Test
    public void givenOneYard_WhenEqualThirtySixInch_ShouldReturnTrue() {
        length1 = quantityMeasurement.unitConversion(UnitType.YARD, 1);
        length2 = quantityMeasurement.unitConversion(UnitType.INCH, 36);
        Assert.assertEquals(length1,length2,0.0);
    }

    @Test
    public void givenThirtySixInch_WhenEqualOneYard_ShouldReturnTrue() {
        length1 = quantityMeasurement.unitConversion(UnitType.YARD, 1);
        length2 = quantityMeasurement.unitConversion(UnitType.INCH, 36);
        Assert.assertEquals(length1,length2,0.0);
    }

    //Test Case For Inch To Centimeter Conversion
    @Test
    public void givenZeroCentimeter_WhenEqualToZeroCentimeter_ShouldReturnEqual() {
        length1 = quantityMeasurement.unitConversion(UnitType.CENTIMETER, 0);
        length2 = quantityMeasurement.unitConversion(UnitType.CENTIMETER, 0);
        Assert.assertEquals(length1,length2,0.0);
    }

    @Test
    public void givenZeroCentimeter_WhenNotEqualToOneCentimeter_ShouldReturnFalse() {
        length1 = quantityMeasurement.unitConversion(UnitType.CENTIMETER, 0);
        length2 = quantityMeasurement.unitConversion(UnitType.CENTIMETER, 1);
        Assert.assertNotEquals(length1,length2,0.0);
    }

    @Test
    public void givenCentimeterNull_WhenEqual_ShouldReturnTrue() {
        boolean nullCheck = quantityMeasurement.equals(null);
        Assert.assertEquals(false,nullCheck);
    }

   @Test
    public void givenTwoInch_WhenEqualFiveCentimeter_ShouldReturnTrue() {
        length1 = quantityMeasurement.unitConversion(UnitType.INCH, 2);
        length2 = quantityMeasurement.unitConversion(UnitType.CENTIMETER, 5);
        Assert.assertEquals(length1,length2,0.0);
    }

    @Test
    public void givenTwoInchAndTwoInch_WhenEqualFourInches_ShouldReturnTrue() {
        length1 = quantityMeasurement.unitConversion(UnitType.INCH, 2);
        length2 = quantityMeasurement.unitConversion(UnitType.INCH, 2);
        result = quantityMeasurement.addition(length1, length2);
        Assert.assertEquals(4,result,0.0);
    }

    @Test
    public void givenOneFeetAndTwoInch_WhenEqualFourteenInches_ShouldReturnTrue() {
        length1 = quantityMeasurement.unitConversion(UnitType.FEET, 1);
        length2 = quantityMeasurement.unitConversion(UnitType.INCH, 2);
        result = quantityMeasurement.addition(length1, length2);
        Assert.assertEquals(14,result,0.0);
    }

    @Test
    public void givenOneFeetAndOneFeet_WhenEqualTwentyFourInches_ShouldReturnTrue() {
        length1 = quantityMeasurement.unitConversion(UnitType.FEET, 1);
        length2 = quantityMeasurement.unitConversion(UnitType.FEET, 1);
        result = quantityMeasurement.addition(length1, length2);
        Assert.assertEquals(24,result,0.0);
    }

    @Test
    public void givenTwoInchAndTwoAndHalfCentimeter_WhenEqualThreeInches_ShouldReturnTrue() {
        length1 = quantityMeasurement.unitConversion(UnitType.INCH, 2);
        length2 = quantityMeasurement.unitConversion(UnitType.CENTIMETER, 2.5);
        result = quantityMeasurement.addition(length1, length2);
        Assert.assertEquals(3,result,0.0);
    }

    //Test Cases For Gallon To Litre And Liter To Millilitre Conversion
    @Test
    public void givenZeroGallon_WhenEqualToZeroGallon_ShouldReturnEqual() {
        volume1 = quantityMeasurement.unitConversion(UnitType.GALLON, 0);
        volume2 = quantityMeasurement.unitConversion(UnitType.GALLON, 0);
        Assert.assertEquals(volume1,volume2,0.0);
    }

    @Test
    public void givenZeroGallon_WhenNotEqualToOneGallon_ShouldReturnFalse() {
        volume1 = quantityMeasurement.unitConversion(UnitType.GALLON, 0);
        volume2 = quantityMeasurement.unitConversion(UnitType.GALLON, 1);
        Assert.assertNotEquals(volume1,volume2,0.0);
    }

    @Test
    public void givenGallonNull_WhenEqual_ShouldReturnTrue() {
        boolean nullCheck = quantityMeasurement.equals(null);
        Assert.assertEquals(false,nullCheck);
    }

    @Test
    public void givenZeroLitre_WhenEqualToZeroLitre_ShouldReturnEqual() {
        volume1 = quantityMeasurement.unitConversion(UnitType.LITRE, 0);
        volume2 = quantityMeasurement.unitConversion(UnitType.LITRE, 0);
        Assert.assertEquals(volume1,volume2,0.0);
    }

    @Test
    public void givenZeroLitre_WhenNotEqualToOneLitre_ShouldReturnFalse() {
        volume1 = quantityMeasurement.unitConversion(UnitType.LITRE, 0);
        volume2 = quantityMeasurement.unitConversion(UnitType.LITRE, 1);
        Assert.assertNotEquals(volume1,volume2,0.0);
    }

    @Test
    public void givenLitreNull_WhenEqual_ShouldReturnTrue() {
        boolean nullCheck = quantityMeasurement.equals(null);
        Assert.assertEquals(false,nullCheck);
    }

    @Test
    public void givenZeroMillilitre_WhenEqualToZeroMillilitre_ShouldReturnEqual() {
        volume1 = quantityMeasurement.unitConversion(UnitType.MILLILITRE, 0);
        volume2 = quantityMeasurement.unitConversion(UnitType.MILLILITRE, 0);
        Assert.assertEquals(volume1,volume2,0.0);
    }

    @Test
    public void givenZeroMillilitre_WhenNotEqualToOneMillilitre_ShouldReturnFalse() {
        volume1 = quantityMeasurement.unitConversion(UnitType.MILLILITRE, 0);
        volume2 = quantityMeasurement.unitConversion(UnitType.MILLILITRE, 1);
        Assert.assertNotEquals(volume1,volume2,0.0);
    }

    @Test
    public void givenMillilitreNull_WhenEqual_ShouldReturnTrue() {
        boolean nullCheck = quantityMeasurement.equals(null);
        Assert.assertEquals(false,nullCheck);
    }

    @Test
    public void givenOneGallon_WhenEqualThreePointSeventyEightLitres_ShouldReturnTrue() {
        volume1 = quantityMeasurement.unitConversion(UnitType.GALLON, 1);
        volume2 = quantityMeasurement.unitConversion(UnitType.LITRE, 3.785);
        Assert.assertEquals(volume1,volume2,0.0);
    }

    @Test
    public void givenOneLitre_WhenEqualThousandMillilitre_ShouldReturnTrue() {
        volume1 = quantityMeasurement.unitConversion(UnitType.LITRE, 1);
        volume2 = quantityMeasurement.unitConversion(UnitType.MILLILITRE, 1000);
        Assert.assertEquals(volume1,volume2,0.0);
    }

    @Test
    public void givenOneGallonAndThreePointSeventyEightLitres_WhenEqualSevenPointFiftySevenLitres_ShouldReturnTrue() {
        volume1 = quantityMeasurement.unitConversion(UnitType.GALLON, 1);
        volume2 = quantityMeasurement.unitConversion(UnitType.LITRE, 3.785);
        result = quantityMeasurement.addition(volume1, volume2);
        Assert.assertEquals(7.57,result,0.0);
    }

    @Test
    public void givenOneLitreAndThousandMillilitre_WhenEqualTwoLitres_ShouldReturnTrue() {
        volume1 = quantityMeasurement.unitConversion(UnitType.LITRE, 1);
        volume2 = quantityMeasurement.unitConversion(UnitType.MILLILITRE, 1000);
        result = quantityMeasurement.addition(volume1, volume2);
        Assert.assertEquals(2,result,0.0);
    }

    @Test
    public void givenZeroKilogram_WhenEqualToZeroKilograms_ShouldReturnTrue() {
        weight1 = quantityMeasurement.unitConversion(UnitType.KILOGRAMS, 0);
        weight2 = quantityMeasurement.unitConversion(UnitType.KILOGRAMS, 0);
        Assert.assertEquals(weight1,weight2,0.0);
    }

    @Test
    public void givenZeroKilogram_WhenNotEqualToOneKilograms_ShouldReturnTrue() {
        weight1 = quantityMeasurement.unitConversion(UnitType.KILOGRAMS, 0);
        weight2 = quantityMeasurement.unitConversion(UnitType.KILOGRAMS, 1);
        Assert.assertNotEquals(weight1,weight2,0.0);
    }

    @Test
    public void givenKilogramNull_WhenNull_ShouldReturnTrue() {
        boolean nullCheck = quantityMeasurement.equals(null);
        Assert.assertFalse(nullCheck);
    }

    @Test
    public void givenZeroGram_WhenEqualToZeroGrams_ShouldReturnTrue() {
        weight1 = quantityMeasurement.unitConversion(UnitType.GRAMS, 0);
        weight2 = quantityMeasurement.unitConversion(UnitType.GRAMS, 0);
        Assert.assertEquals(weight1,weight2,0.0);
    }

    @Test
    public void givenZeroGram_WhenNotEqualToOneGrams_ShouldReturnTrue() {
        weight1 = quantityMeasurement.unitConversion(UnitType.GRAMS, 0);
        weight2 = quantityMeasurement.unitConversion(UnitType.GRAMS, 1);
        Assert.assertNotEquals(weight1,weight2,0.0);
    }

    @Test
    public void givenGramNull_WhenNull_ShouldReturnTrue() {
        boolean nullCheck = quantityMeasurement.equals(null);
        Assert.assertFalse(nullCheck);
    }

    @Test
    public void givenZeroTonne_WhenEqualToZeroTonne_ShouldReturnTrue() {
        weight1 = quantityMeasurement.unitConversion(UnitType.TONNE, 0);
        weight2 = quantityMeasurement.unitConversion(UnitType.TONNE, 0);
        Assert.assertEquals(weight1,weight2,0.0);
    }

    @Test
    public void givenZeroTonne_WhenNotEqualToOneGTonne_ShouldReturnTrue() {
        weight1 = quantityMeasurement.unitConversion(UnitType.TONNE, 0);
        weight2 = quantityMeasurement.unitConversion(UnitType.TONNE, 1);
        Assert.assertNotEquals(weight1,weight2,0.0);
    }

    @Test
    public void givenTonneNull_WhenNull_ShouldReturnTrue() {
        boolean nullCheck = quantityMeasurement.equals(null);
        Assert.assertFalse(nullCheck);
    }

    @Test
    public void givenOneKilogram_WhenEqualToThousandGrams_ShouldReturnTrue() {
        weight1 = quantityMeasurement.unitConversion(UnitType.KILOGRAMS, 1);
        weight2 = quantityMeasurement.unitConversion(UnitType.GRAMS, 1000);
        Assert.assertEquals(weight1,weight2,0.0);
    }

    @Test
    public void givenOneTonne_WhenEqualToThousandKilograms_ShouldReturnTrue() {
        weight1 = quantityMeasurement.unitConversion(UnitType.TONNE, 1);
        weight2 = quantityMeasurement.unitConversion(UnitType.KILOGRAMS, 1000.0);
        Assert.assertEquals(weight1,weight2,0.0);
    }

    @Test
    public void givenOneTonneAndThousandGrams_WhenEqualToThousandAndOneKilograms_ShouldReturnTrue() {
        weight1 = quantityMeasurement.unitConversion(UnitType.TONNE, 1);
        weight2 = quantityMeasurement.unitConversion(UnitType.GRAMS, 1000.0);
        result = quantityMeasurement.addition(weight1, weight2);
        Assert.assertEquals(1001,result,0.0);
    }

    //Test case for Temprature Conversion
    @Test
    public void givenZeroFahrenheit_WhenEqualToZeroFahrenheit_ShouldReturnTrue() {
        temperature1 = quantityMeasurement.unitConversion(UnitType.FAHRENHEIT, 0);
        temperature2 = quantityMeasurement.unitConversion(UnitType.FAHRENHEIT, 0);
        Assert.assertEquals(temperature1, temperature2,0.0);
    }

    @Test
    public void givenZeroFahrenheit_WhenNotEqualToOneFahrenheit_ShouldReturnTrue() {
        temperature1 = quantityMeasurement.unitConversion(UnitType.FAHRENHEIT, 0);
        temperature2 = quantityMeasurement.unitConversion(UnitType.FAHRENHEIT, 1);
        Assert.assertNotEquals(temperature1, temperature2,0.0);
    }

    @Test
    public void givenFahrenheitNull_WhenNull_ShouldReturnTrue() {
        boolean nullCheck = quantityMeasurement.equals(null);
        Assert.assertFalse(nullCheck);
    }

    @Test
    public void givenZeroCelsius_WhenEqualToZeroCelsius_ShouldReturnTrue() {
        temperature1 = quantityMeasurement.unitConversion(UnitType.CELSIUS, 0);
        temperature2 = quantityMeasurement.unitConversion(UnitType.CELSIUS, 0);
        Assert.assertEquals(temperature1, temperature2,0.0);
    }

    @Test
    public void givenZeroCelsius_WhenNotEqualToOneCelsius_ShouldReturnTrue() {
        temperature1 = quantityMeasurement.unitConversion(UnitType.CELSIUS, 0);
        temperature2 = quantityMeasurement.unitConversion(UnitType.CELSIUS, 1);
        Assert.assertNotEquals(temperature1, temperature2,0.0);
    }

    @Test
    public void givenCelsiusNull_WhenNull_ShouldReturnTrue() {
        boolean nullCheck = quantityMeasurement.equals(null);
        Assert.assertFalse(nullCheck);
    }

    @Test
    public void givenTemperatureInFahrenheit_ShouldReturnTemperatureInCelsius() {
        temperature1 = quantityMeasurement.unitConversion(UnitType.FAHRENHEIT, 212);
        temperature2 = quantityMeasurement.unitConversion(UnitType.CELSIUS,100);
        Assert.assertEquals(temperature1, temperature2,0.0);
    }

}