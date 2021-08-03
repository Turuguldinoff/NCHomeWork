import java.io.IOException;
import java.util.HashMap;

import model.Animal;
import model.Species;
import model.CageAnimal.CageBilder;

public class App {
    public static void main(String[] args) throws IOException {

        // Create Cage
        CageBilder[] listCage = new CageBilder[4];

        for (int i = 0; i < 4; i++)
            listCage[i] = new CageBilder(i, (i + 2) * 2);

        HashMap<String, Animal> map = new HashMap<>();

        ZooWorc zoo = new ZooWorc(listCage);

        AnimalFactory fac = new AnimalFactory();

        String nameAnimal;
        Species speciesAnimal = null;

        while (true) {
            String chec = Parser.name();
            String command = " ";
            if (chec.length() > 8)
                command = chec.substring(0, chec.indexOf(" "));

            if (command.equals("check-in")) {
                String type = chec.substring(chec.indexOf(" ") + 1, chec.indexOf(" ", chec.indexOf(" ") + 1))
                        .toUpperCase();
                if (type.equals("LEON")) {
                    speciesAnimal = Species.LEON;
                } else if (type.equals("GIRAFFE")) {
                    speciesAnimal = Species.GIRAFFE;
                } else if (type.equals("SQUIRREL")) {
                    speciesAnimal = Species.SQUIRREL;
                } else if (type.equals("PENGUIN")) {
                    speciesAnimal = Species.PENGUIN;
                } else {
                    System.out.println("err species");
                }

                nameAnimal = chec.substring(chec.indexOf(" ", chec.indexOf(" ") + 1) + 1, chec.length());
                map.put(nameAnimal, fac.addAnimall(nameAnimal, speciesAnimal));
                zoo.checkInAnimal(map.get(nameAnimal));
            } else if (command.equals("check-out")) {
                nameAnimal = chec.substring(chec.indexOf(" ", chec.indexOf(" ") + 1) + 1, chec.length());
                zoo.checkOutAnimal(map.get(nameAnimal));
            } else if (chec.equals("log")) {
                zoo.getHistory();
            } else if (chec.equals("exit")) {
                zoo.exit();
                zoo = null;
                break;
            } else {
                System.out.println("err command");
            }
        }
    }

}
