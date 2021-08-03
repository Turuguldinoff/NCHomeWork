import model.Animal;
import model.Species;
import model.AnimalType.Giraffe;
import model.AnimalType.Leon;
import model.AnimalType.Penguin;
import model.AnimalType.Squirrel;

public class AnimalFactory {
    public Animal addAnimall (String name,Species type) {
        Animal animal = null;

        switch (type) {
            case LEON:
                animal = new Leon(name);
                break;
            case GIRAFFE:
                animal = new Giraffe(name);
                break;
            case SQUIRREL:
                animal = new Squirrel(name);
                break;
            case PENGUIN:
                animal = new Penguin(name);
                break;

        }

        return animal;
    }
}