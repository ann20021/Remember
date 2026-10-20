package com.army;

import com.army.commanders.General;
import com.army.commanders.Lieutenant;
import com.army.commanders.Polkovnik;
import com.army.commanders.Prapor;

public class Slujba {

    public static void main (String[] args)
    {
        Solder solder1 = new Solder();
        Solder solder2 = new Solder();
        Solder solder3 = new Solder();
        Solder solder4 = new Solder();
        Solder solder5 = new Solder();
        Solder solder6 = new Solder();
        Solder solder7 = new Solder();
        Solder solder8 = new Solder();
        Solder solder9 = new Solder();
        Solder solder10 = new Solder();

        Sergeant sergeant1 = new Sergeant();
        Sergeant sergeant2 = new Sergeant();
        Sergeant sergeant3 = new Sergeant();
        Sergeant sergeant4 = new Sergeant();
        Sergeant sergeant5 = new Sergeant();

        Lieutenant lieutenant1 = new Lieutenant();
        Lieutenant lieutenant2 = new Lieutenant();
        Lieutenant lieutenant3 = new Lieutenant();

        Polkovnik polkovnik1 = new Polkovnik();
        Polkovnik polkovnik2 = new Polkovnik();

        General general1 = new General();

        System.out.println("Я солдат и я: ");
        solder1.paintGrass();
        solder2.cleanWeapons();
        System.out.println();

        System.out.println("Я сержант и я: ");
        sergeant2.scoldSubordinates();
        sergeant4.giveCommands();
        System.out.println();

        System.out.println("Я лейтенант и я: ");
        lieutenant3.scoldSubordinates();
        lieutenant1.makePlan();
        System.out.println();

        System.out.println("Я полковник и я: ");
        polkovnik1.scoldSubordinates();
        polkovnik2.makeDocuments();
        System.out.println();

        System.out.println("Я генерал и я: ");
        general1.scoldSubordinates();
        general1.sleep();
        general1.paintGrass();
        general1.cleanWeapons();
        general1.giveCommands();
        general1.makeDocuments();
        general1.makePlan();
        System.out.println();

        Prapor prapor = new Prapor();
        System.out.println("Я прапорщик и я: ");
        prapor.scoldSubordinates();
        prapor.getBedLinen();
        prapor.paintGrass();
        prapor.cleanWeapons();
        prapor.giveCommands();


    }


}
