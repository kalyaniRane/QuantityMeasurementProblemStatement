package com.quantitymeasurement;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QuantityMeasurementTest {

    QuantityMeasurement quantityMeasurement;
    double inch, length1, length2,feet,yard,centimeter,volume1,volume2,gallon,litre,millilitre,weight1,weight2,kilograms,grams,tonne;

    @Before
    public void setUp() throws Exception {
        quantityMeasurement = new QuantityMeasurement();
    }

    // Test Cases for Feet to Inch Conversion

    @Test
    public void givenZeroFeet_WhenEqualZeroFeet_ShouldReturnEqual() {
        length1 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.FEET, 0);
        length2 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.FEET, 0);
        Assert.assertEquals(length1,length2,0.0);
    }

    @Test
    public void givenZeroFeet_WhenNotEqualToOneFeet_ShouldReturnFalse() {
        length1 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.FEET, 0);
        length2 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.FEET, 1);
        Assert.assertNotEquals(length1,length2,0.0);
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
        length1 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.FEET, 2.2);
        length2 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.FEET, 2.2);
        Assert.assertEquals(length1,length2,0.0);
    }

    //Test Case For Inch To Feet Conversion

    @Test
    public void givenZeroInch_WhenEqualToZeroInch_ShouldReturnTrue() {
        length1 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.INCH, 0);
        length2 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.INCH, 0);
        Assert.assertEquals(length1, length2,0.0);
    }

    @Test
    public void givenZeroInch_WhenNotEqualToOneInch_ShouldReturnFalse() {
        length1 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.INCH, 0);
        length2 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.INCH, 1);
        Assert.assertNotEquals(length1, length2,0.0);
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
        length1 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.INCH,1.1);
        length2 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.INCH, 1.1);
        Assert.assertEquals(length1, length2,0.0);
    }

    @Test
    public void givenFeetAndInch_WhenBothAreZero_ShouldReturnEqual() {
        inch = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.FEET,0.0);
        feet = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.INCH, 0.0);
        Assert.assertEquals(inch, feet,0.0);
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
        length1 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.YARD, 0);
        length2 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.YARD, 0);
        Assert.assertEquals(length1,length2,0.0);
    }

    @Test
    public void givenZeroYard_WhenNotEqualZeroYard_ShouldReturnFalse() {
        length1 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.YARD, 0);
        length2 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.YARD, 1);
        Assert.assertNotEquals(length1,length2,0.0);
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
        length1 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.CENTIMETER, 0);
        length2 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.CENTIMETER, 0);
        Assert.assertEquals(length1,length2,0.0);
    }

    @Test
    public void givenZeroCentimeter_WhenNotEqualToOneCentimeter_ShouldReturnFalse() {
        length1 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.CENTIMETER, 0);
        length2 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.CENTIMETER, 1);
        Assert.assertNotEquals(length1,length2,0.0);
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

    @Test
    public void givenTwoInchAndTwoInch_WhenEqualFourInches_ShouldReturnTrue() {
        length1 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.INCH, 2);
        length2 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.INCH, 2);
        inch = length1 + length2;
        Assert.assertEquals(4,inch,0.0);
    }

    @Test
    public void givenOneFeetAndTwoInch_WhenEqualFourteenInches_ShouldReturnTrue() {
        feet = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.FEET, 1);
        inch = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.INCH, 2);
        inch = feet+inch;
        Assert.assertEquals(14,inch,0.0);
    }

    @Test
    public void givenOneFeetAndOneFeet_WhenEqualTwentyFourInches_ShouldReturnTrue() {
        length1 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.FEET, 1);
        length2 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.FEET, 1);
        inch = length1+length2;
        Assert.assertEquals(24,inch,0.0);
    }

    @Test
    public void givenTwoInchAndTwoAndHalfCentimeter_WhenEqualThreeInches_ShouldReturnTrue() {
        inch = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.INCH, 2);
        centimeter = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.CENTIMETER, 2.5);
        inch = inch+centimeter;
        Assert.assertEquals(3,inch,0.0);
    }

    //Test Cases For Gallon To Litre And Liter To Millilitre Conversion

    @Test
    public void givenZeroGallon_WhenEqualToZeroGallon_ShouldReturnEqual() {
        volume1 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.GALLON, 0);
        volume2 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.GALLON, 0);
        Assert.assertEquals(volume1,volume2,0.0);
    }

    @Test
    public void givenZeroGallon_WhenNotEqualToOneGallon_ShouldReturnFalse() {
        volume1 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.GALLON, 0);
        volume2 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.GALLON, 1);
        Assert.assertNotEquals(volume1,volume2,0.0);
    }

    @Test
    public void givenGallonNull_WhenEqual_ShouldReturnTrue() {
        boolean nullCheck = quantityMeasurement.equals(null);
        Assert.assertEquals(true,nullCheck);
    }

    @Test
    public void givenZeroLitre_WhenEqualToZeroLitre_ShouldReturnEqual() {
        volume1 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.LITRE, 0);
        volume2 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.LITRE, 0);
        Assert.assertEquals(volume1,volume2,0.0);
    }

    @Test
    public void givenZeroLitre_WhenNotEqualToOneLitre_ShouldReturnFalse() {
        volume1 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.LITRE, 0);
        volume2 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.LITRE, 1);
        Assert.assertNotEquals(volume1,volume2,0.0);
    }

    @Test
    public void givenLitreNull_WhenEqual_ShouldReturnTrue() {
        boolean nullCheck = quantityMeasurement.equals(null);
        Assert.assertEquals(true,nullCheck);
    }

    @Test
    public void givenZeroMillilitre_WhenEqualToZeroMillilitre_ShouldReturnEqual() {
        volume1 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.MILLILITRE, 0);
        volume2 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.MILLILITRE, 0);
        Assert.assertEquals(volume1,volume2,0.0);
    }

    @Test
    public void givenZeroMillilitre_WhenNotEqualToOneMillilitre_ShouldReturnFalse() {
        volume1 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.MILLILITRE, 0);
        volume2 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.MILLILITRE, 1);
        Assert.assertNotEquals(volume1,volume2,0.0);
    }

    @Test
    public void givenMillilitreNull_WhenEqual_ShouldReturnTrue() {
        boolean nullCheck = quantityMeasurement.equals(null);
        Assert.assertEquals(true,nullCheck);
    }

    @Test
    public void givenOneGallon_WhenEqualThreePointSeventyEightLitres_ShouldReturnTrue() {
        gallon = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.GALLON, 1);
        litre = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.LITRE, 3.785);
        Assert.assertEquals(litre,gallon,0.0);
    }

    @Test
    public void givenOneLitre_WhenEqualThousandMillilitre_ShouldReturnTrue() {
        litre = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.LITRE, 1);
        millilitre = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.MILLILITRE, 1000);
        Assert.assertEquals(millilitre,litre,0.0);
    }

    @Test
    public void givenOneGallonAndThreePointSeventyEightLitres_WhenEqualSevenPointFiftySevenLitres_ShouldReturnTrue() {
        gallon = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.GALLON, 1);
        litre = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.LITRE, 3.785);
        litre=gallon+litre;
        Assert.assertEquals(7.57,litre,0.0);
    }

    @Test
    public void givenOneLitreAndThousandMillilitre_WhenEqualTwoLitres_ShouldReturnTrue() {
        litre = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.LITRE, 1);
        millilitre = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.MILLILITRE, 1000);
        litre=litre+millilitre;
        Assert.assertEquals(2,litre,0.0);
    }

    @Test
    public void givenZeroKilogram_WhenEqualToZeroKilograms_ShouldReturnTrue() {
        weight1 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.KILOGRAMS, 0);
        weight2 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.KILOGRAMS, 0);
        Assert.assertEquals(weight1,weight2,0.0);
    }

    @Test
    public void givenZeroKilogram_WhenNotEqualToOneKilograms_ShouldReturnTrue() {
        weight1 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.KILOGRAMS, 0);
        weight2 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.KILOGRAMS, 1);
        Assert.assertNotEquals(weight1,weight2,0.0);
    }

    @Test
    public void givenKilogramNull_WhenNull_ShouldReturnTrue() {
        boolean nullCheck = quantityMeasurement.equals(null);
        Assert.assertTrue(nullCheck);
    }

    @Test
    public void givenZeroGram_WhenEqualToZeroGrams_ShouldReturnTrue() {
        weight1 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.GRAMS, 0);
        weight2 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.GRAMS, 0);
        Assert.assertEquals(weight1,weight2,0.0);
    }

    @Test
    public void givenZeroGram_WhenNotEqualToOneGrams_ShouldReturnTrue() {
        weight1 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.GRAMS, 0);
        weight2 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.GRAMS, 1);
        Assert.assertNotEquals(weight1,weight2,0.0);
    }

    @Test
    public void givenGramNull_WhenNull_ShouldReturnTrue() {
        boolean nullCheck = quantityMeasurement.equals(null);
        Assert.assertTrue(nullCheck);
    }

    @Test
    public void givenZeroTonne_WhenEqualToZeroTonne_ShouldReturnTrue() {
        weight1 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.TONNE, 0);
        weight2 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.TONNE, 0);
        Assert.assertEquals(weight1,weight2,0.0);
    }

    @Test
    public void givenZeroTonne_WhenNotEqualToOneGTonne_ShouldReturnTrue() {
        weight1 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.TONNE, 0);
        weight2 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.TONNE, 1);
        Assert.assertNotEquals(weight1,weight2,0.0);
    }

    @Test
    public void givenTonneNull_WhenNull_ShouldReturnTrue() {
        boolean nullCheck = quantityMeasurement.equals(null);
        Assert.assertTrue(nullCheck);
    }

    @Test
    public void givenOneKilogram_WhenEqualToThousandGrams_ShouldReturnTrue() {
        kilograms = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.KILOGRAMS, 1);
        grams = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.GRAMS, 1000);
        Assert.assertEquals(grams,kilograms,0.0);
    }

    @Test
    public void givenOneTonne_WhenEqualToThousandKilograms_ShouldReturnTrue() {
        tonne = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.TONNE, 1);
        kilograms = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.KILOGRAMS, 1000.0);
        Assert.assertEquals(tonne,kilograms,0.0);
    }

    @Test
    public void givenOneTonneAndThousandGrams_WhenEqualToThousandAndOneKilograms_ShouldReturnTrue() {
        tonne = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.TONNE, 1);
        grams = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.GRAMS, 1000.0);
        kilograms=tonne+grams;
        Assert.assertEquals(1001,kilograms,0.0);
    }

}
