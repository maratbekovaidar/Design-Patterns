package kz.maratbekovaidar;

public abstract class Hero {

    SkillBehavior skillBehavior;

    protected int HP;
    protected int magic_damage;
    protected int physical_damage;
    protected String name;

    public abstract void attack();

    public Hero() {
    }

    public Hero(int HP, int magic_damage, int physical_damage, String name) {
        this.HP = HP;
        this.magic_damage = magic_damage;
        this.physical_damage = physical_damage;
        this.name = name;
    }

    public Hero(SkillBehavior skillBehavior) {
        this.skillBehavior = skillBehavior;
    }

    public void performSkill(SkillBehavior skillBehavior) {
        this.skillBehavior = skillBehavior;
        skillBehavior.useSkill(this.HP, this.magic_damage, this.physical_damage);
    }






}
