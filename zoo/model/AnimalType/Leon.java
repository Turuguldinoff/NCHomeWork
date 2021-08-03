package model.AnimalType;

import model.Animal;
import model.Species;

public class Leon implements Animal{

    String name;

    public Leon(String name) {
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
        return Species.LEON;
    }
    
}
