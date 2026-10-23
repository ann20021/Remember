package com.interfaces.zoo;

public class Ducks extends Animals implements Flyable, Swimable, Runable{


    @Override
    public void getInfo() {
        System.out.println("Я утка! Кря-кря");
    }

    @Override
    public void fly() {

    }

    @Override
    public void run() {

    }

    @Override
    public void swim() {

    }
}
