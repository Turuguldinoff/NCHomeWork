package model.CageAnimal;

import model.Cage;
import model.Condition;
import model.ConditionCage;

public class CageBilder implements Cage{

    private int number;
    private double area;
    private Condition condition = new ConditionCage();
    private boolean vacant = true;

    public CageBilder(int number, double area) {
        this.number = number;
        this.area = area;
    }
    
    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public void setVacant(boolean vacant) {
        this.vacant = vacant;
    }

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public Condition getCondition() {
        return condition;
    }

    @Override
    public boolean isVacantCage() {
        return vacant;
    }

    
}
