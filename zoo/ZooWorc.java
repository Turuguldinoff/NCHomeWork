import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import model.Animal;
import model.ConditionCage;
import model.CageAnimal.CageBilder;

public class ZooWorc implements Zoo {

    HashMap<String, Integer> mapCage = new HashMap<>();
    HashMap<String, InhibitionLog> mapLog = new HashMap<>();

    private CageBilder[] listCage;

    Loading l;

    public ZooWorc(CageBilder[] listCage) throws IOException {
        this.listCage = listCage;
        this.l = new Loading();
    }

    @Override
    public void checkInAnimal(Animal animal) {
        if (mapCage.size() == 0) {
            inAnimal(animal);
        } else {
            if (!mapCage.containsKey(animal.getName())) {
                inAnimal(animal);
            } else {
                System.out.println("name use");
            }
        }
    }

    @Override
    public void checkOutAnimal(Animal animal) {
        if (mapCage.size() == 0) {
            System.out.println("animas not");
        } else {
            if (!mapCage.containsKey(animal.getName())) {
                System.out.println("animas with name not");
            } else {
                outAnimal(animal);
            }
        }
    }

    @Override
    public List<InhibitionLog> getHistory() {
        List<InhibitionLog> a;
        try {
            a = this.l.pullLog();
            return a;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;

    }

    public void exit() {
        this.l.deleteLog();
    }

    public void inAnimal(Animal animal) {
        int i = 0;
        for (CageBilder cages : listCage) {
            if (cages.getCondition().isAvailableFor().size() == 0
                    || (cages.isVacantCage() && cages.getCondition().isAvailableFor().get(0) == animal.getSpecies())) {
                try {
                    ConditionCage c = new ConditionCage();
                    c.setE(animal.getSpecies());
                    cages.setCondition(c);
                    cages.setVacant(false);
                    mapCage.put(animal.getName(), cages.getNumber());
                    InhibitionLog log = new InhibitionLog(new Date(), null, animal.getSpecies(), animal.getName());
                    mapLog.put(animal.getName(), log);
                    this.l.inLog(log);
                    System.out.println("animal add " + animal.getName());
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            } else {
                i++;
            }
        }
        if (i == 3) {
            System.out.println("not cage");
        }

    }

    public void outAnimal(Animal animal) {
        ConditionCage c = new ConditionCage();
        c.removeE(animal.getSpecies());
        this.listCage[mapCage.get(animal.getName())].setCondition(c);
        this.listCage[mapCage.get(animal.getName())].setVacant(true);
        mapCage.remove(animal.getName());
        mapLog.get(animal.getName()).setCheckOutDate(new Date());
        try {
            this.l.inLog(mapLog.get(animal.getName()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        animal = null;
        System.out.println("animas outche");

    }
}
