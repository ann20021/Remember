package com.cats;

public class CatsFight {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Мурзик", 3, 10, 5);
        Cat cat2 = new Cat("Пушок", 3, 7, 9);
        Cat cat3 = new Cat("Веник", 5, 5, 5);
        Cat cat4 = new Cat("Фантик", 7, 5, 2);
        Cat cat5 = new Cat("Кузя", 2, 10, 7);

        Cat[] cats = {cat1, cat2, cat3, cat4, cat5};

        Cat winnerCat = fight(cats);
        System.out.println("Победил кот " + winnerCat.name + " с уровнем = " + winnerCat.steepnesslevel);
        winnerCat.bestFriend = cat5;
        winnerCat.bestFriend.getInfo();

    }

    static Cat fight(Cat[] cats) {
        Cat winnerCat = cats[0];

        for (int i = 1; i < cats.length; i++) {
            if (cats[i].steepnesslevel > winnerCat.steepnesslevel)
            {winnerCat = cats[i];}
        }


        return winnerCat;
    }

}