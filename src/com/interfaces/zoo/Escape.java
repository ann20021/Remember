package com.interfaces.zoo;

import java.util.Scanner;

public class Escape {

    public static void main(String[] args){

        Animals [] animals = {
                new Ducks(),
                new Eagls(),
                new Giraffes(),
                new Hippopotamuses(),
                new Sharks()
        };
        System.out.println("Перекличка: ");
        for (int i = 0; i < animals.length; i++){
            animals[i].getInfo();

        }

        System.out.println();
        System.out.println("Сбежали из зоопарка: ");

        for (int i = 0; i < animals.length; i++){
            /*
            if (animals[i] instanceof Flyable){
                animals[i] .getInfo();
              Вынесла в метод isFlyable
              */
            if ((isFlyable(animals[i])) || ((isRunable(animals[i]))&&(isSwimable(animals[i])))){
                animals[i].getInfo();
                System.out.println("Я сбежал!");
                System.out.println();
            }
        }

    }


    private static boolean isFlyable(Animals animals){
        //instanceof - реализован ли интерфейс
        return animals instanceof Flyable;
    }

    private static boolean isRunable(Animals animals){
        return animals instanceof Runable;
    }

    private static boolean isSwimable(Animals animals){
        return animals instanceof Swimable;
    }
}
