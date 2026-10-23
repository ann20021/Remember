package com.interfaces.zoo;

public class Giraffes extends Animals implements Runable {
    @Override
    public void getInfo() {
        System.out.println("Я жираф! И я ем ");
    }

    @Override
    public void run() {

    }
}
