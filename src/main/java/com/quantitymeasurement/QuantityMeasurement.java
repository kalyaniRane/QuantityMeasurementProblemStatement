package com.quantitymeasurement;


public class QuantityMeasurement implements QuantityMeasurementInterface {

    @Override
    public double unitConversion(UnitType unitType, double quantity) {

        if(unitType==UnitType.CELSIUS) {
            return quantity *unitType.getType()+32;
        }
        return quantity *unitType.getType();
    }

    @Override
    public boolean equals(Object unitObject) {
        if (this == unitObject)
            return true;
        if (unitObject == null )
            return false;
        if(this.getClass() == unitObject.getClass())
            return true;
        return false;
    }

}
