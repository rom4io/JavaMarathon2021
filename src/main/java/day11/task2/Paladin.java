package day11.task2;

public class Paladin extends Hero implements Healer{
    private double healHimself;
    private double healTeammate;

    public Paladin(){
        physAtt = 15;
        physDef =  0.5;
        magicDef = 0.2;
        healHimself = 25;
        healTeammate = 10;
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
}
