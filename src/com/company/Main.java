package com.company;

public class Main {

    public static void main(String[] args) {
        Cow cow1 = new Cow(150.0, 3, "female", "Mumu");
        Cow cow2 = new Cow(170.0, 5, "male", "Loki");
        Cow cow3 = new Cow(160.0, 3, "female", "Doki");
        Cow cow4 = new Cow(140.0, 2, "female", "Miki");
        Cow cow5 = new Cow(180.0, 4, "male", "Dodi");

        Cow[] cows1 = {cow1, cow2, cow3, cow4, cow5};
        Cow[] cows2 = {cow1};

        Sheep sheep1 = new Sheep(55.0, 2, "male", "Kuzu");
        Sheep sheep2 = new Sheep(45.0, 1, "female", "Kozi");
        Sheep sheep3 = new Sheep(60.0, 3, "male", "Bozi");

        Sheep[] sheeps1 = {sheep1, sheep2, sheep3};
        Sheep[] sheeps2 = {sheep1};

        Horse horse1 = new Horse(180.0, 2, "female", "Akkula", "White");
        Horse horse2 = new Horse(250.0, 3, "male", "Taigan", "Black");

        Horse[] horses1 = {horse1, horse2};
        Horse[] horses2 = {horse1};

        Farm farm1 = new Farm("Urmat", "Suusamyr", cows1, sheeps1, horses1);
        Farm farm2 = new Farm("Ulan", "Talas", cows2, sheeps2, horses2);

        System.out.println("Farm1" + "\n" + farm1);
        System.out.println();
        System.out.println("Farm2" + "\n" + farm2);
    }
}
