package com.epam.mjc.stage0;

public class Animal {
    private String colour;
    private int numberOfPaws;
    private boolean hasFur;

    public static void main(String[] args) {
        Dog jack =new Dog();
        System.out.println(jack.getDescription());
        Bird kesha = new Bird();
        System.out.println(kesha.getDescription());
    }

    public Animal(String colour, int numberOfPaws, boolean hasFur) {
        this.colour = colour;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription(){
        String hasFur = (this.hasFur) ? " a ": " no ";
        String paw = (this.numberOfPaws>1)? " paws":" paw";
        return "This animal is mostly " + this.colour + " It has "+ this.numberOfPaws + paw +" and" + hasFur + "fur.";
    }
}

