package kz.maratbekovaidar.Skills.PhysicalSkills;

import kz.maratbekovaidar.Skills.PhysicalSkill;

public class SharpnessKnife extends PhysicalSkill {
    public void useSkill(int HP, int magical_damage, int physical_damage) {
        super.useSkill(HP, magical_damage, physical_damage);
    }

    @Override
    public void attackSkill(double HP, double physical_damage) {
        super.attackSkill(HP, physical_damage);
        System.out.println("Sharpness damage per second: " + super.physical_damage  * 0.3 + " in " + physical_damage * 0.05 + " second! Total: " + (super.magical_damage  * 0.3 ) * (magical_damage * 0.05));
    }
}
