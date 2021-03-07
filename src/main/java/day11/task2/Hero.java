package day11.task2;

public abstract class Hero implements PhysAttack {
    static final int MIN_HEALTH = 0;
    static final int MAX_HEALTH = 100;
    double health;
    double physAtt;
    double physDef;
    double magicDef;

    public Hero() {
        health = 100;
    }

    @Override
    public void physicalAttack(Hero hero) {
        double helh = hero.getHealth() - this.physAtt * (1 - hero.getPhysDef());
        if (helh < MIN_HEALTH) hero.setHealth(MIN_HEALTH);
        else hero.setHealth(helh);
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getPhysDef() {
        return physDef;
    }

    public double getMagicDef() {
        return magicDef;
    }

    public String toString() {
        return "Здоровье: " + this.health;
    }
}
