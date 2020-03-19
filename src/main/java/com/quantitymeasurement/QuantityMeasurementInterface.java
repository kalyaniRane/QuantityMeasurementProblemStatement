package com.quantitymeasurement;

@FunctionalInterface
public interface QuantityMeasurementInterface {

    double unitConversion(UnitType unitType, double quantity);

    default double addition(double quantity1, double quantity2) {
        return quantity1+quantity2;
    }
}
