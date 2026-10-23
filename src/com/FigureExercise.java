package com;

import com.figures.Circle;
import com.figures.Figure;
import com.figures.Rectangle;
import com.figures.Triangle;

import java.util.concurrent.ThreadLocalRandom;

public class FigureExercise {

    public static void main (String[] args) {

        Figure[] figures = getFigures();

        double maxArea = figures[0].calculateArea();

        for (int i = 1; i< figures.length; i++){
            double area = figures[i].calculateArea();
            if (area > maxArea) {
                maxArea = area;
            }
            System.out.println("Площадь " + i +"й фигуры = " + area);
        }

        System.out.println("Максимальная площадь фигуры = " + maxArea);
    }

    private static Figure[] getFigures(){
        //Массив фигур
        Figure[] figures = new Figure[300];

        for (int i = 0; i < 100; i++)
        {
            //В ячейку массива фигур кладем(создаем) объект класса прямоугольник
            figures [i] = new Rectangle(getRandomPositivNumber(), getRandomPositivNumber());
        }

        for (int i = 100; i < 200; i++)
        {
            //В ячейку массива фигур кладем(создаем) объект класса прямоугольник
            figures [i] = new Circle(getRandomNumber());
        }

        for (int i = 200; i < 300; i++)
        {
            //В ячейку массива фигур кладем(создаем) объект класса прямоугольник
            figures [i] = new Triangle(getRandomNumber(), getRandomNumber());
        }

        return figures;
    }

    //Метод эксперимент, если один из параметров отрицательный
    private static double getRandomNumber(){
        return getRandomNumber(-100, 100);
    }

    private static double getRandomPositivNumber(){
        return getRandomNumber(0, 100);
    }

    private static double getRandomNumber(double min, double max){
        /*Случайное число в диапазоне от 0 до 100
         ThreadLocalRandom.current().nextDouble(0, 100);
         */
        return ThreadLocalRandom.current().nextDouble(min, max);
    }
}
