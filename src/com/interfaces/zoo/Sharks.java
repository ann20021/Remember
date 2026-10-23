package com.interfaces.zoo;

public class Sharks extends Animals implements Swimable{
    @Override
    public void getInfo() {
        System.out.println("Я акула! И я чую кровь ");
    }

    @Override
    public void swim() {

    }
}
