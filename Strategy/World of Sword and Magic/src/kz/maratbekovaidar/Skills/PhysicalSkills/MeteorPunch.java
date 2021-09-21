package kz.maratbekovaidar.Skills.PhysicalSkills;

import kz.maratbekovaidar.Skills.PhysicalSkill;

public class MeteorPunch extends PhysicalSkill {

    public void useSkill(int HP, int magical_damage, int physical_damage) {
        super.useSkill(HP, magical_damage, physical_damage);
    }

    @Override
    public void attackSkill(double HP, double physical_damage) {
        super.attackSkill(HP, physical_damage);
        System.out.println("One punch damage: " + physical_damage * 3);
    }
}
