package model;

import java.util.ArrayList;
import java.util.List;

public class ConditionCage implements Condition{

    List<Species> e = new ArrayList<>();

    @Override
    public List<Species> isAvailableFor() {
        return this.e;
    }
    
    public void setE(Species e) {
        this.e.add(e);
    }

    public void removeE(Species e) {
        this.e.remove(e);
    }
}
