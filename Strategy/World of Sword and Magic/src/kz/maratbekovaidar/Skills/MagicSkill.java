package kz.maratbekovaidar.Skills;

import kz.maratbekovaidar.Hero;
import kz.maratbekovaidar.SkillBehavior;

public class MagicSkill implements SkillBehavior {
    protected int HP;
    protected double magical_damage;
    protected double physical_damage;

    @Override
    public void useSkill(int HP, int magical_damage, int physical_damage) {
        this.HP = HP;
        this.magical_damage = magical_damage * 1.2;
        this.physical_damage = physical_damage * 0.2;

        attackSkill(this.HP, this.magical_damage);
    }

    public void attackSkill(int HP, double magical_damage) {
    }
}
