package com.figures;

public class Circle extends Figure{

    private double radius;

    public Circle(double radius) {
        if (isNegative(radius)) {
            return;
        }
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return radius * radius * Math.PI;
    }
}
