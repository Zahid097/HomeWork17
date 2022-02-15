package com.company;

public class Main {

    public static void main(String[] args) {

        Animal shark = new Shark(1500, "Green", true);
        Animal eagle = new Eagle(16, "Black", 300);
        Animal turtle = new Turtle(75, "Brown", 50);

        Animal[] animals = {turtle, eagle, shark};

        for (Animal s : animals) {
            if (s instanceof Shark) {
                ((Shark) s).attack();
            }
            if (s.getClass().getName().equals("com.company.Shark")) {
                ((Shark) s).attack();
            }

            if (s instanceof Turtle) {
                ((Turtle) s).swim();
            }
            if (s.getClass().getName().equals("com.company.Turtle")) {
                ((Turtle) s).swim();
            }
            if (s instanceof Eagle) {
                ((Eagle) s).fly();
            }
            if (s.getClass().getName().equals("com.company.Eagle")) {
                ((Eagle) s).fly();
            }
            System.out.println();
        }
        Animal[] reptile = {animals[0]};
        Animal[] fish = {animals[1]};
        Animal[] bird = {animals[2]};
    }
}
