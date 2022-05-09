package be.intecbrussel;

import java.util.Scanner;

public class CatApp {
    public static void main(String[] args) {

        AndeanMountainCat amc = new AndeanMountainCat();
        NorwegianForestCat nfc = new NorwegianForestCat();
        PersianCat pc = new PersianCat();
        SiameseCat sc = new SiameseCat();
        TurkishVanCat tvc = new TurkishVanCat();
        PersianCat pc2 = new PersianCat();
        SiameseCat sc2 = new SiameseCat();

        System.out.println("We currently count " + Animal.getAnimalCount() + " animals.\nThere are " + Felis.getNoOfVaccinatedCats() + " vaccinated cats.");

        Felis[] catArray = new Felis[]{amc, nfc, pc, sc, tvc, pc2, sc2};

        for (Felis f : catArray) {
            System.out.println(f.toString());
        }

        sc.setName("GenericCatName");
        sc.setShelterNo(420);
        sc.setBadgeNo(69);

        pc.setName("VerySpecialCatName");
        pc.setShelterNo(420);
        pc.setBadgeNo(69);

        System.out.println(sc.equals(pc));

        System.out.println("Please give my Persian cat a new shelterNo. (0-999)");
        Scanner keyboardReader = new Scanner(System.in);
        pc.setShelterNo(keyboardReader.nextInt());

        System.out.println("ShelterNo is " + pc.getShelterNo() +".");


    }
}
