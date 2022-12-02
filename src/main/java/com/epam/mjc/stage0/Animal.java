package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;
//
//    public static void main(String[] args) {
//        Dog jack =new Dog();
//        jack.setColour("brawn");
//        jack.setNumberOfPaws(4);
//        jack.setHasFur(true);
//        System.out.println(jack.getDescription());
//        Bird kesha = new Bird();
//        kesha.setColour("blue");
//        kesha.setNumberOfPaws(2);
//        kesha.setHasFur(false);
//        System.out.println(kesha.getDescription());
//    }

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
        return "This animal is mostly " + this.color + ". It has "+ this.numberOfPaws + paw +" and" + hasFur + "fur.";
    }
}

