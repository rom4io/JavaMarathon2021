package day11.task2;

public class Shaman extends Hero implements MagicAttack, Healer{
    double magicAtt;
    double healHimself;
    double healTeammate;

    public Shaman(){
        physAtt = 10;
        magicAtt = 15;
        physDef = 0.2;
        magicDef = 0.2;
        healHimself = 50;
        healTeammate = 30;
    }

    @Override
    public void healHimself() {
        double helh = this.health + this.healHimself;
        if (helh>MAX_HEALTH) this.health = MAX_HEALTH;
        else this.health = helh;
    }

    @Override
    public void healTeammate(Hero hero) {
        double helh = hero.getHealth()+this.healTeammate;
        if (helh>MAX_HEALTH) hero.setHealth(helh);
        else hero.setHealth(helh);
    }

    @Override
    public void magicalAttack(Hero hero) {
        double helh = hero.getHealth() - this.magicAtt * (1 - hero.getMagicDef());
        if (helh < MIN_HEALTH) hero.setHealth(MIN_HEALTH);
        else hero.setHealth(helh);
    }
}
