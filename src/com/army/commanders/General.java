package com.army.commanders;

public class General extends Polkovnik {
    public static int countOfGenerals = 0;

    public General() {
        countOfGenerals ++;
        countOfPolkovniks --;
    }

    @Override
    public void scoldSubordinates() {
        super.scoldSubordinates();
        System.out.println("Наругал " + countOfPolkovniks + " полковников");
    }

    public void sleep ()
    {
        System.out.println("Я отдыхаю!");
    }
}
