package com.army.commanders;

public class Polkovnik extends Lieutenant {
    public static int countOfPolkovniks = 0;

    public Polkovnik() {
        countOfPolkovniks ++;
        countOfLieutenants --;
    }

    @Override
    public void scoldSubordinates() {
        super.scoldSubordinates();
        System.out.println("Наругал " + countOfLieutenants + " лейтинантов");
    }

    public void makeDocuments ()
    {
        System.out.println("Пишу отчет!");
    }
}
