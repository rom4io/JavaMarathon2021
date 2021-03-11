package day11.task2;

public class Magician extends Hero implements MagicAttack {
    double magicAtt;

    public Magician() {
        physAtt = 5;
        magicAtt = 20;
        physDef = 0;
        magicDef = 0.8;
    }

    @Override
    public void magicalAttack(Hero hero) {
        double helh = hero.getHealth() - this.magicAtt * (1 - hero.getMagicDef());
        if (helh < MIN_HEALTH) hero.setHealth(MIN_HEALTH);
        else hero.setHealth(helh);
    }
}
