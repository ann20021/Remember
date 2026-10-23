package com.figures;

public class Figure {

    public double calculateArea ()
    {
        return 0;
    }

    //обезопасим классы, чтобы не было отрицательных площадей фигур
    public boolean isNegative(double num){
        return num < 0;
    }
}
