package com.quantitymeasurement;

public class QuantityMeasurement {

    public enum UnitType {
        FEET(1*12.0), INCH(1.0), YARD(1*36.0),CENTIMETER(1/2.5);

        public Double type;
        UnitType(Double type){
            this.type=type;
        }

        double getType(){
            return type;
        }
    }

    public double unitConversion(UnitType unitType, double value) {

        return value*unitType.getType();
    }

    @Override
    public boolean equals(Object unitObject) {
        if (this == unitObject)
            return true;
        if (unitObject == null )
            return true;
        if(this.getClass() == unitObject.getClass())
            return true;
        return false;
    }

}
