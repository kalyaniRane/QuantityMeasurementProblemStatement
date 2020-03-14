package com.quantitymeasurement;

public class FeetMeasurement {

    @Override
    public boolean equals(Object feetObject) {
        if (this == feetObject)
            return true;
        if (feetObject == null )
            return true;
        if(this.getClass() == feetObject.getClass())
            return true;
        return false;
    }

    public double getFeet(double feet) {
        return feet;
    }
}
