package com.quantitymeasurement;


public class QuantityMeasurement implements IQuantityMeasurement {

    public double value;

    @Override
    public double unitConversion(UnitType unitType, double value) {

        if(unitType==UnitType.CELSIUS) {
            return value*unitType.getType()+32;
        }
        return value*unitType.getType();
    }


    @Override
    public boolean equals(Object unitObject) {
        if (this == unitObject)
            return true;
        if (unitObject == null )
            return false;
        if(this.getClass() == unitObject.getClass())
            return true;
        QuantityMeasurement that = (QuantityMeasurement) unitObject;
        return this.compare(that.value, value);
    }


    public boolean compare(double value1, double value2) {
        return Double.compare(value1,value2)==0;
    }
}
