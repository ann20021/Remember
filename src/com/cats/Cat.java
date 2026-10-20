package com.cats;

public class Cat {
    String name;
    int mind;
    int strenght;
    int agility;
    int steepnesslevel;
    Cat bestFriend;

    public Cat(String name, int mind, int strenght, int agility) {
        this.name = name;
        this.mind = mind;
        this.strenght = strenght;
        this.agility = agility;
        this.steepnesslevel = (strenght + agility) * mind;
    }

    void getInfo ()
    {
        System.out.println("И его лучший друг " + name + ", а его уровень = " + steepnesslevel);
    }
}



