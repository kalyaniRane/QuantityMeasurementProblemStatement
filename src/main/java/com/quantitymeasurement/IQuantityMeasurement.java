package com.quantitymeasurement;

@FunctionalInterface
public interface IQuantityMeasurement {

    double unitConversion(UnitType unitType, double value);

    default double addition(double quantity1, double quantity2) {
        return quantity1+quantity2;
    }
}
