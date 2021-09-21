package kz.maratbekovaidar.Skills.MagicalSkills;

import kz.maratbekovaidar.Skills.MagicSkill;

public class PoisonSkill extends MagicSkill {
    @Override
    public void useSkill(int HP, int magical_damage, int physical_damage) {
        super.useSkill(HP, magical_damage, physical_damage);
    }

    @Override
    public void attackSkill(int HP, double magical_damage) {
        super.attackSkill(HP, magical_damage);
        System.out.println("Poison damage per second: " + super.magical_damage  * 0.3 + " in " + magical_damage * 0.1 + " second! Total: " + (super.magical_damage  * 0.3 ) * (magical_damage * 0.1));
    }
}
