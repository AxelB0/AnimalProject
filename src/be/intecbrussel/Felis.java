package be.intecbrussel;

import java.util.Objects;

public abstract class Felis extends Animal {

    private static int vaccinationCount;
    private String name;
    private int age;
    private int shelterNo;
    private int badgeNo;

    {
        if (isAlive()) {
            vaccinationCount++;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getShelterNo() {
        return shelterNo;
    }

    public int getBadgeNo() {
        return badgeNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setShelterNo(int shelterNo) {
        if (Math.abs(shelterNo) < 1000) {
            this.shelterNo = Math.abs(shelterNo);
        } else {
            System.out.println("ShelterNo cannot be higher than 999!\nShelterNo remains unchanged.");
        }
    }

    public void setBadgeNo(int badgeNo) {
        if (Math.abs(badgeNo) < 1000) {
            this.badgeNo = Math.abs(badgeNo);
        } else {
            System.out.println("BadgeNo cannot be higher than 999!\nBadgeNo remains unchanged.");
        }
    }

    public void miauw() {
        System.out.println("Miauw!");

    }

    public void miauw(int times) {
        for (int index = 0; index < times; index++) {
            miauw();
        }

    }

    public static int getNoOfVaccinatedCats() {
        return vaccinationCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Felis felis = (Felis) o;
        return shelterNo == felis.shelterNo && badgeNo == felis.badgeNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(shelterNo, badgeNo);
    }
}
