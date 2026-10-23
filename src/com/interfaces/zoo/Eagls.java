package com.interfaces.zoo;

public class Eagls extends Animals implements Flyable, Runable{
    @Override
    public void getInfo() {
        System.out.println("Я орёл! Квик квик(?) ");
    }

    @Override
    public void fly() {

    }

    @Override
    public void run() {

    }
}
