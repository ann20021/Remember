package com.figures;

public class Rectangle extends Figure {

    private double width;

    private double heigh;

    public Rectangle(double width, double heigh) {
        if (isNegative(width)||isNegative(heigh)) {
            return;
        }
        this.width = width;
        this.heigh = heigh;
    }

    @Override
    public double calculateArea() {
        return width * heigh;
    }
}
