package kz.maratbekovaidar.Skills;

import kz.maratbekovaidar.SkillBehavior;

public class PhysicalSkill implements SkillBehavior {

    protected double HP;
    protected double magical_damage;
    protected double physical_damage;

    @Override
    public void useSkill(int HP, int magical_damage, int physical_damage) {
        this.HP = HP * 1.2;
        this.magical_damage = magical_damage * 1.5;
        this.physical_damage = physical_damage * 0.1;

        attackSkill(this.HP, this.magical_damage);
    }

    public void attackSkill(double HP, double magical_damage) {
    }
}
