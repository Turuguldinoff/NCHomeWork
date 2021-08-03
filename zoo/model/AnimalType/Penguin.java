package model.AnimalType;

import model.Animal;
import model.Species;

public class Penguin implements Animal{
    String name;

    public Penguin(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Species getSpecies() {
        return Species.PENGUIN;
    }
    
}
