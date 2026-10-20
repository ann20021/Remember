package com.army.commanders;

import com.army.Sergeant;

public class Lieutenant extends Sergeant {
    public static int countOfLieutenants = 0;

    public Lieutenant() {
        countOfLieutenants++;
        countOfSergeants --;
    }

    @Override
    public void scoldSubordinates() {
        super.scoldSubordinates();
        System.out.println("Наругал " + countOfSergeants + " сержантов");
    }

    public void makePlan ()
    {
        System.out.println("Составляю план!");
    }
}
