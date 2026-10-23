package com.figures;

public class Triangle extends Figure{

    private double base;
    private double height;

    public Triangle(double base, double height) {
        if (isNegative(base)||isNegative(height)){
            return;
        }
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (base * height)/2;
    }
}
