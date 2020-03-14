package com.quantitymeasurement;

public class InchMeasurement {

    @Override
    public boolean equals(Object inchObject) {
        if (this == inchObject)
            return true;
        if (inchObject == null)
            return true;
        if (this.getClass() == inchObject.getClass())
            return true;
        return false;
    }

    public double getInch(double inch) {
        return inch;
    }
}
