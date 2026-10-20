package com.army;

public class Sergeant extends Solder {
    public static int countOfSergeants = 0;

    public Sergeant() {
    countOfSergeants ++;
    countOfSolders --;
    }

    public void scoldSubordinates ()
    {
        System.out.println("Наругал " + countOfSolders + " солдат");
    }

    public void giveCommands ()
    {
        System.out.println("Даю команду! Иди чисти оружие!");
    }
}
