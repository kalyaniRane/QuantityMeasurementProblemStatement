package com.quantitymeasurement;

public enum UnitType {
    FEET(12.0), INCH(1.0), YARD(36.0), CENTIMETER(1/2.5),
    GALLON(3.785), LITRE(1.0), MILLILITRE(1/1000.0), KILOGRAMS(1.0),GRAMS(1/1000.0),TONNE(1000.0),
    FAHRENHEIT(1.0), CELSIUS(9/5.0);

    public Double type;
    UnitType(Double type) {
        this.type=type;
    }

    double getType() {
        return type;
    }
}

