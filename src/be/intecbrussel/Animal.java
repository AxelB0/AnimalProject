package be.intecbrussel;

public abstract class Animal {

    protected static int animalCount;
    private char size;
    private char coat;
    private String colour;
    private double weight;

    {
        animalCount++;
    }

    public char getSize() {
        return size;
    }

    public char getCoat() {
        return coat;
    }

    public String getColour() {
        return colour;
    }

    public double getWeight() {
        return weight;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public void setCoat(char coat) {
        this.coat = coat;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void makeNoise(String sound) {

    }

    public void eat() {

    }

    public void sleep() {

    }

    public boolean isAlive() {
        return true;
    }

    public static int getAnimalCount() {
        return animalCount;
    }
}
