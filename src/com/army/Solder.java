package com.army;

public class Solder {

    public static int countOfSolders = 0;

    public Solder() {
        countOfSolders ++;
    }

    public void paintGrass ()
    {
        System.out.println("Крашу траву ...");
    }

    public void cleanWeapons ()
    {
        System.out.println("Чищу оружие!");
    }
}
