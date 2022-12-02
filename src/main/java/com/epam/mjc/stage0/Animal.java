package com.epam.mjc.stage0;

public class Animal {
    private String colour;
    private int numberOfPaws;
    private boolean hasFur;

    public static void main(String[] args) {
        Dog jack =new Dog();
        jack.setColour("brawn");
        jack.setNumberOfPaws(4);
        jack.setHasFur(true);
        System.out.println(jack.getDescription());
        Bird kesha = new Bird();
        kesha.setColour("blue");
        kesha.setNumberOfPaws(2);
        kesha.setHasFur(false);
        System.out.println(kesha.getDescription());
    }

    public Animal() {

    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getNumberOfPaws() {
        return numberOfPaws;
    }

    public void setNumberOfPaws(int numberOfPaws) {
        this.numberOfPaws = numberOfPaws;
    }

    public boolean isHasFur() {
        return hasFur;
    }

    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }

    public String getDescription(){
        String hasFur = (this.hasFur) ? " a ": " no ";
        String paw = (this.numberOfPaws>1)? " paws":" paw";
        return "This animal is mostly " + this.colour + ". It has "+ this.numberOfPaws + paw +" and" + hasFur + "fur.";
    }
}

