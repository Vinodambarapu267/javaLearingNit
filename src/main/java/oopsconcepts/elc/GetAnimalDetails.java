package oopsconcepts.elc;

import oopsconcepts.blc.Animal;

public class GetAnimalDetails {
    public static void main(String[] args) {
        Animal lion = new Animal();
        Animal cat = new Animal();
        lion.setWildAnimal();
        lion.getWildAnimal();
        cat.setDomesticAnimal();
        cat.getDomesticAnimal();
    }
}
