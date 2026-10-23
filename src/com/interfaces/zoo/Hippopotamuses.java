package com.interfaces.zoo;

public class Hippopotamuses extends Animals implements Runable, Swimable {
    @Override
    public void getInfo() {
        System.out.println("Я бегемот! И я сплю");
    }

    @Override
    public void run() {

    }

    @Override
    public void swim() {

    }
}
